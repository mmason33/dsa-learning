import java.lang.Math;

/**
 * Quadratic - comparing every element to every other element
 * For each element check every element to see if it's the Sqrt of the current element
 * Time & Space Complexity - O(n^2) - We do O(n) work O(n) times - loop over list(n) "n" times
 * @param {int[]} list
 */
public class Quadratic {

	public static boolean quadratic(int[] list) {
		boolean result = false;

		for (int i = 0; i < list.length; i++) {
			int current = list[i];

			for (int j = 0; j < list.length; j++) {
				if (Math.sqrt(list[j]) == current) {
					result = true;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] list = new int[]{3,4,5,6,7,8,16};
		int[] l = new int[]{3,4,5,6,7,8};

		// true
		System.out.println(quadratic(list));

		// false
		System.out.println(quadratic(l));
	}
}
