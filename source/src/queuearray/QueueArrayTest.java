package queuearray;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class QueueArrayTest {
	
	QueueArray<Worker> workers;

	@Before
	public void setUp() throws Exception {
		workers = new QueueArray<Worker>();
	}
	
	@Test
	public void checkOrder() {
		Worker fred = new Worker("Fred", "porter");
		Worker sam = new Worker("Sam", "porter");
		Worker joe = new Worker("Joe", "porter");
		
		workers.enqueue(fred);
		workers.enqueue(sam);
		workers.enqueue(joe);
		
		assertTrue(workers.size() == 3);
		assertTrue(workers.peek() == fred);
		assertTrue(workers.dequeue() == fred);
	
		assertTrue(workers.size() == 2);
		assertTrue(workers.peek() == sam);
		assertTrue(workers.dequeue() == sam);
		
		assertTrue(workers.size() == 1);
		assertTrue(workers.peek() == joe);
		assertTrue(workers.dequeue() == joe);
		
		assertTrue(workers.size() == 0);
	}

}
