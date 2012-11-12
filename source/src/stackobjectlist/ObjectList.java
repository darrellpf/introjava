package stackobjectlist;

import java.util.Iterator;

public class ObjectList<E> implements Iterable<E> {
	private static final int MAX_ITEMS = 20;

	private E[] allItems;
	private int nextEmptySlot;

	public ObjectList() {
		allItems = (E[]) new Object[MAX_ITEMS];
		nextEmptySlot = 0;
	}

	public void add(E what) {
		  if(nextEmptySlot == allItems.length) {
		    grow();
		    }

		  allItems[nextEmptySlot] = what;
		  nextEmptySlot++;
		  }

	private void grow() {
		E [] newItems = (E[]) new Object[allItems.length * 2];

	  for(int copyIndex = 0; copyIndex < allItems.length; copyIndex++) {
	    newItems[copyIndex] = allItems[copyIndex];
	    }

	  allItems = newItems;
	  }

	public void remove(int removePosition) {
	  for(int copyFromPosition = removePosition + 1;
	      copyFromPosition < nextEmptySlot; copyFromPosition++) {
	      allItems[copyFromPosition - 1] = allItems[copyFromPosition];
	      }
	  }

	public E getPosition(int position) {
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
	
	public Iterator<E> iterator() {
		return new ObjectListIterator();
	}

	private class ObjectListIterator implements Iterator<E> {
		int currentPosition;

		private ObjectListIterator() {
			currentPosition = 0;
		}

		public boolean hasNext() {
			return currentPosition < nextEmptySlot;
		}

		public E next() {
			E theObject = allItems[currentPosition];
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