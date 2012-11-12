package hashchain;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HashTableTest {
	Student[] firstYear =
	{
		new Student("King",		"Don",		65),
		new Student("Johnson",	"Margaret",	23),
		new Student("Student",	"Joe",		20),
		new Student("Jones",	"Sam",		43),
		new Student("Vanity",	"Fair",		21),
		new Student("Lambert",	"Ken",		32),
		new Student("Anderson",	"Fred",		22),
		new Student("Osborne",	"Martin",	24),
		new Student("Platypus",	"Duck",		33),
		new Student("Cook",		"Captain",	81),
		new Student("Rainer",	"Prince",	38),
		new Student("Quincy",	"Susan", 	24),
		};
	
	@Test
	public void addThenFindStringStudent() {
		HashTable<String, Student> myHash =
			new HashTable<String, Student>();
		
		myHash.add("Best in class", firstYear[0]);
		myHash.add("First exam was best", firstYear[1]);
		myHash.add("Never shows up", firstYear[2]);
		
		Student someone = myHash.find("First exam was best");
		assertTrue(someone == firstYear[1]);
	}
	
	@Test
	public void addThenFindStudentStudent() {
		HashTable<Student, Student> myHash =
			new HashTable<Student, Student>();
		
		myHash.add(firstYear[0], firstYear[0]);
		
		Student fakeStudent = new Student("King", "Don", 0);
		
		Student who = myHash.find(fakeStudent);
		
		assertTrue(who == firstYear[0]);
		}
	
	@Test
	public void duplicates() {
		Student first = new Student("Person", "Dull", 23);
		Student duplicateFirst = new Student("Person", "Dull", 57);
		
		// Check to see if a duplicate is replaced
		
		HashTable<Student, Student> aMap = new HashTable<Student, Student>();
		aMap.add(first, first);
		aMap.add(duplicateFirst, duplicateFirst);
		
		Student result = aMap.find(first);
		assertTrue(result.getAge() == 57);
		
		// Now try keys with presumably same hashcode
		
		Student a1 = new Student("ab", "cd", 2);
		Student a2 = new Student("ba", "cd", 3);
		Student a3 = new Student("ba", "dc", 4);
		
		aMap.add(a1, a1);
		aMap.add(a2, a2);
		aMap.add(a3, a3);
		
		// all values should be there
		
		Student getA1 = aMap.find(a1);
		assertTrue(getA1 == a1);
		Student getA2 = aMap.find(a2);
		assertTrue(getA2 == a2);
		Student getA3 = aMap.find(a3);
		assertTrue(getA3 == a3);
	}
	
	@Test
	public void heavyLoadFactor() {
		HashTable<Student, Student> aMap = new HashTable<Student, Student>();
		List<Student> allStudents = new ArrayList<Student>();
		
		for(int i = 0; i < 300; i++) {
			Student who = new Student("Fred" + i, "Flintstone" + i, i);
			allStudents.add(who);
			aMap.add(who, who);
		}
		
		for(int i = 0; i < 300; i++) {
			Student inMapStudent = aMap.find(new Student("Fred" + i, "Flintstone" + i, i));
			assertTrue(inMapStudent == allStudents.get(i));
		}
	}
}
