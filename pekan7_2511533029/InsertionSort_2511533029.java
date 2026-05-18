package pekan7_2511533029;

public class InsertionSort_2511533029 {
	public static void insertionSort_3029 (int [] arr_3029) {
		int n_3029 = arr_3029.length;
		for (int i = 1; i < n_3029; i++) {
			int key_3029 = arr_3029[i];
			int j = i-1;
			while (j >= 0 && arr_3029[j] > key_3029) {
				arr_3029 [j+1] = arr_3029 [j];
				j--;
				
			}
			arr_3029[j+1] = key_3029;
		}
	}
	public static void main (String [] args) {
		int arr_3029[] = {23, 78, 45, 8, 32, 56, 1};
		int n_3029 = arr_3029.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n_3029; i++) 
			System.out.print(arr_3029 [i] + " ");
			System.out.println("");
		insertionSort_3029 (arr_3029);
		System.out.printf("array yang terurut:\n");
		for (int i = 0; i < n_3029; i++)
			System.out.print(arr_3029 [i] + " ");
		System.out.println("");
	}

}
