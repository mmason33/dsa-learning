const bStr = 'Binary Search:';
const sStr = 'Sequential Search:';

/**
 * Binary Search - usually assumes a sorted array - Divide and Conquer - O(log n)
 * @param {array} list
 * @param {integer} value
 */
function binarySearch(list, value) {
	let valueFound = false;

	// Beginning of the array
	let startIndex = 0;

	// Ending index of the array
	let endIndex = list.length - 1;

	// For comparison only
	let iterations = 0;

	while (startIndex <= endIndex) {
		// Example only
		iterations++;

		// Find the middle index of the array
		let middleIndex = Math.floor((startIndex + endIndex) / 2);

		// Check if value is at the middle index
		if (list[middleIndex] === value) {
			valueFound = true;
			console.log(`${bStr} Found value ${value} at index ${middleIndex}`);
			break;
		}

		// Target value is greater than middle value
		// Target value will be to the right of the middle value
		// Change the start index to exclude the original middle index
		// New search array will be [middleIndex + 1, endIndex] essentially halving the search range
		else if (value > list[middleIndex]) {
			console.log(`${bStr} Searching the right side of the array`);
			startIndex = middleIndex + 1;
		}

		// Target value is less than middle value
		// Target value will be to the left of the middle value
		// Change the end index to exclude the original middle index
		// New search array will be [startIndex, middleIndex - 1] essentially halving the search range
		else if (value < list[middleIndex]) {
			console.log(`${bStr} Searching the left side of the array`);
			endIndex = middleIndex - 1;
		}

		else {
			console.log(`${bStr} Value not found this loop iteration. Looping another iteration.`);
		}
	}

	console.log('----------------------------------------');
	console.log(`Binary Search required ${iterations} iterations to find value`);
	console.log('----------------------------------------');
	return valueFound;
}

function sequentialSearch(list, value) {
	let iterations = 0
	let result = false;
	for (let i = 0; i < list.length; i++) {
		iterations++;
		if (list[i] === value) {
			result = true;
			break;
		}
	}

	console.log('----------------------------------------');
	console.log(`${sStr} Sequential required ${iterations} iterations to find value`);
	console.log('----------------------------------------');
	return result;
}


const arr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40];

// true
console.log(binarySearch(arr, 36));

// true
console.log(sequentialSearch(arr, 36));
