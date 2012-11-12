package linkedlist;

public class LinkedList {
	private LinkBox headOfList;
	private int itemCount;

	public LinkedList() {
		headOfList = null;
		itemCount = 0;
	}

	public void add(Object theObject) {
		LinkBox newBox = new LinkBox(theObject, null);

		if (itemCount == 0) {
			headOfList = newBox;
			itemCount++;
			return;
		}
		
		LinkBox end = headOfList;
		while (end.getNext() != null) {
			end = end.getNext();
		}

		end.setNext(newBox);

		itemCount++;
	}

	public Object getPosition(int position) {
		if (position > itemCount - 1) {
			return null;
		}

		LinkBox currentLink = headOfList;

		for (int index = 0; index < position; index++) {
			currentLink = currentLink.getNext();
		}

		return currentLink.getItem();
	}

	public int size() {
		return itemCount;
	}

	public void remove(int whichPosition) {
		if (whichPosition == 0) {
			headOfList = headOfList.getNext();
			itemCount--;
			return;
		}
		
		// Advance to the element just before the one we want to delete

		LinkBox theOneBefore = headOfList;

		for (int index = 0; index < whichPosition - 1; index++) {
			theOneBefore = theOneBefore.getNext();
		}

		LinkBox theOneToRemove = theOneBefore.getNext();
		LinkBox theOneAfter = theOneToRemove.getNext();
		theOneBefore.setNext(theOneAfter);

		itemCount--;
	}

	@Override
	public String toString() {
		String contents = "";

		if (headOfList == null) {
			return "null";
		}

		LinkBox currentLink = headOfList;

		for (int index = 0; index < itemCount; index++) {
			contents = contents + "[ " + currentLink.toString() + "] ";
			currentLink = currentLink.getNext();
		}

		return contents;
	}
}