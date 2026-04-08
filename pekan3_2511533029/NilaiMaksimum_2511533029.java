package pekan3_2511533029;
import java.util.Stack;
public class NilaiMaksimum_2511533029 {
	public static int max (Stack <Integer>s_3029) {	
	Stack <Integer> backup_3029 = new Stack <Integer>();
	int maxValue_3029 = s_3029.pop();
	backup_3029.push (maxValue_3029);
	while (!s_3029.isEmpty()) {
		int next_3029=s_3029.pop();
		backup_3029.push(next_3029);
		maxValue_3029 = Math.max(maxValue_3029, next_3029);
	}
	while (!backup_3029.isEmpty() ) {
		s_3029.push(backup_3029.pop());
	}
	return maxValue_3029;
  }
	public static void main(String[] args) {
		Stack <Integer> s_3029 = new Stack<Integer> ();
		s_3029.push (70);
		s_3029.push (12);
		s_3029.push (20);
		System.out.println("isi stack " + s_3029);
		System.out.println("Stack Teratas " + s_3029.peek());
		System.out.println("nilai maksimum " + max(s_3029));
		
		
	}

}
