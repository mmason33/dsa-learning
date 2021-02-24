import java.util.ArrayList;

/**
 * Breadith-First-Search - Iterative bfs approach
 * @param {object | map | hashtable} tree - Illustrative Binary Search Tree varying by language
 * @param {object | map | hashtable} root - Binary search tree root/entry point
 * @param {integer} target - The desired value
 * O(V+E) where V is number of vertices in the graph and E is number of edges in the graph.
 */
public class BreadthFirstSearch {
	class Root {
		Node root;

		Root(Node root) {
			this.root = root;
		}
	}

	class Node {
		int value;
		Node left;
		Node right;

		Node(int value, Node left, Node right) {
			this.value = value;
			this.right = left;
			this.left = right;
		}
	}

	public Root createTree() {
		Root tree = new Root(
			new Node(
				10,
				new Node(
					4,
					new Node(1, null, null),
					new Node(9, null, null)
				),
				new Node(
					17,
					new Node(12, null, null),
					new Node(18, null, null)
				)
			)
		);

		return tree;
	}

	public int searchTree(Node root, int target) {
		if (root == null) {
			return 0;
		}

		ArrayList<Node> queue = new ArrayList<Node>();
		queue.add(root);

		while (queue.size() > 0) {

			Node currentNode = queue.get(0);

			if (currentNode.value == target) {
				return target;
			}

			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}

			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}

			queue.remove(0);
		}

		return -1;
	}

	public static void main(String[] args) {
		try
		{
			BreadthFirstSearch obj = new BreadthFirstSearch ();
			Root tree = obj.createTree();


			int searchSuccess = obj.searchTree(tree.root, 12);

			// prints 12
			System.out.println(searchSuccess);

			int searchFail = obj.searchTree(tree.root, 120);

			// prints -1
			System.out.println(searchFail);
		}
		catch (Exception e)
		{
			e.printStackTrace ();
		}
	}
}
