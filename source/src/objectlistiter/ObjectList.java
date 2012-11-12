package objectlistiter;

import java.util.Iterator;

public class ObjectList implements Iterable {
	private static final int MAX_ITEMS = 20;

	private Object[] allItems;
	private int nextEmptySlot;

	public ObjectList() {
		allItems = new Object[MAX_ITEMS];
		nextEmptySlot = 0;
	}

	public void add(Object what) {
		  if(nextEmptySlot == allItems.length) {
		    grow();
		    }

		  allItems[nextEmptySlot] = what;
		  nextEmptySlot++;
		  }

	private void grow() {
		Object [] newItems = new Object[allItems.length * 2];

	  for(int copyIndex = 0; copyIndex < allItems.length; copyIndex++) {
	    newItems[copyIndex] = allItems[copyIndex];
	    }

	  allItems = newItems;
	  }

	public void remove(int removePosition) {
		int firstPositionToMove = removePosition + 1;
		int lastPositionToMove = nextEmptySlot - 1;
		
		for (int copyPosition = firstPositionToMove;
				copyPosition <= lastPositionToMove; copyPosition++) {
			allItems[copyPosition - 1] = allItems[copyPosition];
		}
	}

	public Object getPosition(int position) {
		return allItems[position];
	}

	public int size() {
		return nextEmptySlot;
	}

	@Override
	public String toString() {
		String theMembers = "";
		for (int memberNumber = 0; memberNumber < nextEmptySlot; memberNumber++) {
			theMembers = theMembers + " [ " + allItems[memberNumber] + " ] ";
		}

		return theMembers;
	}
	
	public Iterator iterator() {
		return new ObjectListIterator();
	}

	private class ObjectListIterator implements Iterator {
		int currentPosition;

		private ObjectListIterator() {
			currentPosition = 0;
		}

		public boolean hasNext() {
			return currentPosition < nextEmptySlot;
		}

		public Object next() {
			Object theObject = allItems[currentPosition];
			currentPosition++;
			return theObject;
		}

		public void remove() {
			// we don't actually implement remove yet
			// so this method does nothing. It must be here
			// since "implements" insists we implement all the methods.
		}
	}
}