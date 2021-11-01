package Tugas;
import java.util.*;
public class Array2DMain {
    
    static void menu(){
        Scanner sc = new Scanner(System.in);        
        Array2D arr = new Array2D(4,6);
        int[] array[] = new int[arr.baris][arr.kolom];
        int ulang = 0;
        do{
            System.out.println("=======================================================================");
            System.out.println("  PENCARIAN DATA ARRAY 2 DIMENSI DENGAN MENGGUNAKAN SEARCH SEQUENTIAL  ");
            System.out.println("=======================================================================");
            System.out.println("Pilih menu dibawah ini!");
            System.out.println("1. Memunculkan Data input dan Data pencarian sequential");
            System.out.println("0. Keluar");
            System.out.println("--------------------------------------------");
            System.out.println("Pilihah menu :");
            int pilih = sc.nextInt();
            System.out.println("--------------------------------------------");
            if(pilih == 1){
                Array2DService ary = new Array2DService();
                ary.pencarian();
                continue;
//            }else if(pilih == 2){
//                Array2DService ary = new Array2DService();
//                ary.tampil(arr.baris, arr.kolom);

            }else if(pilih==0){
                System.out.println("Anda telah keluar dari program");
                break;
            }else{
                System.out.println("Menu yang anda berikan tidak tersedia");
            }
        }
        
        while(ulang !=0 || ulang<3);
    }
    
    public static void main(String[] args) {
        menu();
    }
}
        
