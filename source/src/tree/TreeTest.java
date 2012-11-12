package tree;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TreeTest {
	
	List<Student> originalList;
	Tree<Student> myTree;

	@Before
	public void setUp() throws Exception {
		myTree = new Tree<Student>();
		originalList = new ArrayList<Student>();
		
		for(int i = 0; i < 100; i++) {
			originalList.add(new Student("Fred" + i, "Flintstone" + i, i));
		}
		
		Collections.shuffle(originalList);
	}
	
	@Test
	public void sortedOutput() {
		for(Student who : originalList) {
			myTree.add(who);
		}
		
		Collections.sort(originalList);
		
		Iterator<Student> iter = originalList.iterator();
		
		for(Student who : myTree) {
			assertTrue(who == iter.next());
		}
	}
	
	@Test
	public void retrieve() {
		for(Student who : originalList) {
			myTree.add(who);
		}
		
		Student findThis = new Student("Fred23", "Flintstone23", 0);
		Student foundStudent = myTree.find(findThis);
		assertTrue(foundStudent.getAge() == 23);
	}
}
