package stackarray;


import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class StackArrayTest {

	StackInterface<Student> aStack;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void totalTest() {
		Student a = new Student("Fred", 23);
		Student b = new Student("Sam", 12);
		Student c = new Student("Al", 5);
		
		aStack = new StackArray<Student>();
		
		assertTrue(aStack.size() == 0);
		
		aStack.push(a);
		
		assertTrue(aStack.size() == 1);
		
		Student result = aStack.pop();
		
		assertTrue(result == a);
		
		aStack.push(a);
		aStack.push(b);
		
		assertTrue(aStack.peek() == b);
		
		aStack.push(c);
		
		Student [] people = new Student[3];
		people[0] = a;
		people[1] = b;
		people[2] = c;
		
		int position = 0;
		
		for(Student who : aStack) {
			System.out.println(who);
			assertTrue(who == people[position]);
			position++;
		}
		
		assertTrue(aStack.size() == 3);
		
		assertTrue(aStack.pop() == c);		
		assertTrue(aStack.size() == 2);
		
		assertTrue(aStack.pop() == b);
		assertTrue(aStack.size() == 1);
		
		assertTrue(aStack.pop() == a);
		assertTrue(aStack.size() == 0);
	}
}

