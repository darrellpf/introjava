package union;

public class MemberList {
	private static final int MAX_WORKERS = 20;

	private Worker[] allWorkers;
	private int nextEmptySlot;

	public MemberList() {
		allWorkers = new Worker[MAX_WORKERS];
		nextEmptySlot = 0;
	}

	public void add(Worker who) {
		if (nextEmptySlot >= MAX_WORKERS) {
			return;
		}
		
		allWorkers[nextEmptySlot] = who;
		nextEmptySlot++;
	}

	public Worker getPosition(int position) {
		return allWorkers[position];
	}

	public int size() {
		return nextEmptySlot;
	}

	@Override
	public String toString() {
		String theMembers = "";
		for (int memberNumber = 0; memberNumber < nextEmptySlot; memberNumber++) {
			theMembers = theMembers + " [ " + allWorkers[memberNumber] + " ] ";
		}

		return theMembers;
	}
}