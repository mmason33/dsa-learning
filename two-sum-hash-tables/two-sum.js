/**
 * Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * One-pass Hash Table O(n) vs Two-pass Hash Table O(n) vs Brute Force O(n^2)
 * Space complexity O(n)
 * Time complexity O(n)
 * Overall O(n)
 */
function twoSum(nums, target) {
	const HashTable = {};
	for (let i = 0; i < nums.length; i++) {
		// Find the difference between the target and the current value nums[i]
		const difference = target - nums[i];

		// Check the hash table to see if it contains the key => HashTable[difference]
		if (HashTable[difference] !== undefined) {
			console.log(target, '-', nums[i], '=', difference);
			console.log(nums[i], '+', difference, '=', target);
			return [HashTable[difference], i];
		}
		HashTable[nums[i]] = i;
	}

	return [-1];
}

console.log(twoSum([2,7,11,15], 9));
console.log(twoSum([2,7,11,15], 33));
