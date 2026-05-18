package pekan7_2511533029;

public class SelectionSort_2511533029 {
	public static void selectionSort_3029 (int [] arr_3029) {
		int n_3029 = arr_3029.length;
		for (int i = 0; i < n_3029; i++) {
			int minIndex_3029 = i;
			for (int j = i + 1; j<n_3029; j++) {
				if (arr_3029[j] < arr_3029[minIndex_3029]) {
					minIndex_3029 = j;
				}
			}
			int temp_3029 = arr_3029 [i];
			arr_3029[i] = arr_3029 [minIndex_3029];
			arr_3029 [minIndex_3029] = temp_3029;
		}
	}
	public static void main (String [] args) {
		int arr_3029[] = {23, 78, 45, 8, 32, 56, 1};
		int n_3029 = arr_3029.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n_3029; i++) 
			System.out.print(arr_3029 [i] + " ");
			System.out.println("");
		selectionSort_3029 (arr_3029);
		System.out.printf("array yang terurut menggunakan selection sort:\n");
		for (int i = 0; i < n_3029; i++)
			System.out.print(arr_3029 [i] + " ");
		System.out.println("");
	}

}