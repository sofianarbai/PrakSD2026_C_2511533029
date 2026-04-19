package pekan2_2511533029;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533029 {	
	//1. Tampilkan Menu
	    public static void tampilkanMenu_3029 () {
	    System.out.println("\n");
		System.out.println("=== Playlist Musik NIM: 2511533029 === ");
		System.out.println("1. Tambah Lagu");
		System.out.println("2. Tampilkan Isi Playlist");
		System.out.println("3. Hapus Lagu");
		System.out.println("4. Keluar");
	}	
	//2. Method Untuk Tambah Lagu
		public static void tambahLagu_3029(ArrayList<Musik_2511533029> list, Scanner sc) {
		System.out.print("\nMasukkan Judul Lagu: ");
		String judulLagu_3029= sc.nextLine();
		System.out.print("Masukkan Penyanyi: ");
		String penyanyi_3029= sc.nextLine();
		System.out.print("Masukkan Durasi Lagu : ");
		int durasi_3029= sc.nextInt();
		sc.nextLine();
		list.add(new Musik_2511533029(judulLagu_3029, penyanyi_3029, durasi_3029));
		System.out.println("Lagu Berhasil Ditambahkan");
	}		
	//3. Method Untuk Tampilkan Lagu
		public static void tampilkanLagu_3029(ArrayList<Musik_2511533029> list) {
		    if (list.isEmpty()) {
		        System.out.println("Isi Playlist Kosong.");
		    } else {
		        for (Musik_2511533029 lagu : list) {
		            System.out.println(lagu);
		        }
		   }
	}		
	//4. Method Untuk Hapus Lagu
		public static void hapusLagu_3029(ArrayList<Musik_2511533029> list, Scanner sc) {
			System.out.print("Masukkan Lagu yang akan dihapus : ");
			String laguHapus=sc.nextLine();
			boolean removed = list.removeIf (lagu -> lagu.judulLagu_3029.equals(laguHapus));
			
			if (removed) {
				System.out.println("Lagu dengan judul " + laguHapus + " berhasil dihapus.");
			} else {
				System.out.println("Lagu Tidak Ditemukan.");
			}
	}
	//5. Method Utama Program		
		public static void main (String [] args) {
			ArrayList <Musik_2511533029> Lagulist = new ArrayList <>();
			Scanner scanner = new Scanner (System.in);
			int choice;
			do {
				tampilkanMenu_3029();
				System.out.print("Pilih menu: ");
				choice = scanner.nextInt();
				scanner.nextLine(); //consume newline
				
				switch (choice ) {
				case 1:
					tambahLagu_3029(Lagulist, scanner);
					break;
				case 2:
					tampilkanLagu_3029(Lagulist);
					break;
				case 3:
					hapusLagu_3029(Lagulist, scanner);
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