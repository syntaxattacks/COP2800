// Import tools
import java.util.Scanner;

public class InputMismatchException {

	// Main Method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean finished = false;
		
		// Prompt for user input
		System.out.println("Please enter two numbers");
		
		// Use boolean to control, while numbers are not present the loop will continue
		while (!finished) {
			
			// try to get integer values from the scanner input
			try {
				

				int num1 = input.nextInt();
				int num2 = input.nextInt();
				
				// Display sum of the two numbers
				System.out.println("The sum of the two numbers is " + (num1 + num2));
				
				// Set boolean flag to break the loop
				finished = true;
		
			} // End try
		
			// If errors are present the program will dump here
			catch (Exception ex) {
			System.out.println("A whole number was not entered. Please try again.");
			
			// This will take more input from the user
			input.nextLine();
			} // End catch
		
		} // End While Loop
		
		// Close Scanner
		input.close();
		
	} // End Main

	
	
} // End InputMismatchException
