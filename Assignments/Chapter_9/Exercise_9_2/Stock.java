package Exercise_9_2;

public class Stock {
	// Declare and initialize data fields
	private String symbol = "";
	private String name = "";
	private double previousClosingPrice = 0;
	private double currentPrice = 0;
	
	Stock(String newSymbol,String newName, double newClosePrice, double newCurrentPrice) {
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = newClosePrice;
		currentPrice = newCurrentPrice;
	} // End Stock
	
	double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice;
	} // End getChangePercent
	
	String getSymbol() {
		return symbol;
	}
	String getName() {
		return name;
	}
	double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	double getCurrentPrice() {
		return currentPrice;
	}
}
