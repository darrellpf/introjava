package phone;

public class Phone {
	private String	firstName;
	private String	lastName;
	private int		number;
	private int		minutesUsed;
	
	public Phone(String inFirstName, String inLastName, int inNumber) {
		firstName		= inFirstName;
		lastName		= inLastName;
		number			= inNumber;
		minutesUsed	= 0;
		System.out.println("Phone constructor");
	}
	
	public void talk(int minutes) {
		minutesUsed += minutes;
		System.out.println("Phone talk method");
		return;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getMinutesUsed() {
		return minutesUsed;
	}
	
	@Override
	public String toString() {
		return "FirstName: " 	+ firstName +
		" LastName: " 			+ lastName +
		" Number: "				+ number +
		" MinutesUsed: "		+ minutesUsed;
	}	
}
