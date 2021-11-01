package uas;
import java.util.*;
public class Proses {
    
    static String tnbk;
    static int bulanBayar;
    static int tarifPajak;
    static int tarifDenda;
    static int penguranganBulan;
    static int counter = 1;
    static int totPendapatan;
    static int totPen;
    
    Kendaraan[] ken = new Kendaraan[10];
    Pajak[] trx = new Pajak[10];
    
    //menampilkan kendaraan
    void TampilKendaraan(){
        ken[1] = new Kendaraan("AG2021UV","Yamaha","Motor",150,2017,1000000);
        ken[2] = new Kendaraan("AG5221UX","Honda","Motor",125,2015,500000);
        ken[3] = new Kendaraan("AG6243UY","Suzuki","Mobil",1500,2019,3000000);
        ken[4] = new Kendaraan("AG5261UZ","Toyota","Mobil",1000,2016,2500000);
        for (Kendaraan br : ken) {
            System.out.println("TNKB            : "+br.TNKB);
            System.out.println("nama            : "+br.nama);
            System.out.println("jenis           : "+br.jenis);
            System.out.println("cc              : "+br.cc);
            System.out.println("tahun           : "+br.tahun);
            System.out.println("Bayar per bulan : "+br.bulanHarusBayar);
        }
    }
    
    //menginput pajak
    void inputPajak(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("| MASUKKAN DATA PAJAK |");
        System.out.println("-------------------------------");
        Kendaraan kend = new Kendaraan();
        System.out.print(" Nomor TNBK -> ");
        kend.TNKB = sc.nextLine();
        System.out.print(" Bulan Bayar -> ");
        kend.bulanHarusBayar = sc.nextInt();
        sc.nextLine();
        System.out.println("===============================");
    }
    
    void TampilPajak(){
        for (int i = 0; i < ken.length; i++) {
            if (ken[i].TNKB.contains(tnbk)) {
                System.out.println("============================================");
                System.out.println("\t\tTAMPIL PAJAK");
                System.out.println("============================================");
                System.out.println("Plat  : "+ken[i].TNKB);
                System.out.println("Nama  : "+ken[i].nama);
                System.out.println("Jenis : "+ken[i].jenis);
                System.out.println("CC    : "+ken[i].cc);
                System.out.println("Tahun : "+ken[i].tahun);
                System.out.println("Bulan : "+ken[i].bulanHarusBayar);
                if (ken[i].jenis.equals("Roda 2")) {
                    if (ken[i].cc <= 100) {
                        tarifPajak = 100000;
                    } else if (ken[i].cc <= 250) {
                        tarifPajak = 250000;
                    } else {
                        tarifPajak = 500000;
                    }
                } else if (ken[i].jenis.equals("Roda 4")) {
                    if (ken[i].cc <= 1000) {
                        tarifPajak = 750000;
                    } else if (ken[i].cc <= 2500) {
                        tarifPajak = 1000000;
                    } else {
                        tarifPajak = 1500000;
                    }
                }
                System.out.println("============================================");
                System.out.println("PAJAK KENDARAAN : "+tarifPajak);
                
                penguranganBulan = bulanBayar - ken[i].bulanHarusBayar;
                if (penguranganBulan >= 1 && penguranganBulan <= 3) {
                    tarifDenda = 50000;
                } else if (penguranganBulan > 3) {
                    tarifDenda = penguranganBulan * 50000;
                } else {
                    tarifDenda = 0;
                }
                System.out.println("DENDA          : "+tarifDenda);
                System.out.println("============================================");
                
                
                totPendapatan = tarifPajak + tarifDenda;
                totPen += totPendapatan;
                trx[i] = new Pajak(counter, ken[i].TNKB, ken[i].nama, tarifPajak, tarifDenda, totPen);
                counter++;
            }
        }
    }
    

}
