package Jobsheet3Tugas;
import java.util.*;
public class BangunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BangunKubus[] kubus = new BangunKubus[1];
        System.out.print("\t==Bangun Kubus==\n");
        for(int i=0; i<kubus.length; i++){
            kubus[i] = new BangunKubus();
            System.out.println("Masukkan sisi : ");
            kubus[i].sisi = sc.nextInt();
        }
        int j = 0;
        for (BangunKubus kubu : kubus) {
            System.out.println("Bangun Kubus ke-"+(j+1));
            System.out.println("volume : "+kubus[0].volumeKubus());
            System.out.println("luas : "+kubus[0].LuasKubus());
        }
        System.out.println("-------------------------------");
        
        //===============================================================
        
        BangunBalok[] balok = new BangunBalok[1];
        System.out.print("\t==Bangun Balok==\n");
        for(int i = 0; i<balok.length; i++){
            balok[i] = new BangunBalok();
            System.out.println("Bangun Balok ke-"+i);
            System.out.println("Masukkan panjang: ");
            balok[i].panjang = sc.nextInt();
            System.out.println("Masukkan lebar: ");
            balok[i].lebar = sc.nextInt();
            System.out.println("Masukkan tinggi: ");
            balok[i].tinggi = sc.nextInt();
        }
        for(int i=0; i<kubus.length; i++){
            System.out.println("Bangun Balok ke-"+(i+1));
            System.out.println("volume : "+balok[i].volumeBalok());
            System.out.println("luas : "+balok[i].luasBalok());
        }
        System.out.println("-------------------------------");
        
        //===============================================================
        
        BangunPrisma[] prisma = new BangunPrisma[1];
        System.out.print("\t==Bangun Prisma==\n");
        for(int n=0; n<prisma.length; n++){
            prisma[n] = new BangunPrisma();
            System.out.println("Bangun Prisma ke-"+(n+1));
            System.out.println("Masukkan Alas Prisma: ");
            prisma[n].alas = sc.nextInt();
            System.out.println("Masukkan Bidang Prisma: ");
            prisma[n].lebar = sc.nextInt();
            System.out.println("Masukkan Tinggi Prisma: ");
            prisma[n].tinggi = sc.nextInt();
            System.out.println("Masukkan Sisi Prisma: ");
            prisma[n].sisi = sc.nextInt();
        }
        for (int i=0; i<prisma.length; i++) {
            System.out.println("Bangun Prisma ke-"+(i+1));
            System.out.println("volume : "+prisma[i].volumePrisma());
            System.out.println("luas : "+prisma[i].luasPrisma());
        }
        
    }
}
