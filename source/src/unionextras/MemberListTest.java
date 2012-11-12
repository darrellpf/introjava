package unionextras;


import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class MemberListTest {
	
	Worker a;
	Worker b;
	Worker c;
	Worker d;
	Worker e;
	
	MemberList union;

	@Before
	public void setUp() throws Exception {
		
		a = new Worker("Fred", "Maintenance");
		b = new Worker("Sam", "Electrician");
		c = new Worker("Joe", "Electrician");
		d = new Worker("Pete", "Electrician");
		e = new Worker("George", "Electrician");
		
		union = new MemberList();
	}
	
	@Test
	public void initialSizeEmpty() {
		assertTrue(union.size() == 0);
	}
	
	@Test
	public void addOneThenRetrieve() {
		union.add(a);
		
		Worker who = union.getPosition(0);
		assertTrue(who == a);
		assertTrue(union.size() == 1);
	}
	
	@Test
	public void addMany() {
		union.add(a);
		union.add(b);
		
		assertTrue(union.size() == 2);
		assertTrue(union.getPosition(0) == a);
		assertTrue(union.getPosition(1) == b);
	}
	
	@Test
	public void removeBeginning() {
		union.add(a);
		union.add(b);
		union.add(c);
		union.add(d);
		union.add(e);
		assertTrue(union.size() == 5);
		
		union.remove(0);
		
		assertTrue(union.getPosition(0) == b);
		assertTrue(union.getPosition(1) == c);
		assertTrue(union.getPosition(2) == d);
		assertTrue(union.getPosition(3) == e);
	}
	
	@Test
	public void removeMiddle() {
		union.add(a);
		union.add(b);
		union.add(c);
		union.add(d);
		union.add(e);
		assertTrue(union.size() == 5);
		
		union.remove(2);
		
		assertTrue(union.getPosition(0) == a);
		assertTrue(union.getPosition(1) == b);
		assertTrue(union.getPosition(2) == d);
		assertTrue(union.getPosition(3) == e);		
	}

	@Test
	public void removeEnd() {
		union.add(a);
		union.add(b);
		union.add(c);
		union.add(d);
		union.add(e);
		assertTrue(union.size() == 5);
		
		union.remove(4);
		
		assertTrue(union.getPosition(0) == a);
		assertTrue(union.getPosition(1) == b);
		assertTrue(union.getPosition(2) == c);
		assertTrue(union.getPosition(3) == d);		
		
	}
}
