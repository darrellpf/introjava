package recursion;

public class Recursion {
	int[] numbers = { 2, 4, 6, 8, 10, 12 };

	public static void main(String[] args) {
		new Recursion();
	}

	Recursion() {
		System.out.println("Printing backwards");
		printBackward(0);

		System.out.println("Printing forwards");
		printForward(0);
	}

	// recursively go through the array forwards, recurse after

	public void printForward(int position) {
		if (position == numbers.length) {
			return;
		}

		System.out.println(numbers[position]);
		printForward(position + 1);
	}

	// recursively go through the array backwards

	public void printBackward(int position) {
		if (position == numbers.length) {
			return;
		}

		printBackward(position + 1);
		System.out.println(numbers[position]);
	}
}