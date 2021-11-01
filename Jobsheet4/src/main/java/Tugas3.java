import java.util.Scanner;

public class Tugas3{
    public static void main(String[] args){
        
        int UAS, UTS, KUIS, TUGAS;
        float persUAS, persUTS, persKUIS, persTUGAS;
        float nilai_akhir;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Masukkan nilai UAS anda:\t\t");
        UAS=input.nextInt();
        System.out.println("Masukkan nilai UTS anda:\t\t");
        UTS=input.nextInt();
        System.out.println("Masukkan nilai KUIS anda:\t\t");
        KUIS=input.nextInt();
        System.out.println("Masukkan nilai TUGAS anda:\t\t");
        TUGAS=input.nextInt();
        
        persUAS = UAS * 40/100;
        persUTS = UTS * 30/100;
        persKUIS = KUIS * 10/100;
        persTUGAS = TUGAS * 20/100;
        
        nilai_akhir = persUAS + persUTS + persKUIS + persTUGAS;
        System.out.println("nilai keseluruhan adalah=\t\t" +nilai_akhir);
        
        if (nilai_akhir>=65){
            System.out.println("anda tidak mengikuti remidi");
        }
        else if (nilai_akhir<=65){
            System.out.println("anda harus mengikuti remidi");
        }
        
    }
}