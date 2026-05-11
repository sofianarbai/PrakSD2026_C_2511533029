package pekan6_2511533029;

public class PenelusuranDLL_2511533029 {
	//fungsi penelusuran maju
	static void forwardTraversal_3029 (NodeDLL_2511533029 head_3029) {
		// memulai penelusuran dari head
		NodeDLL_2511533029 curr_3029 = head_3029;
		// lanjutkan sampai akhir
		while  (curr_3029 != null) {
			// print data
			System.out.print(curr_3029.data_3029 +" <-> ");
			// pindah ke node berikutnya
			curr_3029 = curr_3029.next_3029;
			}
		// print spasi
		System.out.println();
		}
		// fungsi penelusuran mundur
		static void backwardTraversal_3029 (NodeDLL_2511533029 tail_3029) {
			// mulai dari akhir 
			NodeDLL_2511533029 curr_3029 = tail_3029;
			// lanjut sampai head
			while (curr_3029 != null) {
				// cetak data
				System.out.print(curr_3029.data_3029 + " <-> ");
				// pindah ke node sebelumnya
				curr_3029 = curr_3029.prev_3029;
			}
			// cetak spasi
			System.out.println();
		}
		public static void main (String [] args) {
			// cetak dll
			NodeDLL_2511533029 head_3029 = new NodeDLL_2511533029 (1);
			NodeDLL_2511533029 second_3029 = new NodeDLL_2511533029 (2);
			NodeDLL_2511533029 third_3029 = new NodeDLL_2511533029 (3);
			
			head_3029.next_3029 = second_3029;
			second_3029.prev_3029 = head_3029;
			second_3029.next_3029 = third_3029;
			third_3029.prev_3029 = second_3029;
			
			System.out.println(" penelusuran maju: ");
			forwardTraversal_3029 (head_3029);
			
			System.out.println("penelusuran mundur: ");
			backwardTraversal_3029 (third_3029);
		}
}
