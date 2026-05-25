package pekan8_2511533029;

public class QuickSort_2511533029 {
	static void swap_3029 (int [] arr_3029, int i_3029, int j_3029) {
		int temp_3029 = arr_3029[i_3029];
		arr_3029 [i_3029] = arr_3029 [j_3029];
		arr_3029 [j_3029] = temp_3029;
		
	}
	// metode tambahan untuk mengatur pivot menggunakan median of three
	static void medianOfThree_3029 (int [] arr_3029, int low_3029, int high_3029 ) {
		int mid_3029 = low_3029 + (high_3029 - low_3029) / 2;
		
		// urutkan elemen low , mid dan high
		if (arr_3029 [low_3029] > arr_3029[mid_3029]) {
			swap_3029 (arr_3029, low_3029, mid_3029);
		}
		if (arr_3029 [low_3029] > arr_3029 [high_3029]) {
			swap_3029 (arr_3029, low_3029, high_3029);
		}
		if (arr_3029 [mid_3029] > arr_3029 [high_3029]) {
			swap_3029 (arr_3029, mid_3029, high_3029);
		}
		swap_3029 (arr_3029, mid_3029, high_3029);
		}
	static int paritition_3029 (int [] arr_3029, int low_3029, int high_3029) {
		//panggil fungsi median of three sebelum menentukan pivot
		int pivot_3029 = arr_3029[high_3029]; // sekarang arr[high] sudah berisi nilai median
		int i_3029 = (low_3029 - 1);
		
		for (int j_3029 = low_3029; j_3029 <= high_3029 -1; j_3029++) {
			// jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr_3029[j_3029] < pivot_3029) {
				// increment indeks elemen yang lebih kecil
				i_3029++;
				swap_3029 (arr_3029, i_3029, j_3029);
			}
		}
		swap_3029 (arr_3029, i_3029 +1, high_3029);
		return (i_3029 +1);
	}
	static void quickSort_3029 (int [] arr_3029, int low_3029, int high_3029) {
		if (low_3029 < high_3029) {
			int pi_3029 = paritition_3029(arr_3029, low_3029, high_3029);
			quickSort_3029 (arr_3029, low_3029, pi_3029 - 1);
			quickSort_3029 (arr_3029, pi_3029+1, high_3029);
		}
	}
	public static void printArr_3029 (int [] arr_3029) {
		for (int i_3029 = 0; i_3029 < arr_3029.length; i_3029++) {
			System.out.print(arr_3029 [i_3029] + " ");
		}
		System.out.println();
	}
	public static void main (String [] args) {
		int[] arr_3029 = {10, 7, 8, 9, 1, 5};
		int N_3029 = arr_3029.length;
		System.out.print("Data sebelum dirurutkan: ");
		printArr_3029 (arr_3029);
		
		quickSort_3029 (arr_3029, 0, N_3029 - 1);
		System.out.print("Data terurut quikSort: ");
		printArr_3029 (arr_3029);
	}
}
