package pekan2_2511533029;

public class Musik_2511533029 {
	String judulLagu_3029;
	String penyanyi_3029;
	int durasi_3029;
	
	//Konstruktor
	public Musik_2511533029(String judulLagu_3029, String penyanyi_3029, int durasi_3029) {
		this.judulLagu_3029 = judulLagu_3029;
		this.penyanyi_3029 = penyanyi_3029;
		this.durasi_3029 = durasi_3029;
	}
	
	//Selektor
	public String getjudulLagu_3029() { return judulLagu_3029; }
	public String getpenyanyi_3029() { return penyanyi_3029;}
	public int getdurasi_3029() { return durasi_3029;}
	
	//Mutator
	public void setjudulLagu_3029 (String judulLagu_3029) {
		this.judulLagu_3029 = judulLagu_3029;
	}
	public void setpenyanyi_3029 (String penyanyi_3029) {
		this.penyanyi_3029 = penyanyi_3029;
	}
	public void setdurasi_3029 (int durasi_3029) {
		this.durasi_3029 = durasi_3029;
	}
	
	@Override
	public String toString () { 
		return "Judul Lagu : " + judulLagu_3029 + ", Penyanyi : " + penyanyi_3029 + ", Durasi : " + durasi_3029;
		       
	}

}
