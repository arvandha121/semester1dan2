package Jobsheet2Praktikum;
public class Sewa {
    String namaMember, namaGame;
    int id, lamaPeminjaman;
    int hargaSewaGame;
    
    void sewaGame(){
        System.out.println("Masukkan id = "+id);
        System.out.println("Masukkan Nama Member = "+namaMember);
        System.out.println("Masukkan Nama Game = "+namaGame);
        System.out.println("Masukkan Lama Peminjaman = "+lamaPeminjaman+" hari");
        System.out.println("Masukkan Harga Sewa Game = "+hargaSewaGame);
    }
    int hitungHargaTotal(int total){
        return lamaPeminjaman*hargaSewaGame;
    }
}
