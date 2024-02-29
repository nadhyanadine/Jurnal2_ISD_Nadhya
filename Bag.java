import java.util.ArrayList;

public class Bag {
    private String KodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stok;
    
    public Bag(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
        this.KodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }
    public String getKodeBarang() {
        return this.KodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        this.KodeBarang = kodeBarang;
    }
    public String getJenisBarang() {
        return this.jenisBarang;
    }
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
    public String getNamaBarang() {
        return this.namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public int getStok() {
        return this.stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    @Override
    public String toString() {
        return "Atk [KodeBarang=" + this.KodeBarang + ", jenisBarang=" + this.jenisBarang + ", namaBarang=" + this.namaBarang
                + ", stok=" + this.stok + "]";
        
    }
}