package forest;

import java.util.Iterator;

public class StackLinked<E> implements StackInterface<E> {
	Node start;
	int size;
	
	public	void	push	(E item) {
		Node aNode = new Node(item);
		aNode.next = start;
		start = aNode;
		size++;
	}
	
	public	E		pop		() {
		E itemToReturn;
		
		itemToReturn = start.thingToStore;
		start = start.next;
		size--;
		
		return itemToReturn;
	}
	
	public	int		size	() {
		return size;
	}
	
	public	E		peek	() {
		E itemToReturn;
			
		itemToReturn = start.thingToStore;
		
		return itemToReturn;		
	}
	
	public boolean isEmpty() {
		return start == null;
	}
	
	private class Node {
		E thingToStore;
		Node next;
		
		Node(E inItem) {
			thingToStore = inItem;
		}
	}
	
	public Iterator<E> iterator() {
		return new LinkedIterator();
	}
	
	private class LinkedIterator implements Iterator<E> {
		
		Node nextNode;
		
		LinkedIterator() {
			nextNode = start;
		}

		public boolean hasNext() {
			return nextNode != null;
		}

		public E next() {
			E itemToReturn;
			
			itemToReturn = nextNode.thingToStore;
			nextNode = nextNode.next;
			
			return itemToReturn;
		}

		public void remove() {
			// unimplemented
			
		}
		
	}
}

