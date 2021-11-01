package Jobsheet1Praktikum;
import java.util.*;
public class praktikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Progrqam Menghitung Nilai Akhir");
        System.out.println("=================================");
        System.out.println("Masukkan nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.println("Masukkan nilai UTS: ");
        int uts = sc.nextInt();
        System.out.println("Masukkan nilai UAS: ");
        int uas = sc.nextInt();
        System.out.println("=================================");
        float akhir = (tugas + uts + uas)/3;
        int a = (int) akhir;
        System.out.println("nilai akhir: "+akhir);
        if(akhir<=100){
            System.out.println("A");
        }else if(akhir>=80){
            System.out.println("B+");
        }else if(akhir<=80){
            System.out.println("B");
        }else if(akhir<=73){
            System.out.println("C+");
        }else if(akhir<=65){
            System.out.println("C");
        }else if(akhir<=50){
            System.out.println("D");
        }else if(akhir<=39){
            System.out.println("E");
        }
        
        if(akhir>=50){
            System.out.println("Anda Lulus");
        }else{
            System.out.println("Anda Tidak Lulus");
        }
    }
}
