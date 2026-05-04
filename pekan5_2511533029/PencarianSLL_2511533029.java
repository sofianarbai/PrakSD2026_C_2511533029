package pekan5_2511533029;

public class PencarianSLL_2511533029 {
	static boolean searchKey (NodeSLL_2511533029 head_3029, int key_3029) {
		NodeSLL_2511533029 curr = head_3029;
		while (curr != null) {
			if (curr.data_3029 == key_3029)
				return true;
			curr = curr.next_3029; 
		}
			return false; 
		}
	public static void traversal_3029 (NodeSLL_2511533029 head_3029) {
		//mulai dari head
		NodeSLL_2511533029 curr= head_3029;
		//telusuri sampai pointer null
		while (curr != null) {
			System.out.print(" " +curr.data_3029);
			curr = curr.next_3029; }
			System.out.println();
		}
			public static void main(String[] args) {
				NodeSLL_2511533029 head_3029 = new NodeSLL_2511533029 (14);
				head_3029.next_3029 = new NodeSLL_2511533029 (21);
				head_3029.next_3029.next_3029 = new NodeSLL_2511533029 (13);
				head_3029.next_3029.next_3029.next_3029 = new NodeSLL_2511533029 (30);
				head_3029.next_3029.next_3029.next_3029.next_3029 = new NodeSLL_2511533029 (10);
				System.out.print("penulusuran ssl : ");
				traversal_3029 (head_3029);
				// databyang akan dicari
				int key_3029 = 30;
				System.out.print("cari data " + key_3029 + " : ");
				if (searchKey(head_3029, key_3029))
					System.out.println("ketemu");
				else {
					System.out.println("tidak ada");
				}
			}
	}



