package Minggu5;
import java.util.*;
public class MainPangkat {
    
    static void pencarianMenu(){
        Scanner sc = new Scanner(System.in);
        int ulang = 0;
        do{
            Pangkat[] png = new Pangkat[5];
            png[0] =  new Pangkat(15,2);
            png[1] =  new Pangkat(8,4);
            png[2] =  new Pangkat(4,4);
            png[3] =  new Pangkat(8,5);
            png[4] =  new Pangkat(8,8);
            System.out.println("");
            System.out.println("==================================================");
            System.out.println("Pilih menu dibawah ini!");
            System.out.println("1. Brute Force");
            System.out.println("2. Devide Conquer");
            System.out.println("3. Keluar");
            System.out.println("Pilihah menu :");
            int pilih = sc.nextInt();
            if(pilih == 1){
                System.out.println("==================================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i=0; i<png.length; i++){
                    System.out.println("Nilai "+ png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                }
                continue;
            }else if(pilih == 2){
                System.out.println("==================================================");
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i=0; i<png.length; i++){
                    System.out.println("Nilai "+ png[i].nilai+"pangkat "+png[i].pangkat+" adalah " +png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                }
                continue;
            }else if(pilih==3){
                System.out.println("Anda telah keluar dari program");
                break;
            }else{
                System.out.println("Menu yang anda berikan tidak tersedia");
                System.out.println("");
            }
        }while(ulang !=0 || ulang<3);
        
    }
    
    public static void main(String[] args) {
        Pangkat[] png = new Pangkat[5];
        pencarianMenu();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("=====================================================");
//        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
//        int elemen = sc.nextInt();
//        
//        Pangkat[] pangkat = new Pangkat[elemen];
//        
//        for (int i = 0; i < elemen; i++) {
//            pangkat[i] = new Pangkat();
//            System.out.println("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
//            pangkat[i].nilai = sc.nextInt();
//            System.out.println("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
//            pangkat[i].pangkat = sc.nextInt();
//        }
//        
//        System.out.println("=====================================================");
//        System.out.println("Hasil Pangkat dengan Brute Force");
//        for (int i = 0; i < elemen; i++) {
//            System.out.println("Nilai "+pangkat[i].nilai+" pangkat "+pangkat[i].pangkat+" adalah : "+pangkat[i].pangkatBF(pangkat[i].nilai, pangkat[i].pangkat));
//        }
//        
//        System.out.println("=====================================================");
//        System.out.println("Hasil Pangkat dengan Divide and Conquer");
//        for (int i = 0; i < elemen; i++) {
//            System.out.println("Nilai "+pangkat[i].nilai+" pangkat "+pangkat[i].pangkat+" adalah : "+pangkat[i].pangkatDC(pangkat[i].nilai, pangkat[i].pangkat));
//        }
    }
}
