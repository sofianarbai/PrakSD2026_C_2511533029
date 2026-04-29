package pekan4_2511533029;

import java.util.Scanner;

public class Queue_2511533029 {
    public static void main(String[] args) {
        Scanner input_3029 = new Scanner(System.in);
        AntrianLoket_2511533029 antrian_3029 = new AntrianLoket_2511533029(10);

        int pilihan_3029;
        String pelanggan_3029;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_3029 = input_3029.nextInt();

            switch (pilihan_3029) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    pelanggan_3029 = input_3029.next();
                    antrian_3029.enqueue_3029(pelanggan_3029);
                    break;

                case 2:
                    pelanggan_3029 = antrian_3029.dequeue_3029();
                    if (pelanggan_3029 == null) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Pelanggan " + pelanggan_3029 + " telah dilayani");
                    }
                    break;

                case 3:
                    antrian_3029.display_3029();
                    break;

                case 4:
                    antrian_3029.reverse_3029();
                    antrian_3029.display_3029();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilihan_3029 != 5);

        input_3029.close();
    }
}