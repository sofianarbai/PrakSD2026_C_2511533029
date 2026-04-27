package pekan4_2511533029;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class IterasiQueue_2511533029 {

	public static void main(String[] args) {
		Queue <String> q_3029 = new LinkedList<> ();
		
		q_3029.add("Praktikum");
		q_3029.add("Struktur");
		q_3029.add("Data");
		q_3029.add("Dan");
		q_3029.add("Algoritma");
		Iterator <String> iterator_3029 = q_3029.iterator();
		while (iterator_3029.hasNext()) {
			System.out.println(iterator_3029.next() + " ");
		}

	}

}
