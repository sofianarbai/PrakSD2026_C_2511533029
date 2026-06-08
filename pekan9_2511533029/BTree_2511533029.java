package pekan9_2511533029;

public class BTree_2511533029 {
	private Node_2511533029 root_3029;
	private Node_2511533029 currentNode_3029;

	public BTree_2511533029() {
		root_3029 = null;
	}

	public boolean search_3029(int data_3029) {
		return search_3029(root_3029, data_3029);
	}

	private boolean search_3029(Node_2511533029 node_3029, int data_3029) {
		if (node_3029.getData_3029() == data_3029)
			return true;

		if (node_3029.getLeft_3029() != null)
			return true;

		if (node_3029.getRight_3029() != null)
			if (search_3029(node_3029.getRight_3029(), data_3029))
				return true;

		return false;
	}

	public void printInorder_3029() {
		root_3029.printInorder_3029(root_3029);
	}

	public void printPreorder_3029() {
		root_3029.printPreorder_3029(root_3029);
	}

	public void printPostorder_3029() {
		root_3029.printPostorder_3029(root_3029);
	}

	public Node_2511533029 getRoot_3029() {
		return root_3029;
	}

	public boolean isEmpty_3029() {
		return root_3029 == null;
	}

	public int countNodes_3029() {
		return countNodes_3029(root_3029);
	}

	private int countNodes_3029(Node_2511533029 node_3029) {
		int count_3029 = 1;

		if (node_3029 == null) {
			return 0;
		} else {
			count_3029 += countNodes_3029(node_3029.getLeft_3029());
			count_3029 += countNodes_3029(node_3029.getRight_3029());
			return count_3029;
		}
	}

	public void print_3029() {
		root_3029.print_3029();
	}

	public Node_2511533029 getCurrent_3029() {
		return currentNode_3029;
	}

	public void setCurrent_3029(Node_2511533029 node_3029) {
		this.currentNode_3029 = node_3029;
	}

	public void setRoot_3029(Node_2511533029 root_3029) {
		this.root_3029 = root_3029;
	}
}