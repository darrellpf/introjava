package stackarray;

import java.util.Iterator;

public class StackArray<E> implements StackInterface<E>, Iterable<E>{
	private int MAX_STACK_SIZE = 20;

	private E[]	allObjects;
	private int	itemCount;

	public StackArray() {
		allObjects = (E[]) new Object[MAX_STACK_SIZE];
		itemCount = 0;
	}

	public void push(E what) {
		allObjects[itemCount] = what;
		itemCount++;
	}

	public E pop() {
		E theItem = allObjects[itemCount - 1];
		itemCount--;
		return theItem;
	}
	
	public E peek() {
		return allObjects[itemCount - 1];
	}

	public boolean isEmpty() {
		if (itemCount == 0)
			return true;

		return false;
	}

	public int size() {
		return itemCount;
	}
	
	public Iterator<E> iterator() {
		return new ArrayIterator();
	}
	
	private class ArrayIterator implements Iterator<E> {
		private int nowServing;
		
		ArrayIterator() {
			nowServing = 0;
		}
		
		public boolean hasNext() {
			return nowServing < itemCount;
		}
		
		public E next() {
			E itemToReturn = allObjects[nowServing];
			nowServing++;
			return itemToReturn;
		}
		
		public void remove() {
			
		}
	}
}