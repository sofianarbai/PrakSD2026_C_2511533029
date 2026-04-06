package pekan2_2511533029;

public class DaftarKataDriver_2511533029 {

	public static void main(String[] args) {
		DaftarKata_2511533029 al =new DaftarKata_2511533029();
		
		//menambah elemen (akhir)
		al.tambah_2511533029("Kami");
		al.tambah_2511533029("Informatika");
		
		//menyisipkan elemen pada indeks 1
		al.tambahPada_2511533029(1, "Mahasiswa");
		
		//cetak isi awal
		System.out.println("awal           : " + al);
		
		//mengubah elemen (indeks 1)
		al.ubahElemen_2511533029(1, "Departemen");
		System.out.println("setelah ubah   : " +al);
		
		//menghapus elemen (indeks 0)
		String terhapus= al.hapusElemen_2511533029(0);
		System.out.println("terhapus       : " + terhapus);
		System.out.println("setelah hapus  :" + al);
		
		//iterasi pada arrray list (cetak setiap elemen)
		System.out.print("Iterasi        :");
		al.iterasiCetak_2511533029();
		System.out.println();
		
	}

}
