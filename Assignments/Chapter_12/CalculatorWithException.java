public class CalculatorWithException {
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
    
    ///// EXCEPTION HANDLER /////
    try {
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
    	} // End switch
    	
    } // End try
    	
    catch(NumberFormatException ex) {
    	System.out.println("Incorrect Input, please try again.");
    
    	
    } // End catch

    // Determine the operator
    

    // Display result
    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
      + " = " + result);
  }
}