package stackobjectlist;

import java.util.Iterator;

public class StackObjectList<E> implements StackInterface<E>, Iterable<E> {
	private ObjectList<E> theObjects;

	StackObjectList() {
		theObjects = new ObjectList<E>();
	}

	public void push(E what) {
		theObjects.add(what);
	}

	public E pop() {
		int lastItemPosition	= theObjects.size() - 1;
		E theItem				= theObjects.getPosition(lastItemPosition);
		theObjects.remove(lastItemPosition);
		return theItem;
	}
	
	public E peek() {
		int lastItemPosition	= theObjects.size() - 1;
		return theObjects.getPosition(lastItemPosition);
	}

	public boolean isEmpty() {
		return theObjects.size() == 0;
	}

	public int size() {
		return theObjects.size();
	}
	
	public Iterator<E> iterator() {
		return theObjects.iterator();
	}
}