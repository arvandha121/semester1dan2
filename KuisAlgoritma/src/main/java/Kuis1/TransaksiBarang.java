package Kuis1;
import java.util.*;
public class TransaksiBarang {
    String Barangs;
    
    void Tampil(){
        Barang[] barang = new Barang[5];
        barang[0] = new Barang();
            barang[0].kode = "K01";
            barang[0].nama = "Sabun";
            barang[0].harga = 1000;
            barang[0].stok = 5;

            barang[1] = new Barang();        
            barang[1].kode = "K02";
            barang[1].nama = "Pasta Gigi";
            barang[1].harga = 2000;
            barang[1].stok = 10;

            barang[2] = new Barang();
            barang[2].kode = "K03";
            barang[2].nama = "Biore";
            barang[2].harga = 3000;
            barang[2].stok = 23;

            barang[3] = new Barang();
            barang[3].kode = "K04";
            barang[3].nama = "Shampoo";
            barang[3].harga = 4000;
            barang[3].stok = 55;

            barang[4] = new Barang();
            barang[4].kode = "K05";
            barang[4].nama = "Sikat Gigi";
            barang[4].harga = 6000;
            barang[4].stok = 65;
            System.out.println("-------------------------------------");
            System.out.println("Kode    Nama           Harga     Stok");
            System.out.println(barang[0].kode+"     "+barang[0].nama+"     \t"+barang[0].harga+"     "+barang[0].stok);
            System.out.println(barang[1].kode+"     "+barang[1].nama+"     "+barang[1].harga+"     "+barang[1].stok);
            System.out.println(barang[2].kode+"     "+barang[2].nama+"     \t"+barang[2].harga+"     "+barang[2].stok);
            System.out.println(barang[3].kode+"     "+barang[3].nama+"   \t"+barang[3].harga+"     "+barang[3].stok);
            System.out.println(barang[4].kode+"     "+barang[4].nama+"\t"+barang[4].harga+"     "+barang[4].stok);
            System.out.println("-------------------------------------");
    }
    
    void beli(){
        Scanner sc = new Scanner(System.in);

        Tampil();
        System.out.println("masukkan banyak kode yang dimasukkan = ");
        int code = sc.nextInt();
        Barang[] sgArray = new Barang[code];
        for (int i = 0; i<sgArray.length; i++) {
            sgArray[i] = new Barang();
            System.out.println("PILIH KODE DIBAWAH");
            System.out.println("1. K01");
            System.out.println("2. K02");
            System.out.println("3. K03");
            System.out.println("4. K04");
            System.out.println("5. K05");
            System.out.println("pilih = ");
            int pilih = sc.nextInt();
            if(code == 1){
                System.out.println("");
            }
            else if(code == 2){
                System.out.println("");
            }
            else if(code == 3){
                System.out.println("");
            }
            else if(code == 4){
                System.out.println("");
            }
            else if(code == 5){
                System.out.println("");
            }
            else{
                System.out.println("Kode yang anda masukkan tidak tersedia");
            }
            System.out.println("--------------------------------------------");
            
        }
    }
    void tampilBeli(){
        Barang[] barang = new Barang[5];
        barang[0] = new Barang();
            barang[0].kode = "K01";
            barang[0].nama = "Sabun";
            barang[0].harga = 1000;
            barang[0].stok = 5;

            barang[1] = new Barang();        
            barang[1].kode = "K02";
            barang[1].nama = "Pasta Gigi";
            barang[1].harga = 2000;
            barang[1].stok = 10;

            barang[2] = new Barang();
            barang[2].kode = "K03";
            barang[2].nama = "Biore";
            barang[2].harga = 3000;
            barang[2].stok = 23;

            barang[3] = new Barang();
            barang[3].kode = "K04";
            barang[3].nama = "Shampoo";
            barang[3].harga = 4000;
            barang[3].stok = 55;
            
            barang[4] = new Barang();
            barang[4].kode = "K05";
            barang[4].nama = "Sikat Gigi";
            barang[4].harga = 6000;
            barang[4].stok = 65;
            
        System.out.println("========================");
        System.out.println("List Belanjaan");
        System.out.println("========================");
        System.out.println("Kode    Nama           Harga     Stok");
        System.out.println(barang[0].kode+"     "+barang[0].nama+"     \t"+barang[0].harga+"     "+barang[0].stok);
        System.out.println(barang[3].kode+"     "+barang[3].nama+"   \t"+barang[3].harga+"     "+barang[3].stok);
        System.out.println(barang[4].kode+"     "+barang[4].nama+"\t"+barang[4].harga+"     "+barang[4].stok);
    }
}
