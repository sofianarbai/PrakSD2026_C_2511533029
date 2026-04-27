package pekan4_2511533029;

import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList_2511533029 {

	public static void main(String[] args) {
		Queue<Integer> q_3029 = new LinkedList <> ();
		// tambah elemen {0,1,2,3,4,5} ke antrian
		for (int i=0; i<=6; i++) 
			q_3029.add(i);
		// menampilkan isi antrian.
		System.out.println("Elemen Antrian: " + q_3029);
		// Untuk menghapus kepala antrian.
		int hapus_3029 = q_3029.remove();
		System.out.println("Hapus Elemen = " + hapus_3029);
		System.out.println(q_3029);
		// Untuk melihat antrian terdepan
		int depan_3029 = q_3029.peek();
		System.out.println("Kepala Antrian = " + depan_3029);
		
		int banyak_3029 = q_3029.size();
		System.out.println("Size Antrian = " + banyak_3029);
	}

}
