package pekan3_2511533029;
import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511533029 {

	public static int postfixEvaluate_3029 (String expression) {
		Stack <Integer> s = new Stack <Integer>();
		Scanner input_3029 = new Scanner (expression);
		while (input_3029.hasNext()) {
			if (input_3029.hasNextInt()) {  //an operan integer
				s.push(input_3029.nextInt());
			} else {
				String operator_3029 = input_3029.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				if (operator_3029.equals("+")) {
					s.push (operand1+operand2);
				} else if (operator_3029.equals("-")) {
					s.push(operand1-operand2);
				} else if (operator_3029.equals("*")) {
					s.push(operand1*operand2);
				} else {
					s.push(operand1/operand2);
				}
			}
		} 
		input_3029.close();
		return s.pop();
	}
	public static void main (String [] args) {
		System.out.println("hasil postfix = " + postfixEvaluate_3029("5 2 5 * + 7 -"));
	}

}
