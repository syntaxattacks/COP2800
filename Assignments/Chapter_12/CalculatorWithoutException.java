public class CalculatorWithoutException {
  /** Main method */
  public static void main(String[] args) {
    
	  // Check number of strings passed
    if (args.length != 3) {
      System.out.println(
        "Usage: java Calculator operand1 operator operand2");
      System.exit(1);
    }

    // The result of the operation
    int result = 0;

//    Error Handling Without Exception
//    This will run Character.isDigit(on arguments 1 and 3 to test them, then display an error
//    if it doesn't work
//    if ( ) {
//    	System.out.println("Inforrect Input");
//    	System.exit(0);
//    }
//    if (!Character.isDigit(args[0])) {
//    	System.out.println("Inforrect Input");
//    	System.exit(0);
//    }
//    
//    if (!Character.isDigit(args.charAt(0))) {
//    	System.out.println("Inforrect Input");
//    	System.exit(0);
//    
    // Determine the operator
    switch (args[1].charAt(0)) { 
      case '+': result = Integer.parseInt(args[0]) + 
                         Integer.parseInt(args[2]);
                break;
      case '-': result = Integer.parseInt(args[0]) -
                         Integer.parseInt(args[2]);
                break;
      case '.': result = Integer.parseInt(args[0]) *
                         Integer.parseInt(args[2]);
                break;
      case '/': result = Integer.parseInt(args[0]) /
                         Integer.parseInt(args[2]);
    }

    // Display result
    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
      + " = " + result);
  }
}