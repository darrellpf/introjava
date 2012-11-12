package webhistory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class WebHistoryTest {
	
	WebHistory history;

	@Before
	public void setUp() throws Exception {
		history = new WebHistory();
	}
	
	@Test
	public void initallyEmpty() {
		assertTrue(history.forwardSize() == 0);
		assertTrue(history.historySize() == 0);
	}

	@Test
	public void addOneItem() {
		URL cnn = new URL("cnn");
		history.add(cnn);
		assertTrue(history.forwardSize() == 0);
		assertTrue(history.historySize() == 1);
		assertTrue(history.current() == cnn);
	}
	
	@Test
	public void addTwoItems() {
		URL cnn = new URL("cnn");
		history.add(cnn);
		
		URL si = new URL("si");
		history.add(si);
		
		assertTrue(history.forwardSize() == 0);
		assertTrue(history.historySize() == 2);
		assertTrue(history.current() == si);
		
		URL backone = history.previous();
		assertTrue(history.forwardSize() == 1);
		assertTrue(history.historySize() == 1);
		assertTrue(history.current() == cnn);
		assertTrue(backone == cnn);
		assertTrue(history.forward() == si);
	}
	
	@Test
	public void forwardEmptiesOnAdd() {
		URL cnn = new URL("cnn");
		history.add(cnn);
		
		URL si = new URL("si");
		history.add(si);
		
		URL google = new URL("google");
		history.add(google);
		
		history.previous();
		history.previous();
		
		URL weather = new URL("weather");
		history.add(weather);
		
		assertTrue(history.forwardSize() == 0);
		assertTrue(history.historySize() == 2);
		assertTrue(history.current() == weather);
		
		history.previous();
		assertTrue(history.current() == cnn);
	}
}
