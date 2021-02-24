package main

import "fmt"

// Root of the tree
type Root struct {
	root *Node
}

// tree node aka vertex
type Node struct {
	left  *Node
	value int
	right *Node
}

/**
 * Binary Search Tree
 */
var tree Root = Root{
	root: &Node{
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

// Remove element of the array without mutating the position of the other elements
func removeIndex(s []*Node, index int) []*Node {
	return append(s[:index], s[index+1:]...)
}

/**
 * Breadith-First-Search - Iterative bfs approach
 * @param {object | map | hashtable} tree - Illustrative Binary Search Tree varying by language
 * @param {object | map | hashtable} root - Binary search tree root/entry point
 * @param {integer} target - The desired value
 */
func bfs(root *Node, target int) int {
	if root == nil {
		return -1
	}

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
		queue = removeIndex(queue, 0)
	}

	return -1
}

func main() {
	// prints 12
	fmt.Println(bfs(tree.root, 12))

	// prints -1
	fmt.Println(bfs(tree.root, 120))

	emptyTree := Root{
		root: nil,
	}
	// prints -1
	fmt.Println(bfs(emptyTree.root, 12))
}
