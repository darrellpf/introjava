package queuearray;

public class QueueArray<E> {
	public static final int QUEUE_INITIAL_SIZE = 10;

	private E[] allItems;

	private int headFilledSlot;
	private int tailUnusedSlot;

	private int itemCount;

	public QueueArray() {
		allItems = (E[]) new Object[QUEUE_INITIAL_SIZE];

		headFilledSlot = 0;
		tailUnusedSlot = 0;

		itemCount = 0;
	}

	public void enqueue(E what) {
		allItems[tailUnusedSlot] = what;

		tailUnusedSlot = nextPosition(tailUnusedSlot);

		itemCount++;
	}

	public E dequeue() {
		E itemToReturn = allItems[headFilledSlot];

		headFilledSlot = nextPosition(headFilledSlot);

		itemCount--;

		return itemToReturn;
	}

	public E peek() {
		return allItems[headFilledSlot];
	}

	public int size() {
		return itemCount;
	}

	/* Increment position and wrap around if it runs off  */
	/* the end of the array.                              */

	private int nextPosition(int position) {
		position++;

		if (position >= allItems.length) {
			position = 0;
		}

		/* the shortcut for the above code is               */
		// position = (position + 1) % allItems.length;

		return position;
	}
}