package pekan3_2511533029;

public class Website_2511533029 {
	String judulWebsite_3029;
	String URLWebsite_3029;
	
	//Konstruktor
	public Website_2511533029(String judulWebsite_3029, String URLWebsite_3029) {
		this.judulWebsite_3029 = judulWebsite_3029;
		this.URLWebsite_3029 = URLWebsite_3029;
	}
	
	//Selektor
	public String getjudulWebsite_3029() { return judulWebsite_3029; }
	public String getURLWebsite_3029() { return URLWebsite_3029;}
	
	
	//Mutator
	public void setjudulWebsite_3029 (String judulWebsite_3029) {
		this.judulWebsite_3029 = judulWebsite_3029;
	}
	public void setURLWebsite_3029 (String URLWebsite_3029) {
		this.URLWebsite_3029 = URLWebsite_3029;
	}
	
	@Override
	public String toString () { 
		return "Judul Website : " + judulWebsite_3029 + ", URL Website : " + URLWebsite_3029;
		       
	}

}

