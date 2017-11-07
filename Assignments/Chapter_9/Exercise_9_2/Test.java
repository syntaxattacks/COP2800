package Exercise_9_2;

public class Test {
	public static void main(String[] args) {
		Stock stock0 = new Stock("ORCL","Oracle Corporation",34.5,34.35);
		
		System.out.print(stock0.name + "'s symbol is " + stock0.symbol + ".");
		System.out.print("The previous price was " + stock0.previousClosingPrice + " and the current price is " + stock0.currentPrice + ".");
		System.out.print("The change in stock value is " + stock0.getChangePercent() + " percent.");
	}

} // End public class Test

