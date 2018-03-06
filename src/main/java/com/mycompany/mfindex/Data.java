package com.mycompany.mfindex;
/**
 *
 * @author dell
 */
public class Data {	
		  private String quote_date; 
		  private String paper; 
		  private String exch; 
		  private double open; 
		  private double high; 
		  private double low; 
		  private double close; 
		  private int indexHigh; 
		  private int indexLow;



    public void setQuoteDate(String quoteDate) {
        this.quote_date = quoteDate;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getExch() {
        return exch;
    }

    public void setExch(String exch) {
        this.exch = exch;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }
    
    
    public String getQuoteDate() {
        return quote_date;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public int getIndexHigh() {
        return indexHigh;
    }

    public void setIndexHigh(int volume) {
        this.indexHigh = volume;
    }

    public int getIndexLow() {
        return indexLow;
    }

    public void setIndexLow(int value) {
        this.indexLow = value;
    }
                  
	
	
}

