package forest;

import java.util.Iterator;

public class Clearing implements Iterable<Integer> {
	private boolean hasBeer;
	private int	identifier;
	private ObjectList<Integer> paths;
	private boolean wasVisited;
	
	Clearing(int inIdentifier, int [] inPaths) {
		hasBeer = false;
		identifier = inIdentifier;
		
		paths = new ObjectList<Integer>();
		
		for(int pathID : inPaths) {
			paths.add(pathID);
		}
		
		wasVisited = false;
	}
	
	public void setWasVisited() {
		wasVisited = true;
	}
	
	public boolean getWasVisited() {
		return wasVisited;
	}
	
	public void addBeer() {
		hasBeer = true;
	}
	
	public boolean doesHaveBeer() {
		return hasBeer;
	}
	
	public int getIdentifier() {
		return identifier;
	}

	public Iterator<Integer> iterator() {
		return paths.iterator();
	}
}
