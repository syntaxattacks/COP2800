package Exercise_9_7;

/********************************************************
*                     Account                           *
*-------------------------------------------------------*
* -id: int                                              *
* -balance: double                                      *
* -annualInterestRate: double                           *
* ---------------------------                           *
* -dateCreated: String                                  *
* +Account()                                            *
* +Account(newid: int, newBalance: double)              *
* +setId(newId: int)                                    *
* +setBalance(newBalance: double)                       *
* +setAnnualInterestRate(newAnnualInterestRate: double) *
* +getId(): int                                         *
* +getBalance(): double                                 *
* +getAnnualInterestRate(): double                      *
* +getDateCreated(): String                             *
* +getMonthlyInterestRate(): double                     *
* +getMonthlyInterest(): double                         *
* +withdraw(amount: double)                             *
* +deposit(amount: double)                              *
********************************************************/

import java.util.Date;


class Account {

	/* Declare and initialize data fields */
	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;
	private Date dateCreated;
	
	/* No-arg constructor */
	Account() {	
	} // End Account

	/* Constructor with ID and Balance variables included */
	Account(int newId,double newBalance) {
		
		id = newId;
		balance = newBalance;
		dateCreated = new Date();	
	} // End Account
	
	
	/* Mutator Methods */
	
	public void setId(int newId) {
		id = newId;
	} // end setId
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	
	/* Accessor Methods */
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	/* Methods */
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit (double amount){
		balance += amount;
	}
}
