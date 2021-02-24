package main

import "fmt"

// tree node aka vertex
type Node struct {
	left  *Node
	value int
	right *Node
}

/**
 * Binary Search Tree
 */
var tree map[int]*Node = map[int]*Node{
	10: &Node{
		value: 10,
		left: &Node{
			value: 4,
			left: &Node{
				value: 1,
				left:  nil,
				right: nil,
			},
			right: &Node{
				value: 9,
				left:  nil,
				right: nil,
			},
		},
		right: &Node{
			value: 17,
			left: &Node{
				value: 12,
				left:  nil,
				right: nil,
			},
			right: &Node{
				value: 18,
				left:  nil,
				right: nil,
			},
		},
	},
}

/**
 * Breadith-First-Search - Iterative bfs approach
 * @param {object | map | hashtable} tree - Illustrative Binary Search Tree varying by language
 * @param {object | map | hashtable} root - Binary search tree root/entry point
 * @param {integer} target - The desired value
 */
func bfs(tree map[int]*Node, root *Node, target int) int {
	var queue []*Node
	queue = append(queue, root)

	for len(queue) > 0 {
		currentNode := queue[0]

		if currentNode.value == target {
			return target
		}

		if currentNode.left != nil {
			queue = append(queue, currentNode.left)
		}

		if currentNode.right != nil {
			queue = append(queue, currentNode.right)
		}

		// Essentially a shift/pop of the front of the queue/array
		queue[0] = queue[len(queue)-1] // Copy last element to index 0.
		queue[len(queue)-1] = &Node{}  // Erase last element (write zero value).
		queue = queue[:len(queue)-1]   // shorten the slice
	}

	return -1
}

func main() {
	// prints 12
	fmt.Println(bfs(tree, tree[10], 12))

	// prints -1
	fmt.Println(bfs(tree, tree[10], 120))
}
