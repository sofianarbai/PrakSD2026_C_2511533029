package pekan2_2511533029;
import java.util.ArrayList;
public class DaftarKata_2511533029 {
	private final ArrayList <String> data;
	//konstruktor
	public DaftarKata_2511533029() {
		this.data = new ArrayList <>();
	}
	/** menambahkan elemen di akhir list.*/
	public void tambah_2511533029 (String elemen) {
		data.add(elemen);
	}
	/** menambahkan elemen pada indeks tertentu (menyisipkan).*/
	public void tambahPada_2511533029(int index, String elemen) {
		data.add(index, elemen);
	}
	/**
     * mengubah elemen pada posisi 'index' menjadi 'nilaibaru'.
     * bertindak sebagai "setter" untuk elemen tertentu.
	 */
	public void ubahElemen_2511533029(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
	}
	/**
	 * menghapus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus.
	 */
	public String hapusElemen_2511533029(int index) {
		return data.remove(index);
	}
	/**
	 * melakukan iterasi dan mencetak setiap elemen dalam format : [indeks] nilai
	 * (metode ini tidak mengembalikan nilai; hanya demostrasi iterasi).
	 */
	public void iterasiCetak_2511533029() {
		for (int i =0; i < data.size(); i++) {
			System.out.print(data.get(i)+ " ");
		}
	}
	/**mengambil elemen berdasarkan indeks.*/
	public String get_2511533029(int index) {
		return data.get(index);
	}
	
	//representasi string agar mudah dicetak
	@Override
	public String toString() {
		return data.toString();
	}

}
