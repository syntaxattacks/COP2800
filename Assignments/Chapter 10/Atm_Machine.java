
public class Atm_Machine {

	private Account[] accounts = new Account[10];
	
	
	public Atm_Machine() {
		for(int count = 0; count < accounts.length; count++) {
			
			accounts[count] = new Account();
			accounts[count].setId(count);
			accounts[count].setBalance(100);
			
			} // End for
		
	} // End Atm_Machine()
	
	

	
}
