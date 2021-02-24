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

/**
 * Depth First Search - explore the entire depth of each subtree before proceeding to the next child
 * @param {tree | map | object} root - Root of Binary search tree
 * @param {integer} target - desired value
 * The time complexity for DFS is O(V + E). We get this complexity considering the fact that we are visiting each node only once and in the case of a tree (no cycles) we are crossing all the edges once.
 */
func dfs(root *Node, target int) int {
	if root == nil {
		return -1
	}

	if root.value == target {
		return target
	}

	children := make([]*Node, 0)
	if root.left != nil && root.right != nil {
		children = append(children, root.left, root.right)
	}

	for i := 0; i < len(children); i++ {
		result := dfs(children[i], target)
		if result != -1 {
			return result
		}
	}

	return -1
}

func main() {
	// prints 12
	fmt.Println(dfs(tree.root, 12))

	// prints -1
	fmt.Println(dfs(tree.root, 120))

	emptyTree := Root{
		root: nil,
	}
	// prints -1
	fmt.Println(dfs(emptyTree.root, 12))
}
