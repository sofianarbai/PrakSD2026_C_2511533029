package pekan5_2511533029;

public class HapusSLL_2511533029 {

	// fungsi untuk menghapus head
	public static NodeSLL_2511533029 deleteHead_3029(NodeSLL_2511533029 head_3029) {
		// jika ssl kosong
		if (head_3029 == null)
			return null;

		// pindahkan head ke node berikutnya
		head_3029 = head_3029.next_3029;

		// return head baru
		return head_3029;
	}

	// fungsi menghapus node terakhir ssl
	public static NodeSLL_2511533029 removeLastNode_3029(NodeSLL_2511533029 head_3029) {
		// jika list kosong, return null
		if (head_3029 == null) {
			return null;
		}

		// jika list satu node, hapus node dan return null
		if (head_3029.next_3029 == null) {
			return null;
		}

		// temukan node terakhir kedua
		NodeSLL_2511533029 secondLast_3029 = head_3029;
		while (secondLast_3029.next_3029.next_3029 != null) {
			secondLast_3029 = secondLast_3029.next_3029;
		}

		// hapus node terakhir
		secondLast_3029.next_3029 = null;
		return head_3029;
	}

	// fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511533029 deleteNode(NodeSLL_2511533029 head_3029, int position_3029) {
		NodeSLL_2511533029 temp_3029 = head_3029;
		NodeSLL_2511533029 prev_3029 = null;

		// jika linked list null
		if (temp_3029 == null) {
			return head_3029;
		}

		// kasus 1: hapus node pertama
		if (position_3029 == 1) {
			head_3029 = temp_3029.next_3029;
			return head_3029;
		}

		// kasus 2: menghapus node di tengah
		// telusuri ke node yang dihapus
		for (int i = 1; temp_3029 != null && i < position_3029; i++) {
			prev_3029 = temp_3029;
			temp_3029 = temp_3029.next_3029;
		}

		// jika ditemukan, hapus node
		if (temp_3029 != null) {
			prev_3029.next_3029 = temp_3029.next_3029;
		} else {
			System.out.println("Data tidak ada");
		}

		return head_3029;
	}

	// fungsi mencetak ssl
	public static void printList_3029(NodeSLL_2511533029 head_3029) {
		NodeSLL_2511533029 curr = head_3029;

		while (curr != null) {
			if (curr.next_3029 != null) {
				System.out.print(curr.data_3029 + "-->");
			} else {
				System.out.print(curr.data_3029);
			}
			curr = curr.next_3029;
		}
		System.out.println();
	}
	// kelas main
	public static void main(String[] args) {
		// buat ssl 1->2->3->5->6->null
		NodeSLL_2511533029 head_3029 = new NodeSLL_2511533029(1);
		head_3029.next_3029 = new NodeSLL_2511533029(2);
		head_3029.next_3029.next_3029 = new NodeSLL_2511533029(3);
		head_3029.next_3029.next_3029.next_3029 = new NodeSLL_2511533029(5);
		head_3029.next_3029.next_3029.next_3029.next_3029 = new NodeSLL_2511533029(6);

		// cetak list awal
		System.out.print("List awal: ");
		printList_3029(head_3029);

		// hapus node terakhir
		head_3029 = removeLastNode_3029(head_3029);
		System.out.print("List setelah node terakhir dihapus: ");
		printList_3029(head_3029);

		// hapus node pada posisi 2
		int position_3029 = 2;
		head_3029 = deleteNode(head_3029, position_3029);

		// print list after deletion
		System.out.print("List setelah posisi 2 dihapus: ");
		printList_3029(head_3029);
	}
}