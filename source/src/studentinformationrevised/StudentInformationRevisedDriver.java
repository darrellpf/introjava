package studentinformationrevised;


public class StudentInformationRevisedDriver {

	public static void main(String[] args) {
		
		Student someone;
		someone = new Student();
		
		someone.setFirstName("Fred");
		someone.setLastName	("Flintstone");
		someone.setAge		(37);
		
		Student different = new Student("Barney", "Rubble", 40);
		
		Student anonymous;
		
		anonymous = different;
		anonymous.setAge(66);
		
		System.out.println("someone data is " + someone);
	}
}