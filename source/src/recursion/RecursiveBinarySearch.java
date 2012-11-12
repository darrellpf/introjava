package recursion;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] orderedNumbers = { -55, -10, 23, 57, 91, 101, 132, 333, 444 };

		int numberToFind = 23;

		int position = findNumber(orderedNumbers, numberToFind, 0,
				orderedNumbers.length - 1);

		System.out.println("number is at position " + position);
	}

	public static int findNumber(int[] orderedNumbers, int numberToFind,
			int leftIndex, int rightIndex) {

		if (leftIndex > rightIndex) {
			return -1;
		}

		int middle = (leftIndex + rightIndex) / 2;
		if (orderedNumbers[middle] == numberToFind) {
			return middle;
		}

		if (numberToFind < orderedNumbers[middle]) {
			rightIndex = middle - 1;
			return findNumber(orderedNumbers, numberToFind, leftIndex,
					rightIndex);
		} else {
			leftIndex = middle + 1;
			return findNumber(orderedNumbers, numberToFind, leftIndex,
					rightIndex);
		}
	}
}
