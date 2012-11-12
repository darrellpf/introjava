package phone;

public class PayAsYouGoPhone extends CellPhone {
	
	PayAsYouGoPhone(String inFirstName, String inLastName, int number) {
		super(inFirstName, inLastName, number, 0);
		System.out.println("PayAsYouGoPhone constructor");
	}
	
	@Override
	public void talk(int minutes) {
		planMinutes -= minutes;
	}
	
	public void buyMinutes(int minutes) {
		planMinutes += minutes;
	}
	
	@Override
	public String toString() {
		return
			" First Name: " 			+ getFirstName() +
			"  Last Name: " 			+ getLastName() +
			"  Number: " 				+ getNumber()+
			"  Minutes remaining: "	+ getPlanMinutes();
	}
}
