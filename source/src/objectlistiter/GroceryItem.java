package objectlistiter;

public class GroceryItem {
	private String	description;
	private int		quantity;

	public GroceryItem(String inDescription, int inQuantity) {
		description	= inDescription;
		quantity	= inQuantity;
	}

	@Override
	public String toString() {
		return description + " " + quantity;
	}
}