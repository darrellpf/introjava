package union;

public class UnionListDriver {

	public static void main(String[] args) {
		/* Make a new member list */

		MemberList ourUnion = new MemberList();

		/* Add the founding member */

		Worker organizer = new Worker("Happy", "President");

		ourUnion.add(organizer);

		/* Use the memberlist's toString to print all the members */

		System.out.println(ourUnion);

		/* Retrieve the sole member on the list */

		Worker someone = ourUnion.getPosition(0);

		/* What happens to the original when we change the object */
		/* we retrieved from the list?                            */

		System.out.println("First worker is: " + someone);

		someone.setTitle("Founder");

		System.out.println("First worker is: " + organizer);

		/* Add a few more generic people */

		for (int extraCount = 0; extraCount < 20; extraCount++) {
			ourUnion.add(new Worker("Grumpy" + extraCount, "maintenance"));
		}

		System.out.println(ourUnion);
	}
}