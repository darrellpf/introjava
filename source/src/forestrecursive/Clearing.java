package forestrecursive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clearing implements Iterable<Integer> {
	private boolean hasBeer;
	private int	identifier;
	private List<Integer> paths;
	private boolean wasVisited;
	
	Clearing(int inIdentifier, int [] inPaths) {
		hasBeer = false;
		identifier = inIdentifier;
		
		paths = new ArrayList<Integer>();
		
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
