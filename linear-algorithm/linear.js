/**
 * Finding a value in an array with length of "n"
 * Time & Space Complexity - O(n) - Runtime will grow proportionally to the input length "n"
 * @param {array} list
 * @param {integer} value
 */
function linear(list, value) {
	let result = false;
	for (let i = 0; i < list.length; i++) {
		if (list[i] === value) {
			result = true;
			break;
		}
	}

	return result;
}

// true
console.log(linear([1,2,3,4,5,6,7,8,9], 5));

// false
console.log(linear([1,2,3,4,5,6,7,8,9], 27));
