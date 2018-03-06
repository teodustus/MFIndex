package com.mycompany.mfindex;
import java.io.*;
import com.google.gson.*;

/**
 *
 * @author Teodor Greiff
 */
public class IndexDriver {

    public static void main(String[] args) {
        
        IndexDriver modularfinance = new IndexDriver();        
        modularfinance.txtToArrayInit();
    }
    
    public void txtToArrayInit(){
        String filePath = "c:/users/dell/desktop/Ny Mapp/MFDATA.txt";        
        String dataArray = usingBufferedReader(filePath);
        Data [] dArray = JsonToJavaObject(dataArray);
       largestChangeInIndex(dArray);
    }
      
        public void largestChangeInIndex (Data [] d){

            Data dLow = d[d.length-1];
            Data dHigh = d[d.length-1];
            double recentIndexChange = dHigh.getHigh()-dLow.getLow();
            double largestIndexChange= recentIndexChange;

            for(int i=d.length-2;i>1;i--){                
                if(((d[i].getHigh() > dHigh.getHigh()))){
                    dHigh = d[i];
                    dHigh.setIndexHigh(i);
                }
                if((d[i].getLow()<dLow.getLow()) && (d[i].getHigh()-d[i].getLow() > largestIndexChange)){
                    dLow = d[i];
                    dHigh=d[i];
                    dLow.setIndexLow(i);
                }
            recentIndexChange = (dHigh.getHigh())-(dLow.getLow());
            if(recentIndexChange>largestIndexChange){ largestIndexChange = recentIndexChange;
            }
        }            
                System.out.println("Köp: " +dLow.getQuoteDate() + " vid " +dLow.getLow());
                System.out.println("Sälj: " +dHigh.getQuoteDate() +" vid " +dHigh.getHigh());
                System.out.println("Detta kommer att ge positiv indexföränding med: " +largestIndexChange +" enheter.");
          }
   
    public Data[] JsonToJavaObject(String s){        
         Data [] data =  new Gson().fromJson(s, Data[].class);
         return data;
    }
    
     private static String usingBufferedReader(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
 
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();   
}
     
}
    

