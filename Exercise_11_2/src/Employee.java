
public class Employee
	extends Person{

	private int office;
	private double salary;
	private MyDate dateHired;

	/* CONSTRUCTORS */
	
	public Employee(String name, String address, String phone, 
			String email, int office, double salary) {
			super(name, address, phone, email);
			this.office = office;
			this.salary = salary;
			this.dateHired = new MyDate();
		}
	
	// Return office 
	public int getOffice() {
		return office;
	}

	// Return salary
	public String getSalary() {
		return String.format("%.2f", salary);
	}

	// Return date hired
	public String getDateHired() {
		return dateHired.getMonth() + "/" + dateHired.getDay() 
				 + "/" + dateHired.getYear();
	}

	// Set new office
	public void setOffice(int office) {
		this.office = office;
	}

	// Set new salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Set new dateHired
	public void setDateHired() {
		dateHired = new MyDate();
	}

	// Return a string description of the class
	public String toString() {
		return super.toString() + "\nOffice: " + office + 
				 "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
	
}
