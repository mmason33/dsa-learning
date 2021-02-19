import java.util.HashMap;
import java.util.Arrays;

/**
 * Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * One-pass Hash Table O(n) vs Two-pass Hash Table O(n) vs Brute Force O(n^2)
 * Space complexity O(n)
 * Time complexity O(n)
 * Overall O(n)
 */
 public class TwoSum {
	 public Integer[] nums;
	 public Integer target;

	// constructor
	 public TwoSum(Integer[] n, Integer t) {
		 this.nums = n;
		 this.target = t;
	 }

	 public Integer[] calcSum() {
		 // HashMap<int, int> isn't a thing :/
		 HashMap<Integer, Integer> hashTable = new HashMap<Integer, Integer>();

		 for (Integer i = 0; i < this.nums.length; i++) {
			Integer difference = this.target - this.nums[i];

			if (hashTable.containsKey(difference)) {
				return new Integer[]{hashTable.get(difference), (Integer) i};
			}

			hashTable.put(nums[i], i);
		 }

		 return new Integer[]{-1};
	 }

	 public static void main(String[] args) {
		 Integer[] n = new Integer[]{2,7,11,15};
		 Integer t = 9;
		 TwoSum s1 = new TwoSum(n, t);
		 Integer[] result1 = s1.calcSum();

		 // prints [0,1] true
		 System.out.println(Arrays.toString(result1));

		 Integer[] m = new Integer[]{2,7,11,15};
		 Integer ta = 33;
		 TwoSum s2 = new TwoSum(m, ta);
		 Integer[] result2 = s2.calcSum();

		 // prints [-1] false
		 System.out.println(Arrays.toString(result2));
	 }
 }

