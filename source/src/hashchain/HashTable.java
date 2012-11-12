package hashchain;

import java.lang.reflect.Array;

public class HashTable<K, V> {
	private Node [] table;
	private int size;
	
	HashTable() {
		// Java generics syntax doesn't allow "new Node[table.length]"
		// so we have to be a bit more sophisticated.
		// Array.newInstance will make the proper Node array for us
		
		table = (Node[]) Array.newInstance(Node.class, 100);
	}

	public void add(K key,  V value) {
		Pair aPair = new Pair(key, value);
		Node aNode = new Node(aPair);
		
		int tablePosition = Math.abs(key.hashCode()) % table.length;
		
		// Just the code from the else is sufficient
		// but writing the code this was is less thinking.
		
		if(table[tablePosition] == null) {
			table[tablePosition] = aNode;
			size++;
			return;
		} 
		
		// replace a duplicate
		
		Node current = table[tablePosition];
		while(current != null) {
			Pair thePair = current.itemToStore;
			K theKey = thePair.key;
			if(theKey.equals(key)) {
				thePair.value = value;
				return;
			}
			
			current = current.next;
		}
		
		
		// Insert at beginning
		
		aNode.next = (Node) table[tablePosition];
		table[tablePosition] = aNode;	
		size++;
	}
	
	public V find(K findKey) {
		V itemToReturn = null;
		
		int tablePosition = Math.abs(findKey.hashCode()) % table.length;

		// This test is unnecessary since it is handled
		// anyway, but makes the code a bit clearer.
		
		if(table[tablePosition] == null) {
			return null;
		}
		
		Node current = (Node) table[tablePosition];
		while(current != null) {
			Pair thePair = current.itemToStore;
			K aKey = thePair.key;
			if(aKey.equals(findKey)) {
				return thePair.value;
			}
			
			current = current.next;
		}
		
		return itemToReturn;
	}
	
	class Pair {
		K key;
		V value;
		
		Pair(K inKey, V inValue) {
			key = inKey;
			value = inValue;
		}
	}
	
	class Node {
		Pair itemToStore;
		Node next;
		
		Node(Pair inPair) {
			itemToStore = inPair;
		}
	}
}
