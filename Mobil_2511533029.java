package pekan1_2511533029;

public class Mobil_2511533029 {
    // --- Atribut ---
    private String nama;
    private int tahun;
    private int cc;
    private long harga;
    private String merk;
    
    // --- Validator ---
    public static boolean isValid(int tahun, int cc, long harga) {
        return (tahun >= 1900 && tahun <= 2026) && 
               (cc > 0 && cc <= 10000) && 
               (harga > 0);
    }
    
    // --- Konstruktor / Kreator ---
    public Mobil_2511533029(String nama, int tahun, int cc, long harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }
    
    // --- Selektor (Getter) ---
    public String getNama() { return nama; }
    public int getTahun() { return tahun; }
    public int getCc() { return cc; }
    public long getHarga() { return harga; }
    public String getMerk() { return merk; }
    
    // --- Mutator (Setter) ---
    public void setNama(String nama) { this.nama = nama; }
    public void setTahun(int tahun) { 
        if (tahun >= 1900 && tahun <= 2026) this.tahun = tahun; 
    }
    public void setCc(int cc) { 
        if (cc > 0 && cc <= 10000) this.cc = cc; 
    }
    public void setHarga(long harga) { 
        if (harga > 0) this.harga = harga; 
    }
    public void setMerk(String merk) { this.merk = merk; }
    
    // --- Relasional ---
    public int compareTo(Mobil_2511533029 other) { 
        return Long.compare(this.harga, other.harga); 
    }
    
    @Override
    public String toString() { 
        return String.format("%s %s (%d) - %d cc - Rp %,d", 
                           merk, nama, tahun, cc, harga); 
    }
}