package pekan6_2511533029;

public class Lagu_2511533029 {
	// atribut node
    private String judul_3029;
    private String penyanyi_3029;
    Lagu_2511533029 next_3029;
    Lagu_2511533029 prev_3029;

    // constructor
    public Lagu_2511533029(String judul_3029, String penyanyi_3029) {
        this.judul_3029 = judul_3029;
        this.penyanyi_3029 = penyanyi_3029;
        this.next_3029 = null;
        this.prev_3029 = null;
    }

    // getter
    public String getJudul_3029() {
        return judul_3029;
    }

    public String getPenyanyi_3029() {
        return penyanyi_3029;
    }

    // setter
    public void setJudul_3029(String judul_3029) {
        this.judul_3029 = judul_3029;
    }

    public void setPenyanyi_3029(String penyanyi_3029) {
        this.penyanyi_3029 = penyanyi_3029;
    }

}
