package pekan6_2511533029;

public class HapusDLL_2511533029 {
	// fungsi menghapus node awal
	public static NodeDLL_2511533029 delHead_3029(NodeDLL_2511533029 head_3029) {
		if (head_3029 == null) {
			return null;
		}
		NodeDLL_2511533029 temp_3029 = head_3029;
		head_3029 = head_3029.next_3029;
		if (head_3029 != null) {
			head_3029.prev_3029 = null;
		}
			return head_3029;
	}
	// fungsi menghapus di akhir
	public static NodeDLL_2511533029 delLast_3029(NodeDLL_2511533029 head_3029) {
		if (head_3029 == null) {
			return null;
		}
		if (head_3029.next_3029 == null) {
			return null;
		}
		NodeDLL_2511533029 curr_3029 = head_3029;
		while (curr_3029.next_3029 != null) {
			curr_3029 = curr_3029.next_3029;
		}
		// update pointer previous node
		if (curr_3029.prev_3029 != null) {
			curr_3029.prev_3029.next_3029 = null;
		}
		return head_3029;
		
	}
	// fungsi menghapus node di posisi tertentu
	public static NodeDLL_2511533029 delPos_3029(NodeDLL_2511533029 head_3029, int pos_3029) {
		// jika DLL kosong
		if (head_3029 == null) {
			return head_3029;
		}
		NodeDLL_2511533029 curr_3029 = head_3029;
		// telusuri sampai node yang akan dihapus
		for (int i = 1; curr_3029 != null && i < pos_3029; ++i) {
			curr_3029 = curr_3029.next_3029;
		}
		// jika posisi tidak ditemukan
		if (curr_3029 == null) {
			return head_3029;
		}
		// update pointer
		if (curr_3029.prev_3029 != null) {
			curr_3029.prev_3029.next_3029 = curr_3029.next_3029;
		}
		if (curr_3029.next_3029 != null) {
			curr_3029.next_3029.prev_3029 = curr_3029.prev_3029;
		}
		// jika yang dihapus head
		if (head_3029 == curr_3029) {
			head_3029 = curr_3029.next_3029;
		}
		return head_3029;
	}
	// fungsi mencetak DLL
	public static void printList_3029 (NodeDLL_2511533029 head_3029) {
		NodeDLL_2511533029 curr_3029 = head_3029;
		while (curr_3029 != null) {
			System.out.print(curr_3029.data_3029 + " ");
			curr_3029 = curr_3029.next_3029;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//buat sebuah DLL
		NodeDLL_2511533029 head_3029 = new NodeDLL_2511533029(1);
		head_3029.next_3029 = new NodeDLL_2511533029(2);
		head_3029.next_3029.prev_3029 = head_3029;
		head_3029.next_3029.next_3029 = new NodeDLL_2511533029(3);
		head_3029.next_3029.next_3029.prev_3029 = head_3029.next_3029;
		head_3029.next_3029.next_3029.next_3029 = new NodeDLL_2511533029(4);
		head_3029.next_3029.next_3029.next_3029.prev_3029 = head_3029.next_3029.next_3029;
		head_3029.next_3029.next_3029.next_3029.next_3029 = new NodeDLL_2511533029(5);
		head_3029.next_3029.next_3029.next_3029.next_3029.prev_3029 = head_3029.next_3029.next_3029.next_3029;		
		System.out.print("DLL Awal : ");
		printList_3029(head_3029);
		
		System.out.print("Setelah head dihapus : ");
		head_3029 = delHead_3029(head_3029);
		printList_3029(head_3029);
		
		System.out.print("Setelah node terakhir dihapus : ");
		head_3029 = delLast_3029(head_3029);
		printList_3029(head_3029);
		
		System.out.print("menghapus node ke 2 : ");
		head_3029 = delPos_3029(head_3029, 2);
		printList_3029(head_3029);
	}
}