import java.lang.Math;

/**
 * Binary Search - usually assumes a sorted array - Divide and Conquer - O(log n)
 * @param {array} list
 * @param {integer} value
 */
public class BinarySearch {

	public static boolean binarySearch(int[] list, int value) {
		boolean result = false;
		int iterator = 0;
		int startIndex = 0;
		int endIndex = list.length - 1;

		while (startIndex <= endIndex) {
			iterator++;
			int middleIndex = (int) Math.floor((startIndex + endIndex) / 2);

			if (list[middleIndex] == value) {
				System.out.println("Found value!");
				result = true;
				break;
			} else if (value > list[middleIndex]) {
				startIndex = middleIndex + 1;
			} else if (value < list[middleIndex]) {
				endIndex = middleIndex - 1;
			} else {
				System.out.println("Not found looping again");
			}
		}

		System.out.printf("Found after %s iterations \n", iterator);
		return result;
	}

	public static void main(String[] args) {
		int[] list = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
		int value = 36;

		System.out.println(binarySearch(list, value));
	}
}
