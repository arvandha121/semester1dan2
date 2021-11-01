package Pratikum;

//untuk mencari data di fungsi main NilaiAlgoritm
import static Pratikum.NilaiAlgoritmaMain.pertanyaan1;
import static Pratikum.NilaiAlgoritmaMain.pertanyaan2;
import static Pratikum.NilaiAlgoritmaMain.pertanyaan3;

//untuk membuat library Scanner
import java.util.*;

public class NilaiAlgoritma {
    
    String namaMhs;
    int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    
    double hitungTotalNilai(double uts, double uas, double kuis, double tugas){
        nilaiTugas = (int) tugas;
        nilaiKuis = (int) kuis;
        nilaiUTS = (int) uts;
        nilaiUAS = (int) uas;
        
        return 0;
    }
    
    double hitungTotalNilai(){
        return (30*nilaiTugas/100)+(20*nilaiKuis/100)+(20*nilaiUTS/100)+(30*nilaiUAS/100);
    }
    
    double rataNilai(int n,NilaiAlgoritma[] aglt) {
        double jumlah = 0;
        for (int i=0;i<n;i++){
            jumlah = jumlah + aglt[i].hitungTotalNilai();
        } 
        double rata = jumlah/n;
        return rata;
    }
    
    static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("================================== Login Akun ==================================");
        int username;
        int pass;
        do{
            System.out.println("Masukkan username (dengan angka 4 huruf) : ");
            username = sc.nextInt();
            System.out.println("Masukkan password (dengan angka 4 huruf) : ");
            pass = sc.nextInt();
            if(username==1234){
                System.out.println("username anda benar (v)");
                if(pass==1234){
                    System.out.println("password anda benar (v)");
                    System.out.println("");
                }else if(pass!=1234){
                    System.out.println("password anda salah (x)");
                    System.out.println("-----------------------");
                    System.out.println("");
                }
            }else if(username != 1234){
                System.out.println("username anda salah (x)");
                if(pass==1234){
                    System.out.println("password anda benar (v)");
                    System.out.println("");
                }else if(pass!=1234){
                    System.out.println("password anda salah (x)");
                    System.out.println("-----------------------");
                    System.out.println("");
                }
                System.out.println("");
            }
            continue;
        }
        while(username != 1234 || pass != 1234);
        
        System.out.println("==================================");
        System.out.println("\tAnda berhasil login!");
        System.out.println("==================================");
    }
    
    static void menu(){
        Scanner sc = new Scanner(System.in);
        int ulang = 0;
        do{
            System.out.println("");
            System.out.println("Pilih menu dibawah ini!");
            System.out.println("1. Memunculkan Pertanyaan nomer 1");
            System.out.println("2. Memunculkan Pertanyaan nomer 2");
            System.out.println("3. Memunculkan Pertanyaan nomer 3");
            System.out.println("4. Keluar");
            System.out.println("Pilihah menu :");
            int pilih = sc.nextInt();
            if(pilih == 1){
                pertanyaan1();
                continue;
            }else if(pilih == 2){
                pertanyaan2();
                continue;
            }else if(pilih ==3){
                pertanyaan3();
            }else if(pilih==4){
                System.out.println("Anda telah keluar dari program");
                break;
            }else{
                System.out.println("Menu yang anda berikan tidak tersedia");
                System.out.println("");
            }
        }while(ulang !=0 || ulang<3);
        
    }
    
}
