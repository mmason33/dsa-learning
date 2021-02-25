import java.util.Arrays;

/**
 * Insertion Sort - sort array by shifting values depending on the comparison
 * @param {array} nums
 * List is sorted with a total(worst case) runtime of `O(n^2)`
 */
public class InsertionSort {
	int[] list;

	InsertionSort(int[] list) {
		this.list = list;
	}

	int[] sort() {
		for (int i = 1; i < this.list.length; i++) {
			int j = i - 1;
			int temp = list[i];

			while (j >= 0 && list[j] > temp) {
				list[j + 1] = list[j];
				j--;
			}

			list[j + 1] = temp;
		}

		return list;
	}

	public static void main(String[] args) {
		InsertionSort s = new InsertionSort(new int[]{3, 1, 5, 6, 2});
		System.out.println(Arrays.toString(s.sort()));
	}
}
