package pekan8_2511533029;

public class ShellSort_2511533029 {
	
	public static void shellSort_3029 (int [] A_3029) {
		int n_3029 = A_3029.length;
		int gap_3029 = n_3029/2;
		while  (gap_3029 > 0) {
			for (int i = gap_3029; i < n_3029; i++) {
				int temp_3029 = A_3029[i];
				int j_3029 = i;
				while (j_3029 >= gap_3029 && A_3029[j_3029-gap_3029]> temp_3029) {
					A_3029 [j_3029] = A_3029[j_3029 - gap_3029];
					j_3029 = j_3029-gap_3029;
				}
				A_3029[j_3029] = temp_3029;
				
			}
			gap_3029 = gap_3029 / 2;
			
		}
	}
	public static void main (String [] args) {
		int []data_3029 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("sebelum: ");
		printArray_3029(data_3029);
		
		shellSort_3029 (data_3029);
		
		System.out.print("Sesudah shell sort: ");
		printArray_3029(data_3029);
         }
	public static void printArray_3029 (int[] arr_3029) {
		for (int i : arr_3029) System.out.print(i + " ");
		System.out.println();
	}
}
