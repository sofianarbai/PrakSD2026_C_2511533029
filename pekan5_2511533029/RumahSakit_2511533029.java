package pekan5_2511533029;

import java.util.Scanner;
public class RumahSakit_2511533029 {
	static Pasien_2511533029 head_3029 = null;
	static int urutan_3029 = 0;
	
	// Menambahkan di akhir
	public static void daftarkanPasien_3029 (String Nama_3029, String Penyakit_3029) {
		urutan_3029++;
		Pasien_2511533029 pasienBaru_3029 = new Pasien_2511533029 (Nama_3029, Penyakit_3029, urutan_3029);
		if (head_3029 == null) {
            head_3029 =  pasienBaru_3029;
	        } else {
	        	Pasien_2511533029 temp_3029 = head_3029;
	            while (temp_3029.next_3029 != null) {
	        	temp_3029 = temp_3029.next_3029;
	        }
	        temp_3029.next_3029 = pasienBaru_3029;
	    }
		System.out.println("Pasien Berhasil Didaftarkan !!, Dengan Nomor Antrian: " + urutan_3029);
	
	}
	
	// Menghapus Antrian Terdepan
	public static void panggilPasien_3029 () {
		if (head_3029 == null) {
			System.out.println("Antrian Kosong, Tidak Ada Nomor Antrian");
			return;
		}
		
		System.out.println("===== Pasien dipanggil =====");
        System.out.println("Nomor Antrian    : " + head_3029.NomorAntrian_3029);
        System.out.println("Nama             : " + head_3029.NamaPasien_3029);
        System.out.println("Penyakit         : " + head_3029.Penyakit_3029);

        head_3029 = head_3029.next_3029;
    }
	
	// Display (Menampilkan Antrian)
	public static void tampilkanAntrian_3029 () {
		if (head_3029 == null) {
			System.out.println("Antrian Kosong");
			return;
		}
		
		Pasien_2511533029 temp_3029 = head_3029;
		System.out.println("===== DAFTAR ANTRIAN PASIEN =====");
	    while (temp_3029 != null) {
	    	System.out.println("Nomor Antrian   : " + temp_3029.NomorAntrian_3029);
	    	System.out.println("Nama Pasien     : " + temp_3029.NamaPasien_3029);
	    	System.out.println("Penyakit        : " + temp_3029.NomorAntrian_3029);
	    	System.out.println();
	    	temp_3029 = temp_3029.next_3029;
	    }
	}
	
	// Mencari Pasien
	public static void cariPasien_3029 (String namaCari_3029) {
		Pasien_2511533029 temp_3029 = head_3029;
		
		while (temp_3029 != null) {
			if (temp_3029.NamaPasien_3029.equalsIgnoreCase(namaCari_3029)) {
				System.out.println("Pasien Ditemukan");
				System.out.println("Nomor Antrian   : " + temp_3029.NomorAntrian_3029);
				System.out.println("Nama Pasien     : " + temp_3029.NamaPasien_3029);
				System.out.println("Penyakit        : " + temp_3029.Penyakit_3029);
				System.out.println("");
				return;
			}
			temp_3029 = temp_3029.next_3029;
		}
		System.out.println("Pasien Tidak Ditemukan");
	}
	
	// Cek status
	public static void cekStatusAntrian_3029 () {
		if (head_3029 == null) {
			System.out.println("Antrian Kosong");
			return;
		}
		
		int jumlah_3029 = 0;
        Pasien_2511533029 temp_3029 = head_3029;

        while (temp_3029 != null) {
            jumlah_3029++;
            temp_3029 = temp_3029.next_3029;
        }

        System.out.println("Jumlah pasien dalam antrian : " + jumlah_3029);
        System.out.println("Pasien terdepan             : " + head_3029.NamaPasien_3029);
    }
	public static void main (String [] args) {
		Scanner input_3029 = new Scanner (System.in);
		int pilihan_3029;
		
		do {
			System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533029 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien   (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien      (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3029 = input_3029.nextInt();
            input_3029.nextLine();
            switch (pilihan_3029) {
            case 1:
                System.out.print("Masukkan Nama Pasien : ");
                String nama_3029 = input_3029.nextLine();
                System.out.print("Masukkan Penyakit    : ");
                String keluhan_3029 = input_3029.nextLine();
                daftarkanPasien_3029(nama_3029, keluhan_3029);
                break;

            case 2:
                panggilPasien_3029();
                break;

            case 3:
                tampilkanAntrian_3029();
                break;

            case 4:
                System.out.print("Masukkan nama pasien yang dicari: ");
                String cari_3029 = input_3029.nextLine();
                cariPasien_3029(cari_3029);
                break;

            case 5:
                cekStatusAntrian_3029();
                break;

            case 6:
                System.out.println("Program selesai.");
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }
    } while (pilihan_3029 != 6);

    input_3029.close();
   }
}