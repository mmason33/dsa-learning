var maxRotateFunction = function(A) {
    if (!A.length) return 0;
    let counter = 0;
	let total;
	let max = 0;
    while (counter < A.length) {
		total = 0;
        for (let i = 0; i < A.length; i++) {
            total += i * A[i];
        }

		const temp = [];
		for (let j = 0; j < A.length; j++) {
			const index = j < A.length - 1 ? j + 1 : 0;
			temp[index] = A[j];
		}

		A = temp;

		if (total > max) {
			max = total;
		} else if (total < 0 && max === 0) {
			max = total;
		}
        counter++;
    }

	return max;
};

// maxRotateFunction([4, 3, 2, 6])
// console.log(maxRotateFunction([1,2,3,4,5,6,7,8,9,10]))
// console.log(maxRotateFunction([-2147483648,-2147483648]));
console.log(maxRotateFunction([-2,0,1]));
