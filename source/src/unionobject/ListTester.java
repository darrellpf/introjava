package unionobject;

public class ListTester {

	public static void main(String[] args) {
		/* Make a new member list */

		ObjectList ourUnion = new ObjectList();

		/* Add the founding member */

		Worker organizer = new Worker("Happy", "President");

		ourUnion.add(organizer);

		/* Use the memberlist's toString to print all the members */

		System.out.println(ourUnion);

		/* Retrieve the sole member on the list */

		Worker someone = (Worker) ourUnion.getPosition(0);

		/* What happens to the original when we change the object */
		/* we retrieved from the list?                            */

		System.out.println("First worker is: " + someone);

		someone.setTitle("Founder");

		System.out.println("First worker is: " + organizer);

		/* Add a few more generic people */

		for (int extraCount = 0; extraCount < 20; extraCount++) {
			ourUnion.add(new Worker("Grumpy" + extraCount, "maintenance"));
		}

		System.out.println("All union members are");
		System.out.println(ourUnion);

		ourUnion.remove(0);
		System.out.println(ourUnion);

		/* Try putting another type of object into a new list */

		ObjectList groceryList = new ObjectList();

		/* Add a bunch of similar items to the list, different quantities */

		for (int itemCount = 0; itemCount < 10; itemCount++) {
			groceryList.add(new GroceryItem("Pickles", itemCount + 1));
		}

		System.out.println("Grocery List is");
		System.out.println(groceryList);

		GroceryItem someItem = (GroceryItem) groceryList.getPosition(3);

		System.out.println("Item 3 is " + someItem);
	}
}