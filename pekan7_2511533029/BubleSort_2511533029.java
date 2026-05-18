package pekan7_2511533029;

public class BubleSort_2511533029 {
	public static void bubleSort_3029 (int [] arr_3029) {
		int n_3029 = arr_3029.length;
		for (int i = 0; i < n_3029; i++) {
			for (int j = 0; j < n_3029 - i - 1; j++) {
				if (arr_3029[j] > arr_3029[j+1]) {
					int temp_3029 = arr_3029[j];
					arr_3029 [j] = arr_3029[j+1];
					arr_3029[j+1] = temp_3029;
					 // System.out.println (" data: " + arr_3029 [j]+ " " arr_3029 [j+1];
				}
			}
		}
	}
	public static void main (String [] args) {
		int arr_3029[] = {23, 78, 45, 8, 32, 56, 1};
		int n_3029 = arr_3029.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n_3029; i++) 
			System.out.print(arr_3029 [i] + " ");
			System.out.println("");
		bubleSort_3029 (arr_3029);
		System.out.printf("array yang terurut menggunakan buble sort:\n");
		for (int i = 0; i < n_3029; i++)
			System.out.print(arr_3029 [i] + " ");
		System.out.println("");
	}

}