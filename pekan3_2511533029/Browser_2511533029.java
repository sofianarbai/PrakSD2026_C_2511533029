package pekan3_2511533029;
import java.util.Stack;
import java.util.Scanner;

public class Browser_2511533029 {
	//1. Tampilkan Menu
    public static void tampilkanMenu_3029 () {
	System.out.println("\n=== Browser History NIM: 2511533029 === ");
	System.out.println("1. Kunjungi Website (Push) ");
	System.out.println("2. Tombol Back (Pop) ");
	System.out.println("3. Lihat Halaman Aktif (Peek) ");
	System.out.println("4. Keluar");
}	
//2. Method Untuk Kunjungi Website (Push)
	public static void kunjungiWebsite_3029(Stack<Website_2511533029> stack, Scanner sc) {
	System.out.print("\nMasukkan Judul Website: ");
	String judulWebsite_3029= sc.nextLine();
	
	System.out.print("Masukkan URL: ");
	String URLWebsite_3029= sc.nextLine();
	
	stack.push(new Website_2511533029(judulWebsite_3029, URLWebsite_3029));
	System.out.println(" Berhasil Mengunjungi Halaman");
}		
//3. Method Untuk Tombol Back (Pop)
	public static void tombolBack_3029(Stack<Website_2511533029> stack) {
	    if (stack.isEmpty()) {
	        System.out.println("History Kosong.");
	    } else {
	        Website_2511533029 website = stack.pop();
	        System.out.println("Kembali dari website: " + website.judulWebsite_3029);
	        }
	   }
		
//4. Method Untuk Lihat Halaman Aktif (Peek)
	public static void lihathalamanAktif_3029(Stack<Website_2511533029> stack) {
		if (stack.isEmpty()) {
			System.out.println("Halaman Aktif Kosong");
		} else {
			Website_2511533029 website = stack.peek();
			System.out.println("Halaman Yang Sedang Aktif: " + website);
		}
	}
//5. Method Utama Program		
	public static void main (String [] args) {
		Stack <Website_2511533029> websiteStack = new Stack <>();
		Scanner scanner = new Scanner (System.in);
		int choice;
		do {
			tampilkanMenu_3029();
			System.out.print("Pilihan: ");
			choice = scanner.nextInt();
			scanner.nextLine(); //consume newline
			
			switch (choice ) {
			case 1:
				kunjungiWebsite_3029(websiteStack, scanner);
				break;
			case 2:
				tombolBack_3029(websiteStack);
				break;
			case 3:
				lihathalamanAktif_3029(websiteStack);
				break;
			case 4:
				System.out.println(" Keluar dari program.");
				break;
				default:
				System.out.println("pilihan tidak valid. ");
			}
		}
		while (choice !=4);
		scanner.close();
  }
}
