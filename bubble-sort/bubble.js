/**
 * Bubble Sort - Comparison sort
 * @param {array} list
 * List is sorted with a total(worst case) runtime of `O(n^2)`
 */
function bubbleSort(list) {
	for (let i = 0; i < list.length; i++) {
		for (let j = i + 1; j < list.length; j++) {
			if (list[j] < list[i]) {
				const temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}
	}

	console.log(list);
}

bubbleSort([9,8,7,6,5,4,3,2,1,0]);
