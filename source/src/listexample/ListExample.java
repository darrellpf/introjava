package listexample;

import java.util.*;

public class ListExample {
	public static void main(String[] args) {
		// Create a new list

		List<GroceryItem> shoppingList = new ArrayList<GroceryItem>();

		// Add a bunch of items to the list

		shoppingList.add(new GroceryItem("Bagels",			10));
		shoppingList.add(new GroceryItem("Cream cheese",	 1));
		shoppingList.add(new GroceryItem("Eggs",			12));
		shoppingList.add(new GroceryItem("Donuts",			84));
		shoppingList.add(new GroceryItem("Beer",			12));
		
		// The list's toString is smart enough to show all its members

		System.out.println("The shopping list contains: ");
		System.out.println(shoppingList);

		// Add an item at the beginning of the list
		// and a second item partway through the list

		shoppingList.add(0, new GroceryItem("Ice cream", 5));
		shoppingList.add(3, new GroceryItem("French fries", 1));

		// Go through all the items on the list

		System.out.println("The list's items via foreach are:");
		for(GroceryItem item : shoppingList) {
			System.out.println(item);
		}

		// Add an item anywhere, then determine its location on the list

		GroceryItem specialItem = new GroceryItem("Tofu", 2);
		shoppingList.add(specialItem);
		
		GroceryItem fakeItem = new GroceryItem("Tofu", 0);

		int specialItemPosition = shoppingList.indexOf(fakeItem);

		System.out.println(
			"The special item "
				+ specialItem
				+ " is located at position "
				+ specialItemPosition
				+ " on the list.");

		// Copy the entire list to a new list
		// This copies the references... it doesn't make new GroceryItems

		List<GroceryItem> copyOfList = new ArrayList<GroceryItem>(shoppingList);

		GroceryItem hammer = new GroceryItem("Hammer", 1);
		copyOfList.add(hammer);

		System.out.println("Original list is " + shoppingList);
		System.out.println("Copied/modified list is " + copyOfList);

		// Remove an item off the copied list by position

		copyOfList.remove(4);

		// Remove an item off the copied list by reference

		copyOfList.remove(hammer);
		System.out.println("Copied list with removals is " + copyOfList);

		System.out.println("Item at position 3 in the copy is " + copyOfList.get(3));

		// Sort one of the collections

		Collections.sort(copyOfList);

		System.out.println("The copied list, sorted numerically, is " + copyOfList);

		// Show the lowest quantity in the original list

		GroceryItem lowestGrocery = Collections.min(shoppingList);

		System.out.print("Lowest quantity in the original list is ");
		System.out.println(lowestGrocery);
	}
}