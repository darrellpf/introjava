package hashmap;

import java.util.*;

public class TestHashMap {
	Student[] allStudents =
		{
			new Student("King",		"Don",		103759100),
			new Student("Johnson",	"Margaret",	233425354),
			new Student("Student",	"Joe",		203343411),
			new Student("Jones",	"Sam",		434537757),
			new Student("Vanity",	"Fair",		215223434),
			new Student("Lambert",	"Ken",		323124646),
			new Student("Anderson",	"Fred",		228798797),
			new Student("Osborne",	"Martin",	246445678),
			new Student("Platypus",	"Duck",		333212135),
			new Student("Cook",		"Captain",	816456757),
			new Student("Rainer",	"Prince",	385465464),
			new Student("Quincy",	"Susan",	246557888),
			};

	public static void main(String[] args) {
		new TestHashMap();
	}

	public TestHashMap() {
		Map<Student, Student> studentMap = new HashMap<Student, Student>();

		for(Student who : allStudents) {
		    studentMap.put(who, who);
		}

		Student whoToFind = new Student("Osborne", "Martin", 0);

		Student foundStudent = studentMap.get(whoToFind);

		if (foundStudent == null) {
			System.out.println("Didn't find student " + whoToFind);
		} else {
			System.out.println("Found student " + foundStudent);
		}

		System.out.println("The students stored in the map are:");
		for(Student who : studentMap.values()) {
		    System.out.println(who);
		}
	}
}