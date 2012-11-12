package unionextras;

public class MemberList {
	private static final int MAX_WORKERS = 20;

	private Worker[] allWorkers;
	private int nextEmptySlot;

	public MemberList() {
		allWorkers = new Worker[MAX_WORKERS];
		nextEmptySlot = 0;
	}

	public void add(Worker who) {
		if (nextEmptySlot == allWorkers.length) {
			grow();
		}

		allWorkers[nextEmptySlot] = who;
		nextEmptySlot++;
	}

	private void grow() {
		Worker[] newWorkers = new Worker[allWorkers.length * 2];

		for (int copyIndex = 0; copyIndex < allWorkers.length; copyIndex++) {
			newWorkers[copyIndex] = allWorkers[copyIndex];
		}

		allWorkers = newWorkers;
	}
	

	public void remove(int removePosition) {
		int positionToMove = removePosition + 1;
		int lastPositionToMove = nextEmptySlot - 1;
		
		int itemsToMove = lastPositionToMove - positionToMove + 1;
		
		for (int i = 0; i < itemsToMove; i++) {
			allWorkers[positionToMove - 1] = allWorkers[positionToMove];
			positionToMove++;
		}
	}

	public Worker getPosition(int position) {
		return allWorkers[position];
	}

	public int size() {
		return nextEmptySlot;
	}

	public String toString() {
		String theMembers = "";
		for (int memberNumber = 0; memberNumber < nextEmptySlot; memberNumber++) {
			theMembers = theMembers + " [ " + allWorkers[memberNumber] + " ] ";
		}

		return theMembers;
	}
}