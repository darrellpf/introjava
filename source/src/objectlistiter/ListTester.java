package objectlistiter;

import java.util.Iterator;

public class ListTester {

	public static void main(String[] args) {

		ObjectList groceryList = new ObjectList();

		/* Add a bunch of similar items to the list, different quantities */

		for (int itemCount = 0; itemCount < 10; itemCount++) {
			groceryList.add(new GroceryItem("Pickles", itemCount + 1));
		}

		/* Use an iterator to walk through the list */

		System.out.println("Here are the grocery list items via iterator");

		Iterator listIterator = groceryList.iterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}