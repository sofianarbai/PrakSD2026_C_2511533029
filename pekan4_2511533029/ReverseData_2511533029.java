package pekan4_2511533029;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533029 {

	public static void main(String[] args) {
		Queue <Integer> q_3029 = new LinkedList <Integer> ();
		q_3029.add(1);
		q_3029.add(2);
		q_3029.add(3); // [1,2,3]
		System.out.println("sebelum reverse: " + q_3029);
		Stack <Integer> s_3029 = new Stack <Integer> ();
		while (!q_3029.isEmpty()) { // Q -> S
			s_3029.push (q_3029.remove());
		}
		while (!s_3029.isEmpty()) { // S -> Q
			q_3029.add (s_3029.pop());
		}
		System.out.println("sesudah reverse: " + q_3029); // [3,2,1]
	}

}
