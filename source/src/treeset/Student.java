package treeset;

public class Student implements Comparable<Student> {
	private String lastName;
	private String firstName;
	private int age;

	public Student(String lastName, String firstName, int age) {
		this.lastName	= lastName;
		this.firstName	= firstName;
		this.age		= age;
	}

	public int compareTo(Student who) {

		// If you want to see that compareTo is being called,
		// uncomment the following line

		//  System.out.println("Comparing " + this + " to " + what);

		int comparison = lastName.compareTo(who.lastName);

		// if the last names don't match, return that comparison

		if (comparison != 0) {
			return comparison;
		}

		// otherwise, return the comparison based on first names

		comparison = firstName.compareTo(who.firstName);

		return comparison;
	}

	@Override
	public String toString() {
		return lastName + ", " + firstName + " " + age;
	}
}