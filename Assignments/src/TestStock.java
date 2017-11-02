
public class TestStock {

	public static void main(String[] args) {
		Stock stock0 = new Stock("ORCL","Oracle Corporation",34.5,34.35);
		
		System.out.print(stock0.name + "'s symbol is " + stock0.symbol + ".");
		System.out.print("The previous price was " + stock0.previousClosingPrice + " and the current price is " + stock0.currentPrice + ".");
		System.out.print("The change in stock value is " + stock0.getChangePercent() + " percent.");
	}

} // End public class TestStock

class Stock {
	
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
	
} // End class Stock