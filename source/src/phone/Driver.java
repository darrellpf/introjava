package phone;

public class Driver {

	public static void main(String[] args) {
		Phone fred = new Phone("Fred", "Flintstone", 5551212);
		
		System.out.println(fred);
		
		CellPhone barney = new CellPhone("Barney", "Rubble", 5556262, 100);
		barney.talk(20);
		
		System.out.println(barney);
		
		PayAsYouGoPhone wilma = new PayAsYouGoPhone("Wilma", "Flintstone", 4445555);
		wilma.buyMinutes(30);
		wilma.talk(5);
		
		System.out.println(wilma);
	}
}