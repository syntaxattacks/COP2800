package Exercise_9_2;

public class Stock {
	// Declare and initialize data fields
	String symbol = "";
	String name = "";
	double previousClosingPrice = 0;
	double currentPrice = 0;
	
	Stock(String newSymbol,String newName, double newClosePrice, double newCurrentPrice) {
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = newClosePrice;
		currentPrice = newCurrentPrice;
	} // End Stock
	
	double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice;
	} // End getChangePercent
}
