package comparator;

import java.util.*;

public class Student implements Comparable<Student> {
	private String	firstName;
	private String	lastName;
	private int		age;

	Student(String first, String last, int howOld) {
		firstName	= first;
		lastName	= last;
		age			= howOld;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student))
			return false;

		Student who = (Student) obj;

		if (who.firstName.equals(firstName) && who.lastName.equals(lastName))
			return (true);

		return false;
	}

	public int compareTo(Student who) {

		int comparison = lastName.compareTo(who.lastName);

		if (comparison != 0) // last names didn't match, so no match
			return comparison;

		comparison = firstName.compareTo(who.firstName);

		return comparison;
	}

	public static final Comparator<Student> byFirstName() {
		return new Comparator<Student>() {
			public int compare(Student who1, Student who2) {
				return who1.firstName.compareTo(who2.firstName);
			}
		};
	}

	public static final Comparator<Student> byAge() {
		return new Comparator<Student>() {
			public int compare(Student who1, Student who2) {
				return who1.age - who2.age;
			}
		};
	}
}