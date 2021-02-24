/**
 * Binary Search Tree
 */
const tree = {
	10: {
		value: 10,
		left: 4,
		right: 17,
	},
	4: {
		value: 4,
		left: 1,
		right: 9,
	},
	17: {
		value: 17,
		left: 12,
		right: 18,
	},
	1: {
		value: 1,
		left: null,
		right: null,
	},
	9: {
		value: 9,
		left: null,
		right: null,
	},
	12: {
		value: 12,
		left: null,
		right: null,
	},
	18: {
		value: 18,
		left: null,
		right: null,
	},
};

/**
 * Depth First Search - explore the entire depth of each subtree before proceeding to the next child
 * @param {tree | map | object} root - Root of Binary search tree
 * @param {integer} target - desired value
 * The time complexity for DFS is O(V + E). We get this complexity considering the fact that we are visiting each node only once and in the case of a tree (no cycles) we are crossing all the edges once.
 */
// Pass tree in JS example because we can't leverage pointers
function dfs(tree, root, target) {
	console.log(root);
	if (root === null) {
		return -1;
	}

	if (root.value === target) {
		return target;
	}

	const children = root.left && root.right ? [root.left, root.right] : [];

	for (let i = 0; i < children.length; i++) {
        let result = dfs(tree, tree[children[i]], target);
        if (result !== -1) {
            return result;
        }
    }

	return -1;
}

// prints 12 - 6 iterations
console.log('------------------------');
console.log(dfs(tree, tree[10], 12));
console.log('------------------------');

// prints -1 - 7 iterations
console.log(dfs(tree, tree[10], 120));
console.log('------------------------');

// prints -1 - 1 iteration
console.log(dfs(tree, null, 120));
console.log('------------------------');
