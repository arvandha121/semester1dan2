package Tugas2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("\t\tStruk Belanjaan");
        System.out.println("====================================================");
        System.out.println("Masukkan Banyak Struk : ");
        int banyak = sc.nextInt();
        System.out.println("----------------------------------------------------");
        Belanjaan bj = new Belanjaan(banyak);
        int TotalHarga = 0;
        int jmh, Harga;
        for (int i = 0; i < banyak; i++) {
            System.out.println("Masukkan id struk : ");
            String id = sc2.nextLine();
            System.out.println("Masukkan Tanggal Pembelian : ");
            String tanggal = sc2.nextLine();
            System.out.println("Masukkan Nama Barang : ");
            String nb = sc2.nextLine();
            System.out.println("Masukkan Jumlah Barang Pembeian : ");
            jmh = sc.nextInt();
            System.out.println("Masukkan Harga Barang Pembelian : ");
            Harga = sc.nextInt();
            TotalHarga = jmh * Harga;
            StrukBelanjaan sb = new StrukBelanjaan(id, tanggal, nb, jmh, Harga);
            bj.push(sb);
            System.out.println("Total Harga total Barang ke-"+(i+1)+" : "+TotalHarga);
        }
        
        int ulang = 0;
        do{
            System.out.println("================================================");
            System.out.println("\t\tMenu List");
            System.out.println("================================================");
            System.out.println("Pilih menu dibawah ini!");
            System.out.println("1. Tampil Struk");
            System.out.println("2. Menampilkan struk teratas");
            System.out.println("3. Mengambil 5 struk untuk ditukar kupon");
            System.out.println("4. Kosongkan data");
            System.out.println("0. Keluar");
            System.out.println("Pilihah menu :");
            int pilih = sc.nextInt();
            System.out.println("------------------------------------------------");
            if(pilih == 1){
                bj.print();
                continue;
            }else if(pilih == 2){
                bj.peek();
                bj.print();
                continue;
            }else if(pilih == 3){
                bj.pop();
                bj.pop();
                bj.pop();
                bj.pop();
                bj.pop();
                bj.print();
            }else if(pilih == 4){
                bj.clear();
                continue;
            }else if(pilih == 0){
                System.out.println("Anda telah keluar dari program");
                break;
            }else{
                System.out.println();
                System.out.println("Inputan Menu yang anda berikan tidak tersedia");
                System.out.println();
            }
        }while(ulang !=0 || ulang<3);
        
    }
}
