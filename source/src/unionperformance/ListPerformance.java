package unionperformance;

public class ListPerformance {
	private static final int WORKER_COUNT = 30000;

	public static void main(String[] args) {
		MemberList ourUnion = new MemberList();

		System.out.println("Building list");

		for (int count = 0; count < WORKER_COUNT; count++) {
			ourUnion.add(new Worker("Grumpy" + count, "maintenance"));
		}

		System.out.println("Removing list elements");

		for (int count = 0; count < WORKER_COUNT; count++) {
			ourUnion.remove(0);
		}

		System.out.println("Done");
	}
}