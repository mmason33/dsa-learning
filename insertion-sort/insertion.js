/**
 * Insertion Sort - sort array by shifting values depending on the comparison
 * @param {array} nums
 * List is sorted with a total(worst case) runtime of `O(n^2)`
 */
function insertionSort(nums) {
	for (let i = 1; i < nums.length; i++) {
		let j = i - 1;
		let temp = nums[i];

		while (j >= 0 && nums[j] > temp) {
			nums[j + 1] = nums[j];
			j--;
		}

		nums[j + 1] = temp;
	}

	return nums;
}

console.log(insertionSort([3,1,5,6,2]))

/**
First for loop
i is 1
key is 1
j is 0
arr[j] is 3
arr[j] > key
So, we shift the element 3 one time to right. Now we have the array [3,3,5,6,2].

j--. Now j is -1. j < 0. So, while loop terminates
arr[j + 1] = key equals arr[0] = 1.
After the first loop we have the array [1,3,5,6,2]

We just inserted the card "1" into its correct position in our hand (We only had [3], in our hand)

Second for loop
i is 2
key is 5
j is 1
arr[j] is 3
arr[j] < key
while loop doesn't run
We have the same array [1,3,5,6,2] after the second for loop.

Third for loop
i is 3
key is 6
j is 2
arr[j] is 5
arr[j] < key
while loop doesn't run
We have the same array [1,3,5,6,2] after the second for loop.

Forth for loop
This is the interesting part.

Now we have [1,3,5,6] (sorted) in our hand. 2 is the element we are examining. We are going to insert it to the correct position.

i is 4
key is 2
j is 3
arr[j] is 6
arr[j] > key
while loop runs
Shifts 6 one time to right. Now we have [1,3,5,6,6]
5 > 2, shifts 5 one time right. [1,3,5,5,6]
3 > 2, shifts 3 one time right. [1,3,3,5,6]
1 < 2, that's the 2's position! Insert it after 1. Now we have [1,2,3,5,6].
 **/
