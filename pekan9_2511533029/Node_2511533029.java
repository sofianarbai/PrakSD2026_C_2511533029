package pekan9_2511533029;

public class Node_2511533029 {
	int data_3029;	// boleh string
	Node_2511533029 left_3029;
	Node_2511533029 right_3029;

	public Node_2511533029(int data_3029) {
		this.data_3029 = data_3029;
		left_3029 = null;
		right_3029 = null;
	}

	public void setLeft_3029(Node_2511533029 node_3029) {
		if (left_3029 == null)
			left_3029 = node_3029;
	}

	public void setRight_3029(Node_2511533029 node_3029) {
		if (right_3029 == null)
			right_3029 = node_3029;
	}

	public Node_2511533029 getLeft_3029() {
		return left_3029;
	}

	public Node_2511533029 getRight_3029() {
		return right_3029;
	}

	public int getData_3029() {
		return data_3029;
	}

	public void setData_3029(int data_3029) {
		this.data_3029 = data_3029;
	}

	void printPreorder_3029(Node_2511533029 node_3029) {
		if (node_3029 == null)
			return;

		System.out.print(node_3029.data_3029 + " ");
		printPreorder_3029(node_3029.left_3029);
		System.out.print(node_3029.data_3029 + " ");
	}

	void printPostorder_3029(Node_2511533029 node_3029) {
		if (node_3029 == null)
			return;

		printPostorder_3029(node_3029.left_3029);
		printPostorder_3029(node_3029.right_3029);
		System.out.print(node_3029.data_3029 + " ");
	}

	void printInorder_3029(Node_2511533029 node_3029) {
		if (node_3029 == null)
			return;

		printInorder_3029(node_3029.left_3029);
		System.out.print(node_3029.data_3029 + " ");
		printInorder_3029(node_3029.right_3029);
	}

	public String print_3029() {
		return this.print_3029("", true, "");
	}

	public String print_3029(String prefix_3029, boolean isTail_3029, String sb_3029) {
		if (right_3029 != null) {
			right_3029.print_3029(
				prefix_3029 + (isTail_3029 ? "| " : "   "),
				false,
				sb_3029
			);
		}

		System.out.println(
			prefix_3029 + (isTail_3029 ? "\\--" : "/--") + data_3029
		);

		if (left_3029 != null) {
			left_3029.print_3029(
				prefix_3029 + (isTail_3029 ? "  " : "| "),
				true,
				sb_3029
			);
		}

		return sb_3029;
	}
}