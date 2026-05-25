package pekan8_2511533029;

public class MergeSort_2511533029 {

    void merge(int arr_3029[], int l_3029, int m_3029, int r_3029) {

        // Find sizes of two subarrays to be merged
        int n1_3029 = m_3029 - l_3029 + 1;
        int n2_3029 = r_3029 - m_3029;

        /* Create temp arrays */
        int L_3029[] = new int[n1_3029];
        int R_3029[] = new int[n2_3029];

        /* Copy data to temp arrays */
        for (int i_3029 = 0; i_3029 < n1_3029; ++i_3029)
            L_3029[i_3029] = arr_3029[l_3029 + i_3029];

        for (int j_3029 = 0; j_3029 < n2_3029; ++j_3029)
            R_3029[j_3029] = arr_3029[m_3029 + 1 + j_3029];

        int i_3029 = 0, j_3029 = 0;

        // Initial index of merged subarray array
        int k_3029 = l_3029;

        while (i_3029 < n1_3029 && j_3029 < n2_3029) {
            if (L_3029[i_3029] <= R_3029[j_3029]) {
                arr_3029[k_3029] = L_3029[i_3029];
                i_3029++;
            } else {
                arr_3029[k_3029] = R_3029[j_3029];
                j_3029++;
            }
            k_3029++;
        }

        /* Copy remaining elements of L[] if any */
        while (i_3029 < n1_3029) {
            arr_3029[k_3029] = L_3029[i_3029];
            i_3029++;
            k_3029++;
        }

        /* Copy remaining elements of R[] if any */
        while (j_3029 < n2_3029) {
            arr_3029[k_3029] = R_3029[j_3029];
            j_3029++;
            k_3029++;
        }
    }
    void sort_3029(int arr_3029[], int l_3029, int r_3029) {
        if (l_3029 < r_3029) {

            // Find the middle point
            int m_3029 = (l_3029 + r_3029) / 2;

            // Sort first and second halves
            sort_3029(arr_3029, l_3029, m_3029);
            sort_3029(arr_3029, m_3029 + 1, r_3029);

            // Merge the sorted halves
            merge(arr_3029, l_3029, m_3029, r_3029);
        }
    }

    /* A utility function to print array of size n */
    static void printArray_3029(int arr_3029[]) {
        int n_3029 = arr_3029.length;

        for (int i_3029 = 0; i_3029 < n_3029; ++i_3029)
            System.out.print(arr_3029[i_3029] + " ");

        System.out.println();
    }

    public static void main(String args_3029[]) {

        int arr_3029[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Sebelum terurut");
        printArray_3029(arr_3029);

        MergeSort_2511533029 ob_3029 = new MergeSort_2511533029();
        ob_3029.sort_3029(arr_3029, 0, arr_3029.length - 1);

        System.out.println("\nSesudah Terurut menggunakan Merge Sort");
        printArray_3029(arr_3029);
    }
}