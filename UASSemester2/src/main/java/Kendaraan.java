public class Kendaraan{
    String TNKB, nama, jenis;
    int cc,tahun,bulanHarusBayar;
 
    public Kendaraan(){
    }

    public Kendaraan(String TNKB, String nama, String jenis, int cc,int tahun, int bulanHarusBayar ){
        this.TNKB = TNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }
    public String getTNKB() {
        return TNKB;
    }
    public void setTNKB(String TNKB) {
        this.TNKB = TNKB;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public int getBulanHarusBayar() {
        return bulanHarusBayar;
    }
    public void setBulanHarusBayar(int bulanBayar) {
        this.bulanHarusBayar = bulanBayar;
    }
    public void printKdr(){
        System.out.printf("|"+TNKB+"|"+nama+"|"+jenis+"|"+cc+"|"+tahun+"|"+bulanHarusBayar+"|\n");
        System.out.print("-------------------------------------------------------------------");
    }
}