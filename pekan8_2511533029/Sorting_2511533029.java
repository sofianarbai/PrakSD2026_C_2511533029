package pekan8_2511533029;
import java.util.Scanner;

public class Sorting_2511533029 {

    static Lagu_2511533029[] dataLagu_3029 = new Lagu_2511533029[20];
    static int jumlahLagu_3029 = 0;
    static Scanner scanner_3029 = new Scanner(System.in);
    static void inputData_3029() {
        System.out.print("Masukkan jumlah lagu (min 7, maks 20): ");
        int n_3029 = Integer.parseInt(scanner_3029.nextLine().trim());
        if (n_3029 < 7)
            n_3029 = 7;
        if (n_3029 > 20)
        	n_3029 = 20;
        jumlahLagu_3029 = n_3029;
        System.out.println();
        for (int i_3029 = 0; i_3029 < jumlahLagu_3029; i_3029++) {
            System.out.println( "Lagu ke-" + (i_3029 + 1) );
            System.out.print("Judul : ");
            String judul_3029 = scanner_3029.nextLine();
            System.out.print("Penyanyi : ");
            String penyanyi_3029 = scanner_3029.nextLine();
            System.out.print("Durasi (detik) : ");
            int durasi_3029 = Integer.parseInt(scanner_3029.nextLine().trim());
            dataLagu_3029[i_3029] = new Lagu_2511533029(judul_3029, penyanyi_3029,durasi_3029);
            System.out.println();
        }
    }

    static void shellSort_3029() {
        int gap_3029 = jumlahLagu_3029 / 2;
        while (gap_3029 > 0) {

            for (int i_3029 = gap_3029; i_3029 < jumlahLagu_3029; i_3029++) {
                Lagu_2511533029 temp_3029 = dataLagu_3029[i_3029];
                int j_3029 = i_3029;
                while (j_3029 >= gap_3029&& dataLagu_3029[j_3029 - gap_3029].judul_3029
                		.compareToIgnoreCase(temp_3029.judul_3029) > 0) {
                    dataLagu_3029[j_3029] = dataLagu_3029[j_3029 - gap_3029];
                    j_3029 -= gap_3029;
                }
                dataLagu_3029[j_3029] = temp_3029;
            }
            gap_3029 /= 2;
        }
    }

    static void tampilData_3029(String label_3029) {
        System.out.println(label_3029);
        for (int i_3029 = 0; i_3029 < jumlahLagu_3029; i_3029++) {
            Lagu_2511533029 lagu_3029 = dataLagu_3029[i_3029];
            System.out.printf("%2d. %-30s - %-20s - %d detik%n",i_3029 + 1,lagu_3029.judul_3029,
                              lagu_3029.penyanyi_3029,lagu_3029.durasi_3029);
        }
        System.out.println();
    }
    
    public static void main(String[] args_3029) {

        System.out.println("=== Sorting Playlist NIM: 2511533029 ===");
        System.out.println("          === SHELL SORT ===");
        System.out.println();

        inputData_3029();
        tampilData_3029("─── Data Sebelum Shell Sort ───");
        shellSort_3029();
        tampilData_3029("─── Data Setelah Shell Sort (Judul A-Z) ───");
        scanner_3029.close();
    }
}