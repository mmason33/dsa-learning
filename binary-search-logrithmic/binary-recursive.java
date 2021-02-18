import java.lang.Math;

/**
 * Binary Search - usually assumes a sorted array - Divide and Conquer - O(log n)
 * @param {array} list
 * @param {integer} value
 */
public class BinarySearchRecursive {

	public static int binarySearchRecursive(int[] list, int startIndex, int endIndex, int value) {
		if (startIndex > endIndex) return -1;

		int middleIndex = (int) Math.floor((startIndex + endIndex) / 2);

		if (list[middleIndex] == value) {
			return value;
		} else if (value > list[middleIndex]) {
			return binarySearchRecursive(list, middleIndex + 1, endIndex, value);
		}

		return binarySearchRecursive(list, startIndex, middleIndex - 1, value);
	}

	public static void main(String[] args) {
		int[] list = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};

		// 36
		System.out.println(binarySearchRecursive(list, 0, list.length - 1, 36));

		// -1
		System.out.println(binarySearchRecursive(list, 0, list.length - 1, 57));
	}
}
