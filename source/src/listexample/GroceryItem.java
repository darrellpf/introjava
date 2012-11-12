package listexample;

public class GroceryItem implements Comparable<GroceryItem> {
	private String	description;
	private int		quantity;

	public GroceryItem(String inDescription, int inQuantity) {
		description = inDescription;
		quantity = inQuantity;
	}

	@Override
	public String toString() {
		return description + " " + quantity;
	}

	public int getQuantity() {
		return quantity;
	}
	
	// items are the same if their names match
	
	@Override
	public boolean equals(Object what) {
		if(what == null) return false;
		
		GroceryItem theItem = (GroceryItem) what;
		return description.equals(theItem.description);
	}
	
	// sort by quantity, then by description if necessary

	public int compareTo(GroceryItem theItem) {
		int difference = quantity - theItem.quantity;
		if(difference != 0) {
			return difference;
		}
		return description.compareTo(theItem.description);
	}
}