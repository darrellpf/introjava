package servermanager;

import java.util.Iterator;

public class QueueLinked<E> implements QueueInterface<E>{
	private Node frontOfList;
	private Node endOfList;
	private int itemCount;

	public QueueLinked() {
		frontOfList = null;
		endOfList = null;

		itemCount = 0;
	}

	public void enqueue(E what) {
		Node newNode = new Node(what);

		if (endOfList == null) // first item on the list
			{
			endOfList = newNode;
			frontOfList = newNode;
			itemCount = 1;
			return;
			}
			
		// more than one item on the list
			
		endOfList.next = newNode;
		endOfList = newNode;

		itemCount++;
	}

	public E dequeue() {
		if (endOfList == null) {
			throw new IllegalArgumentException("Attempt to deque from empty queue");
		}

		Node firstItem = frontOfList;

		frontOfList = frontOfList.next;
		if (frontOfList == null) // removed last item, end must be null too
			{
			endOfList = null;
		}

		itemCount--;

		return firstItem.itemToStore;
	}

	public E peek() {
		return frontOfList.itemToStore;
	}

	public int size() {
		return itemCount;
	}

	/* Inner class for nodes in the linked list */

	class Node {
		private E itemToStore;
		private Node next;

		public Node(E theItem) {
			itemToStore = theItem;
			next = null;
		}
	}
	
	public Iterator<E> iterator() {
		return new QueueIterator();
	}
	
	private class QueueIterator implements Iterator<E> {
		Node current;
		
		QueueIterator() {
			current = frontOfList;
		}
		
		public boolean hasNext() {
			return current != null;
		}
	
		public E next() {
			E item = current.itemToStore;
			current = current.next;
			return item;
		}
	
		public void remove() {
			// not implemented
		}
	}
}