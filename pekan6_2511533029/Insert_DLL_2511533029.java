package pekan6_2511533029;

public class Insert_DLL_2511533029 {
	// menambahkan node di awal dll
	static NodeDLL_2511533029 insertBegin_3029 (NodeDLL_2511533029 head_3029, int data_3029) {
		// buat node baru
		NodeDLL_2511533029 new_node_3029 = new NodeDLL_2511533029 (data_3029);
		// jadikan pointer nextnya head
		new_node_3029.next_3029 = head_3029;
		// jadikan pointer prev head ke new node
		if (head_3029 != null) {
			head_3029.prev_3029 = new_node_3029;		
		}
		return new_node_3029;
	}
	// fungsi menambahkan node di akhir 
	public static NodeDLL_2511533029 insertEnd_3029 (NodeDLL_2511533029 head_3029, int newData_3029) {
		// buat node baru
		NodeDLL_2511533029 newNode_3029 = new NodeDLL_2511533029 (newData_3029);
		// jika dll null jadikan head
		if (head_3029 == null) {
			head_3029 = newNode_3029;	
		} else {
			NodeDLL_2511533029 curr_3029 = head_3029;
			while (curr_3029.next_3029 != null) {
				curr_3029 = curr_3029.next_3029;
			}
			curr_3029.next_3029 = newNode_3029;
			newNode_3029.prev_3029 = curr_3029;
		}
		return head_3029;	
	}
	//fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511533029 insertAtPosition (NodeDLL_2511533029 head_3029, int pos_3029, int new_data_3029) {
		// buat node baru
		NodeDLL_2511533029 new_node_3029 = new NodeDLL_2511533029 (new_data_3029);
		if (pos_3029 == 1) {
			new_node_3029.next_3029 = head_3029;
			if (head_3029 != null) {
				head_3029.prev_3029 = new_node_3029;
			}
			head_3029 = new_node_3029;
			return head_3029;
		}
		NodeDLL_2511533029 curr_3029 = head_3029;
		for (int i=1 ; i < pos_3029 - 1 && curr_3029 != null; i++) {
			curr_3029 = curr_3029.next_3029; 
			}
			if (curr_3029 == null) {
				System.out.println("Posisi tidak ada");
				return head_3029;
			}
			new_node_3029.prev_3029 = curr_3029;
			new_node_3029.next_3029 = curr_3029.next_3029;
			curr_3029.next_3029 = new_node_3029;
			if (new_node_3029.next_3029 != null) {
				new_node_3029.next_3029.prev_3029 = new_node_3029;
			}
		return head_3029;
	}
	public static void printList_3029 (NodeDLL_2511533029 head_3029) {
		NodeDLL_2511533029 curr_3029 = head_3029;
		while (curr_3029 != null) {
			System.out.print(curr_3029.data_3029 + " <-> ");
			curr_3029 = curr_3029.next_3029;
		}
		System.out.println();
	}
	public static void main (String [] args) {
		// membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511533029 head_3029 = new NodeDLL_2511533029 (2);
		head_3029.next_3029 = new NodeDLL_2511533029 (3);
		head_3029.next_3029.prev_3029 = head_3029;
		head_3029.next_3029.next_3029 = new NodeDLL_2511533029 (5);
		head_3029.next_3029.next_3029.prev_3029 = head_3029.next_3029;
		// cetak dll awal
		System.out.print("DLL Awal: ");
		printList_3029(head_3029);
		// tambah 1 di awal
		head_3029 = insertBegin_3029 (head_3029,1);
		System.out.println("Simpul 1 ditambah di awal : ");
		printList_3029 (head_3029);
		// tambah 6 di akhir 
		System.out.println("simpul 6 di tambah di akhir: ");
		int data_3029 = 6;
		head_3029 = insertEnd_3029 (head_3029, data_3029);
		printList_3029 (head_3029);
		// menambahkan node 4 di posisi 4
		System.out.println("tambah node 4 di posisi 4: ");
		int data2_3029 = 4;
		int pos_3029 = 4;
		head_3029 = insertAtPosition (head_3029, pos_3029, data2_3029);
		printList_3029(head_3029);
	}

}
