package Minggu5;
import java.util.*;
public class MainFaktorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Faktorial[] fk = new Faktorial[elemen];
        Faktorial fkt = new Faktorial();
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }
        
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        fkt.sisaWaktuBF();
        
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        fkt.sisaWaktuDC();
        
        System.out.println("=====================================================");
    }
}
