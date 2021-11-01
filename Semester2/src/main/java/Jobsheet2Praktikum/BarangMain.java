package Jobsheet2Praktikum;
import java.util.*;
public class BarangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang brg = new Barang();
        System.out.println("Masukkan Nama Barang = ");
        brg.nama = sc.nextLine();
        System.out.println("Masukkan Jumlah Harga Satuan Barang = ");
        brg.hargaSatuan = sc.nextInt();
        System.out.println("Masukkan Jumlah Barang = ");
        brg.jumlah = sc.nextInt();
        brg.hitungBayarDiskon();
    }
}
