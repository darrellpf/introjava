package recursion;

public class IterativeBinarySearch {

	public static void main(String[] args) {
		int [] orderedNumbers = { -55, -10, 23, 57, 91, 101, 132, 333, 444 };

		int numberToFind = 91;

		int position = findNumber(orderedNumbers, numberToFind, 0,
				orderedNumbers.length - 1);

		System.out.println("number is at position " + position);
	}

	public static int findNumber(int[] orderedNumbers, int numberToFind,
			int leftIndex, int rightIndex) {

		while (leftIndex <= rightIndex) {

			int middle = (leftIndex + rightIndex) / 2;
			if(orderedNumbers[middle] == numberToFind) {
				return middle;
			}

			if (numberToFind < orderedNumbers[middle]) {
				rightIndex = middle - 1;
			} else {
				leftIndex = middle + 1;
			}
		}

		return -1;
	}
}
