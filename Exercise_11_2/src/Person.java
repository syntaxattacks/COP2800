
public class Person {

	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String emailAddress;
	
	
	public Person() {
		this("Unknown","Unknown","Unknown","Unknown");
	}
	
	public Person(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	} 
	
	
	/* GETTERS */
	
	// Return Name
	public String getName(){
		return name;
	}
	
	// Return Address
	public String getAddress() {
		return address;
	}
	
	// Return Phone Number
	public String getPhone() {
		return phoneNumber;
	}

	/** Return email */
	public String getEmail() {
		return emailAddress;
	}
	/* END GETTERS */
	
	
	/* SETTERS */
	
	/** Set new name */
	public void setName(String name) {
		this.name = name;
	}

	/** Set new address */
	public void setAddress(String address) {
		this.address = address;
	}

	/** Set new phone number */
	public void setPhone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/** Set new email */
	public void setEmail(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	/* END SETTERS */
	
	//Override
	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + 
				 "\nPhone number: " + phoneNumber + "\nEmail address: " + emailAddress;
	}
	
	
}
