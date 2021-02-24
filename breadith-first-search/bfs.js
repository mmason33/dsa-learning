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
 * Breadith-First-Search - Iterative bfs approach
 * @param {object | map | hashtable} tree - Illustrative Binary Search Tree varying by language
 * @param {object | map | hashtable} root - Binary search tree root/entry point
 * @param {integer} target - The desired value
 * O(V+E) where V is number of vertices in the graph and E is number of edges in the graph.
 */
function bfs(tree, root, target) {
	const queue = [];

	// add root node to the queue
	queue.push(root);

	while (queue.length > 0) {
		const currentNode = queue[0];
		// return if target node is found
		if (currentNode.value === target) {
			return target;
		}

		// if current node contains children
		// push to the queue
		if (currentNode.left !== null) {
			queue.push(tree[currentNode.left]);
		}

		// if current node contains children
		// push to the queue
		if (currentNode.right !== null) {
			queue.push(tree[currentNode.right]);
		}

		// remove current node from the queue
		queue.shift();
	}

	// not found
	return -1;
}

// prints 12
console.log(bfs(tree, tree[10], 12));

// prints -1
console.log(bfs(tree, tree[10], 120));

