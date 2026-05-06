package pekan5_2511533029;
public class Pasien_2511533029 {
	String NamaPasien_3029;
	String Penyakit_3029;
	int NomorAntrian_3029;
	Pasien_2511533029 next_3029;
	
	// Konstruktor
	public Pasien_2511533029(String nama_3029, String penyakit_3029, int NomorAntrian_3029) {
	    this.NamaPasien_3029 = nama_3029;
	    this.Penyakit_3029 = penyakit_3029;
	    this.NomorAntrian_3029 = NomorAntrian_3029;
	    this.next_3029 = null;
	}
	// Getter
	public String getNamaPasien_3029 () {
		return NamaPasien_3029;
	}
	public String getPenyakit_3029 () {
		return Penyakit_3029;
	}
	public int getNomorAntrian_3029 () {
		return NomorAntrian_3029;
	}
	public Pasien_2511533029 getNext_3029 () {
		return next_3029;
	}	
	// Setter
	public void setNamaPasien_3029 (String namaPasien_3029) {
        this.NamaPasien_3029 = namaPasien_3029;
    }
	public void setPenyakit_3029 (String penyakit_3029) {
        this.Penyakit_3029 = penyakit_3029;
    }
	public void setNomorAntrian_3029 (int nomorAntrian_3029) {
        this.NomorAntrian_3029 = nomorAntrian_3029;
    }
	public void setnext_3029 (Pasien_2511533029 next_3029) {
		this.next_3029 = next_3029;
	}
}