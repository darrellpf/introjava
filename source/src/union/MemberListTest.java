package union;


import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class MemberListTest {
	
	Worker fred;
	Worker sam;
	
	MemberList union;

	@Before
	public void setUp() throws Exception {
		
		fred = new Worker("Fred", "Maintenance");
		sam = new Worker("Sam", "Electrician");
		
		union = new MemberList();
	}
	
	@Test
	public void initialSizeEmpty() {
		assertTrue(union.size() == 0);
	}
	
	@Test
	public void addOneThenRetrieve() {
		union.add(fred);
		
		Worker who = union.getPosition(0);
		assertTrue(who == fred);
		assertTrue(union.size() == 1);
	}
	
	@Test
	public void addMany() {
		union.add(fred);
		union.add(sam);
		
		assertTrue(union.size() == 2);
		assertTrue(union.getPosition(0) == fred);
		assertTrue(union.getPosition(1) == sam);
	}

}
