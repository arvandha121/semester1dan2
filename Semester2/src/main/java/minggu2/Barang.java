package minggu2;

public class Barang {
    String namaBarang, jenisBarang;
    int Stok, hargaSatuan;
    
    Barang(){
    }
    
    Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        Stok = st;
        hargaSatuan = hs;
    }
    
    void tampilBarang(){
        System.out.println("Nama = "+namaBarang);
        System.out.println("Jenis = "+jenisBarang);
        System.out.println("Stok = "+Stok);
        System.out.println("Harga Satuan = "+hargaSatuan);
    }
    void tambahStok(int n){
        Stok= Stok + n;
    }
    void kurangiStok(int n){
//        if(Stok-n<0){
//            return;
//        }
        Stok = Stok - n;
    }
    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }
}