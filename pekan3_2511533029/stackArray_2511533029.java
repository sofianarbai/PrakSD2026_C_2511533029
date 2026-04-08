package pekan3_2511533029;

public class stackArray_2511533029 {
	static final int MAX_3029= 1000;
	int top_3029;
	int a[] = new int [MAX_3029];
	boolean isEmpty_3029()  
	{
		return (top_3029 < 0) ;
	}
	stackArray_2511533029() 
	{
		top_3029=-1;
	}
	boolean push_3029 (int x)
	{
		if (top_3029>= (MAX_3029 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top_3029] = x;
			System.out.println( x  + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_3029() 
	{
		if (top_3029 <= 0 ) {
			System.out.println("stack underflow");
			return 0;
		}else {
			int x = a[top_3029--];
			return x;
		}
	}
	int peek_3029() 
	{
		if (top_3029<0) 
		{
			System.out.println("stack underflow");
			return 0;
		}
		else 
		{
			int x = a [top_3029];
			return x;
		}
	}
	void print_3029 () {
		for (int i=top_3029; i>-1;i--) {
			System.out.print(" " +a[i]);
		}
	}

}
