import java.util.ArrayList;

/**
 * Depth First Search - explore the entire depth of each subtree before proceeding to the next child
 * @param {tree | map | object} root - Root of Binary search tree
 * @param {integer} target - desired value
 * The time complexity for DFS is O(V + E). We get this complexity considering the fact that we are visiting each node only once and in the case of a tree (no cycles) we are crossing all the edges once.
 */
public class DepthFirstSearch {
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

		if (root.value == target) {
			return target;
		}

		ArrayList<Node> children = new ArrayList<Node>();

		if (root.left != null && root.right != null) {
			children.add(root.left);
			children.add(root.right);
		}

		for (int i = 0; i < children.size(); i++) {
			int result = searchTree(children.get(i), target);
			if (result != -1) {
				return result;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		try
		{
			DepthFirstSearch obj = new DepthFirstSearch ();
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
