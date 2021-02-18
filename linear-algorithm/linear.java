/**
 * Finding a value in an array with length of "n"
 * Time & Space Complexity - O(n) - Runtime will grow proportionally to the input length "n"
 * @param {int[]} list
 * @param {int} value
 */
public class Linear {

	public static boolean linear(int[] list, int value) {
		boolean result = false;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == value) {
				result = true;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] list = new int[]{ 1,2,3,4,5,6,7,8,9,10};
		int value = 5;

		// true
		System.out.println(linear(list, value));

		int v = 27;
		// false
		System.out.println(linear(list, v));
	}
}
