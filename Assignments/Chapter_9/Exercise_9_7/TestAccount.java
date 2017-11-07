package Exercise_9_7;

public class TestAccount {

	public static void main(String[] args) {
		
		// Create account object
		Account account1 = new Account(1122,20000);
		
		// Set interest rate
		account1.setAnnualInterestRate(4.5);
		
		// Withdraw Money
		account1.withdraw(2500);
		
		// Deposit Money
		account1.deposit(3000);
		
		// Show balance, monthly interest, and the date created
		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account1.getId());
		System.out.println("Date created: " + account1.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account1.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", 
			account1.getMonthlyInterest());

	}

}
