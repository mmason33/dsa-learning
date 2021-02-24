import java.util.ArrayList;

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
}
