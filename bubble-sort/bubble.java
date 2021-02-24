import java.util.Arrays;

public class BubbleSort {
	int[] list;

	BubbleSort(int[] list) {
		this.list = list;
	}

	public int[] sort() {
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[i]) {
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}

		return list;
	}

	public static void main(String[] args) {
		BubbleSort s = new BubbleSort(new int[]{9,8,7,6,5,4,3,2,1,0});
		System.out.println(Arrays.toString(s.sort()));
	}
}
