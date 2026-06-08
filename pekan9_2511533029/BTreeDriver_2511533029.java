package pekan9_2511533029;

public class BTreeDriver_2511533029 {
	public static void main(String[] args) {
		// membuat pohon
		BTree_2511533029 tree_3029 = new BTree_2511533029();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree_3029.countNodes_3029());

		// menambahkan simpul data 1
		Node_2511533029 root_3029 = new Node_2511533029(1);

		// menjadikan simpul 1 sebagai root
		tree_3029.setRoot_3029(root_3029);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_3029.countNodes_3029());

		Node_2511533029 node2_3029 = new Node_2511533029(2);
		Node_2511533029 node3_3029 = new Node_2511533029(3);
		Node_2511533029 node4_3029 = new Node_2511533029(4);
		Node_2511533029 node5_3029 = new Node_2511533029(5);
		Node_2511533029 node6_3029 = new Node_2511533029(6);
		Node_2511533029 node7_3029 = new Node_2511533029(7);
		Node_2511533029 node8_3029 = new Node_2511533029(8);
		Node_2511533029 node9_3029 = new Node_2511533029(9);

		root_3029.setLeft_3029(node2_3029);
		node2_3029.setLeft_3029(node4_3029);
		node2_3029.setRight_3029(node5_3029);
		node4_3029.setRight_3029(node8_3029);

		root_3029.setRight_3029(node3_3029);
		node3_3029.setLeft_3029(node6_3029);
		node3_3029.setRight_3029(node7_3029);
		node6_3029.setLeft_3029(node9_3029);

		// set root_3029
		tree_3029.setCurrent_3029(tree_3029.getRoot_3029());

		System.out.println("menampilkan simpul terakhir:");
		System.out.println(tree_3029.getCurrent_3029().getData_3029());

		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_3029.countNodes_3029());

		System.out.println("InOrder: ");
		tree_3029.printInorder_3029();

		System.out.println("\nPreorder: ");
		tree_3029.printPreorder_3029();

		System.out.println("\nPostorder: ");
		tree_3029.printPostorder_3029();

		System.out.println("\nMenampilkan simpul dalam bentuk pohon");
		tree_3029.print_3029();
	}
}