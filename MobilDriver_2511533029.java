package pekan1_2511533029;
import java.util.Scanner;

public class MobilDriver_2511533029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // --- ARRAY MANUAL ---
        Mobil_2511533029[] garage = new Mobil_2511533029[5];
        int count = 0;
        
        System.out.println("=== ADT MOBIL ===");
        
        // --- 1. TAMBAH MOBIL ---
        System.out.println("--- Tambah Mobil 1 ---");
        System.out.print("Nama: "); String n1 = sc.nextLine();
        System.out.print("Tahun: "); int t1 = sc.nextInt();
        System.out.print("CC: "); int c1 = sc.nextInt();
        System.out.print("Harga: "); long h1 = sc.nextLong();
        sc.nextLine();
        System.out.print("Merk: "); String m1 = sc.nextLine();
        
        if (Mobil_2511533029.isValid(t1, c1, h1)) {
            garage[count++] = new Mobil_2511533029(n1, t1, c1, h1, m1);
            System.out.println("✓ Mobil ditambahkan.\n");
        }
        
        // --- 2. TAMBAH MOBIL 2 ---
        System.out.println("--- Tambah Mobil 2 ---");
        System.out.print("Nama: "); String n2 = sc.nextLine();
        System.out.print("Tahun: "); int t2 = sc.nextInt();
        System.out.print("CC: "); int c2 = sc.nextInt();
        System.out.print("Harga: "); long h2 = sc.nextLong();
        sc.nextLine();
        System.out.print("Merk: "); String m2 = sc.nextLine();
        
        if (Mobil_2511533029.isValid(t2, c2, h2) && count < 5) {
            garage[count++] = new Mobil_2511533029(n2, t2, c2, h2, m2);
            System.out.println("✓ Mobil ditambahkan.\n");
        }
        
        // --- 3. TAMPILKAN (Selektor + toString) ---
        System.out.println("--- Daftar Mobil ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + ". " + garage[i]);
        }
        
        // --- 4. RELASIONAL ---
        if (count >= 2) {
            System.out.println("\n--- Bandingkan Harga ---");
            int cmp = garage[0].compareTo(garage[1]);
            if (cmp < 0) System.out.println(garage[0].getNama() + " lebih murah");
            else if (cmp > 0) System.out.println(garage[0].getNama() + " lebih mahal");
            else System.out.println("Harga sama");
        }
        
        // --- 5. MUTATOR  ---
        if (count > 0) {
            System.out.println("\n--- Edit Harga (Mutator) ---");
            System.out.println("Sebelum: " + garage[0]);
            garage[0].setHarga(garage[0].getHarga() + 5000000);
            System.out.println("Sesudah: " + garage[0]);
        }
        
        // --- 6. HAPUS MOBIL ---
        System.out.println("\n--- Hapus Mobil 1 ---");
        if (count > 0) {
            for (int i = 0; i < count - 1; i++) {
                garage[i] = garage[i + 1]; 
            }
            garage[count - 1] = null;
            count--;
            System.out.println("✓ Mobil dihapus.\n");
        }
        
        // --- 7. TAMPILKAN SISA ---
        System.out.println("--- Sisa Mobil ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + ". " + garage[i]);
        }
        if (count == 0) System.out.println("Garage kosong.");
        
        sc.close();
        System.out.println("\nProgram Selesai.");
    }
}