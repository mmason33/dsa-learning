/**
 * Quadratic - comparing every element to every other element
 * For each element check every element to see if it's the Sqrt of the current element
 * Time & Space Complexity - O(n^2) - We do O(n) work O(n) times - loop over list(n) "n" times
 * @param {array} list
 */
function quadratic(list) {
	let result = false;

	for (let i = 0; i < list.length; i++) {
		const current = list[i];

		for (let j = 0; j < list.length; j++) {
			if (Math.sqrt(list[j]) === current) {
				result = true;
			}
		}
	}

	return result;
}

// true
console.log(quadratic([3,4,5,6,7,8,16]));

// false
console.log(quadratic([3,4,5,6,7,8]));
