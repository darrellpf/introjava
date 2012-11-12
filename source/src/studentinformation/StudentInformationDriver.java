package studentinformation;

public class StudentInformationDriver {

	public static void main(String[] args) {

		Student someone;
		someone = new Student();

		someone.firstName = "Fred";
		someone.lastName = "Flintstone";
		someone.age = 37;

		Student different = new Student();

		different.firstName = "Barney";
		different.firstName = "Rubble";
		different.age = 40;

		Student anonymous;

		anonymous = different;
		anonymous.age = 66;

		System.out.println("someone data is ");
		System.out.println("First name: " + someone.firstName);
		System.out.println("Last name: " + someone.lastName);
		System.out.println("Age: " + someone.age);
	}
}