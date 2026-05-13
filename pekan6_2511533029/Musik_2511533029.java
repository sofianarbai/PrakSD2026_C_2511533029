package pekan6_2511533029;
import java.util.Scanner;

public class Musik_2511533029 {
	 // pointer head dan tail
    Lagu_2511533029 head_3029 = null;
    Lagu_2511533029 tail_3029 = null;

    // 1. menambah lagu di akhir playlist
    public void tambahLagu_3029(String judul_3029, String penyanyi_3029) {
        Lagu_2511533029 laguBaru_3029 =
                new Lagu_2511533029(judul_3029, penyanyi_3029);

        // jika playlist kosong
        if (head_3029 == null) {
            head_3029 = laguBaru_3029;
            tail_3029 = laguBaru_3029;
        } else {
            tail_3029.next_3029 = laguBaru_3029;
            laguBaru_3029.prev_3029 = tail_3029;
            tail_3029 = laguBaru_3029;
        }

        System.out.println("Lagu berhasil ditambahkan!");
    }

    // 2. menghapus lagu pertama
    public void hapusLaguAwal_3029() {
        if (head_3029 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        System.out.println("Lagu \"" + head_3029.getJudul_3029()
                + "\" berhasil dihapus.");

        // jika hanya ada satu node
        if (head_3029 == tail_3029) {
            head_3029 = null;
            tail_3029 = null;
        } else {
            head_3029 = head_3029.next_3029;
            head_3029.prev_3029 = null;
        }
    }

    // 3. menampilkan playlist dari awal ke akhir
    public void tampilMaju_3029() {
        if (head_3029 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511533029 curr_3029 = head_3029;
        int nomor_3029 = 1;

        while (curr_3029 != null) {
            System.out.println(nomor_3029 + ". "
                    + curr_3029.getJudul_3029()
                    + " - "
                    + curr_3029.getPenyanyi_3029());
            curr_3029 = curr_3029.next_3029;
            nomor_3029++;
        }
    }

    // 4. menampilkan playlist dari akhir ke awal
    public void tampilMundur_3029() {
        if (tail_3029 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511533029 curr_3029 = tail_3029;
        int nomor_3029 = 1;

        while (curr_3029 != null) {
            System.out.println(nomor_3029 + ". "
                    + curr_3029.getJudul_3029()
                    + " - "
                    + curr_3029.getPenyanyi_3029());
            curr_3029 = curr_3029.prev_3029;
            nomor_3029++;
        }
    }

    // 5. mencari lagu berdasarkan judul (tidak case-sensitive)
    public void cariLagu_3029(String judul_3029) {
        if (head_3029 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511533029 curr_3029 = head_3029;
        boolean ditemukan_3029 = false;

        while (curr_3029 != null) {
            if (curr_3029.getJudul_3029()
                    .equalsIgnoreCase(judul_3029)) {
                System.out.println("Lagu ditemukan:");
                System.out.println("Judul    : "
                        + curr_3029.getJudul_3029());
                System.out.println("Penyanyi : "
                        + curr_3029.getPenyanyi_3029());
                ditemukan_3029 = true;
                break;
            }
            curr_3029 = curr_3029.next_3029;
        }

        if (!ditemukan_3029) {
            System.out.println("Lagu tidak ditemukan.");
        }
    }

    // menu utama
    public static void main(String[] args) {
        Scanner input_3029 = new Scanner(System.in);
        Musik_2511533029 playlist_3029 =
                new Musik_2511533029();

        int pilihan_3029;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511533029 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3029 = input_3029.nextInt();
            input_3029.nextLine();

            switch (pilihan_3029) {
                case 1:
                    System.out.print("Judul: ");
                    String judul_3029 = input_3029.nextLine();

                    System.out.print("Penyanyi: ");
                    String penyanyi_3029 =
                            input_3029.nextLine();

                    playlist_3029.tambahLagu_3029(
                            judul_3029,
                            penyanyi_3029
                    );
                    break;

                case 2:
                    playlist_3029.hapusLaguAwal_3029();
                    break;

                case 3:
                    System.out.println("\nPlaylist (Maju):");
                    playlist_3029.tampilMaju_3029();
                    break;

                case 4:
                    System.out.println("\nPlaylist (Mundur):");
                    playlist_3029.tampilMundur_3029();
                    break;

                case 5:
                    System.out.print("Masukkan judul lagu: ");
                    String cari_3029 =
                            input_3029.nextLine();
                    playlist_3029.cariLagu_3029(cari_3029);
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_3029 != 6);

        input_3029.close();
    }

}
