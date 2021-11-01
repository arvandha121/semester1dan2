package Pratikum;
import java.util.*;
public class NilaiAlgoritmaMain {
    
    static void pertanyaan1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("======================Pertanyaan Nomer 1======================");
        System.out.println("");
        NilaiAlgoritma algoritma = new NilaiAlgoritma();
        System.out.println("Masukkan Nama Mahasiswa = ");
        algoritma.namaMhs = sc.nextLine();
        
        System.out.println("Masukkan nilai tugas : ");
        algoritma.nilaiTugas = sc.nextInt();
        System.out.println("Masukkan nilai kuis : ");
        algoritma.nilaiKuis = sc.nextInt();
        System.out.println("Masukkan nilai UTS : ");
        algoritma.nilaiUTS = sc.nextInt();
        System.out.println("Masukkan nilai UAS : ");
        algoritma.nilaiUAS = sc.nextInt();
        float n1 = algoritma.nilaiTugas * 30 / 100;
        float n2 = algoritma.nilaiKuis * 20 / 100;
        float n3 = algoritma.nilaiUTS * 20 / 100;
        float n4 = algoritma.nilaiUAS * 30 / 100;
            
        float nilaiTotal = n1 + n2 + n3 + n4;
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Nama Mahasiswa = "+algoritma.namaMhs);
        System.out.println("Nilai Tugas = "+algoritma.nilaiTugas);
        System.out.println("Nilai Kuis = "+algoritma.nilaiKuis);
        System.out.println("Nilai UTS = "+algoritma.nilaiUTS);
        System.out.println("Nilai UAS = "+algoritma.nilaiUAS);
        System.out.println("-----------------------------------");
        System.out.println("Jadi Total Nilai "+algoritma.namaMhs+" adalah = "+nilaiTotal);
        System.out.print("\n");
    }
    
    static void pertanyaan2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================Pertanyaan Nomer 2======================");
        System.out.println("");
        System.out.println("Masukan Jumlah Mahasiswa : ");
        int mhs = sc.nextInt();
        
        NilaiAlgoritma[] alg = new NilaiAlgoritma[mhs];
        for (int i = 0; i < mhs; i++) {
            alg[i] = new NilaiAlgoritma();
            System.out.println("=====================================================");
            System.out.println("Masukkan nama mahasiswa : ");
            alg[i].namaMhs = sc.next();
            System.out.println("=====================================================");
            System.out.println(alg[i].namaMhs);
            System.out.println("Masukkan nilai Tugas : ");
            alg[i].nilaiTugas = (int) sc.nextFloat();
            System.out.println("Masukkan nilai Kuis : ");
            alg[i].nilaiKuis = (int) sc.nextFloat();
            System.out.println("Masukkan nilai UTS : ");
            alg[i].nilaiUTS = (int) sc.nextFloat();
            System.out.println("Masukkan nilai UAS : ");
            alg[i].nilaiUAS = (int) sc.nextFloat();
            
            float nilai1 = alg[i].nilaiTugas * 30 / 100;
            float nilai2 = alg[i].nilaiKuis * 20 / 100;
            float nilai3 = alg[i].nilaiUTS * 20 / 100;
            float nilai4 = alg[i].nilaiUAS * 30 / 100;
        }
        
        for (int i = 0; i < mhs; i++) {
            float nilai1 = alg[i].nilaiTugas * 30 / 100;
            float nilai2 = alg[i].nilaiKuis * 20 / 100;
            float nilai3 = alg[i].nilaiUTS * 20 / 100;
            float nilai4 = alg[i].nilaiUAS * 30 / 100;
            
            float nilaiTotal2 = nilai1 + nilai2 + nilai3 + nilai4;
            System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println("Nama Mahasiswa ke-"+(i+1)+" = "+alg[i].namaMhs);
            System.out.println("Nilai Tugas = "+alg[i].nilaiTugas);
            System.out.println("Nilai Kuis = "+alg[i].nilaiKuis);
            System.out.println("Nilai UTS = "+alg[i].nilaiUTS);
            System.out.println("Nilai UAS = "+alg[i].nilaiUAS);
            System.out.println("-----------------------------------");
            System.out.println("Jadi Total Nilai "+alg[i].namaMhs+" adalah : "+nilaiTotal2);
        }
    }
    
    static void pertanyaan3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("======================Pertanyaan Nomer 3======================");
        System.out.println("Masukan Jumlah Mahasiswa : ");
        int jmlh = sc.nextInt();
        NilaiAlgoritma[] aglt = new NilaiAlgoritma[jmlh];
        
        for (int i =0; i<jmlh; i++){
        aglt[i] = new NilaiAlgoritma();
        System.out.println("");
        System.out.println("Masukan Nama Mahasiswa ke-"+(i+1)+" : ");
        aglt[i].namaMhs = sc.next();
        System.out.println("Masukan Nilai Tugas :");
        aglt[i].nilaiTugas = sc.nextInt();
        System.out.println("Masukan Nilai Kuis :");
        aglt[i].nilaiKuis = sc.nextInt();
        System.out.println("Masukan Nilai UTS :");
        aglt[i].nilaiUTS = sc.nextInt();
        System.out.println("Masukan Nilai UAS :");
        aglt[i].nilaiUAS = sc.nextInt();
        }
        
        System.out.println("=====================================================");
        
        for (int i =0;i<jmlh;i++){
            double totalNilai = aglt[i].hitungTotalNilai();
            System.out.println("jadi Total Nilai "+aglt[i].namaMhs+" adalah : "+totalNilai);
        }
        
        for (int i =0; i<aglt.length; i++){
            System.out.println("jadi Rata-Rata Total Nilai adalah : "+aglt[i].rataNilai(jmlh,aglt));
        }
        
        
        System.out.println("=====================================================");
    }
    
    public static void main(String[] args) {
        NilaiAlgoritma al = new NilaiAlgoritma();
//        al.login();
//        al.menu();
        pertanyaan1();
//        pertanyaan2();
//        pertanyaan3();
    }
}
