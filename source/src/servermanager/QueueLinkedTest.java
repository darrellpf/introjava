package servermanager;


import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;


public class QueueLinkedTest {
	
	QueueInterface<URL> websites;

	@Before
	public void setUp() throws Exception {
		websites = new QueueLinked<URL>();
	}
	
	@Test
	public void checkOrder() {
		URL fred = new URL("Fred");
		URL sam = new URL("Sam");
		URL joe = new URL("Joe");
		
		websites.enqueue(fred);
		websites.enqueue(sam);
		websites.enqueue(joe);
		
		assertTrue(websites.size() == 3);
		assertTrue(websites.peek() == fred);
		assertTrue(websites.dequeue() == fred);
	
		assertTrue(websites.size() == 2);
		assertTrue(websites.peek() == sam);
		assertTrue(websites.dequeue() == sam);
		
		assertTrue(websites.size() == 1);
		assertTrue(websites.peek() == joe);
		assertTrue(websites.dequeue() == joe);
		
		assertTrue(websites.size() == 0);
	}
	
	@Test
	public void iteratorOrder() {
		URL fred = new URL("Fred");
		URL sam = new URL("Sam");
		URL joe = new URL("Joe");
		
		websites.enqueue(fred);
		websites.enqueue(sam);
		websites.enqueue(joe);
		
		Iterator<URL> iter = websites.iterator();
		assertTrue(iter.hasNext());
		assertTrue(iter.next() == fred);
		assertTrue(iter.hasNext());
		assertTrue(iter.next() == sam);
		assertTrue(iter.hasNext());
		assertTrue(iter.next() == joe);
		assertTrue(iter.hasNext() == false);

	}

}
