package Minggu5;
import java.util.*;
public class MainSum {
    
    static void perubahan(){
    Scanner sc = new Scanner(System.in);
    System.out.println("============================================================");
    System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
    System.out.println("Masukkan jumlah Perusahaan : ");
    int perusahaan = sc.nextInt();

    Sum[] sm = new Sum[perusahaan];
    for (int i=0; i<perusahaan; i++){
        sm[i] =  new Sum();
        System.out.println("============================================================");
        System.out.println("Perusahaan ke-"+(i+1));
        System.out.println("Masukkan jumlah bulan : ");
        sm[i].elemen = sc.nextInt();
        System.out.println("============================================================");
        sm[i].keuntungan = new double [sm[i].elemen];
        for (int j=0; j<perusahaan; j++){
          System.out.println("Masukkan untung bulan ke-"+(j+1)+" = ");
          sm[i].keuntungan[j] = sc.nextDouble();
        }
    }
    System.out.println("============================================================");
    
    Sum dat = new Sum();
    for(int i=0; i<perusahaan; i++){
        System.out.println("Perusahaan ke-"+(i+1));
        System.out.println("Jumlah Bulan : "+ sm[i].elemen);
        System.out.println("");
        System.out.println("Algoritma Brute Force");
        System.out.printf("Total keuntungan perusahaan selama "+ sm[i].elemen 
        + " bulan adalah = %.2f ", dat.totalBF(sm[i].keuntungan));

        System.out.println("\n");
        System.out.println("Algoritma Divide Conquer");
        System.out.printf("Total keuntungan perusahaan selama "+ sm[i].elemen 
        + " bulan adalah = %.2f ", dat.totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
        System.out.println("\n============================================================");
     }
    }
    
    public static void main(String [] args){
    perubahan();

   }

}
