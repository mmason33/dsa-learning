/**
 * Binary Search - usually assumes a sorted array - Divide and Conquer - O(log n)
 * @param {array} list
 * @param {integer} value
 */
function binarySearch(list, start, end, value) {
	if (start > end) return false;
	const middle = Math.floor((start + end) / 2);

	if (list[middle] === value) {
		return value;
	} else if (value > list[middle]) {
		return binarySearch(list, middle + 1, end, value);
	}

	return binarySearch(list, start, middle - 1, value);
}


const arr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40];

// 36
console.log(binarySearch(arr, 0, arr.length - 1, 36));

// false
console.log(binarySearch(arr, 0, arr.length - 1, 57));
