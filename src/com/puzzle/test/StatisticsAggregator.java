package com.puzzle.test;

public interface StatisticsAggregator {
	
	// Price feed will call this method when new price is received. This is input to your class. 
	public void putNewPrice(String symbol, double price); 
	
	// Report the average price of the stock symbol. 
	public double getAveragePrice(String symbol); 
	
	// Report the total number of prices received for the symbol. 
	public int getTickCount(String symbol);
}
