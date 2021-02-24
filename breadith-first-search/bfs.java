import java.util.HashMap;

public class Node {
	int value;
	Node left;
	Node right;

	Node(int value, Node left, Node right) {
		this.value = value;
		this.right = left;
		this.left = right;
	}
}

public class BreadthFirstSearch {


	public static void main(String[] args) {
		HashMap<Integer, Node> hashTable = new HashMap<Integer, Node>();
		hashTable.put(10, new Node(
			10,
			new Node(4, null, null),
			new Node(9, null, null)
		));
		System.out.println(hashTable);
	}
}
