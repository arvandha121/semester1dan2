package Jobsheet2Praktikum;

public class Barang {
    String nama;
    int hargaSatuan, jumlah;
    
    int hitungHargaTotal(){
        return hargaSatuan*jumlah;
    }
    int hitungDiskon(){
        int diskon = hitungHargaTotal();
        if(hargaSatuan*jumlah >100000){
            diskon = (hargaSatuan*jumlah) * 10/100;
            System.out.println("Anda Mendapatkan Diskon 10%");
        }else if(hargaSatuan*jumlah >= 50000 && hargaSatuan*jumlah <= 100000){
            diskon = (hargaSatuan*jumlah) * 5/100;
            System.out.println("Anda Mendapatkan Diskon 5%");
        } else if(hargaSatuan*jumlah >= 0 && hargaSatuan*jumlah <= 50000){
            diskon = (hargaSatuan*jumlah) * 0/100;
            System.out.println("Anda Tidak Mendapatkan Diskon");
        }
        return diskon;
    }
    int hitungBayarDiskon(){
        int total = hitungHargaTotal() - hitungDiskon();
        System.out.println("Harga Barang Yang Dibayar = "+total);
        return total;
    }
}