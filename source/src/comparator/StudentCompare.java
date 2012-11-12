package comparator;

import java.util.*;

public class StudentCompare {
	public StudentCompare() {
		List<Student> allStudents = new ArrayList<Student>();

		allStudents.add(new Student("Joe",		"Hardy",	17));
		allStudents.add(new Student("Frank",	"Hardy",	27));
		allStudents.add(new Student("Nancy",	"Drew",		12));
		allStudents.add(new Student("Hercule",	"Poirot",	47));

		Collections.sort(allStudents);

		System.out.println("Students sorted by last name");
		System.out.println(allStudents);
		System.out.println();

		Collections.sort(allStudents, Student.byFirstName());

		System.out.println("Students sorted by first name");
		System.out.println(allStudents);
		System.out.println();

		Collections.sort(allStudents, Student.byAge());

		System.out.println("Students sorted by age");
		System.out.println(allStudents);
		System.out.println();
	}

	// Main entry point
	static public void main(String[] args) {
		new StudentCompare();
	}
}