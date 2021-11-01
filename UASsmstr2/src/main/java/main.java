import java.util.*;
public class main{
    
    static Scanner sc = new Scanner(System.in);
    static String tnbk;
    static int bulanBayar,Pajak,Denda,penguranganBulan,totPendapatan,totPen;
    static int counter = 1;
    static Pajak trx[] = new Pajak[10];
    static Kendaraan[] ken = {
        new Kendaraan("AG2021UV","Nauvan","Motor",150,2017,1000000),
        new Kendaraan("AG5221UX","Kevin","Motor",125,2015,500000),
        new Kendaraan("AG6243UY","Nauvan","Mobil",1500,2019,3000000),
        new Kendaraan("AG5261UZ","Bobi","Mobil",1000,2016,2500000),
    };
    
    static void menu(){
        System.out.println("============================");
        System.out.println("\t  SAMSAT");
        System.out.println("============================");
        System.out.println("1. Tampil Kendaraan");
        System.out.println("2. Input Pajak");
        System.out.println("3. Tampil Pajak");
        System.out.println("4. Tampil Transaksi");
        System.out.println("5. Tampil Pendapatan");
        System.out.println("0. Keluar!");
        System.out.println("---------------------------");
    }
    
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        Proses pr = new Proses();
        int ulang = 0;
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            if(pilih == 1){
                DataKendaraan();
            }else if(pilih == 2){
                inputPajak();
            }else if(pilih == 3){
                tampilPajak();
            }else if(pilih == 4){
                tampilTransaksi();
            }else if(pilih == 5){
                totalPendapatan();
            }else if(pilih == 0){
                System.out.println("Keluar");
                break;
            }else{
                System.out.println("input salah!");
            }
        }while (ulang != 0 || ulang < 3);
    }
    
    static void DataKendaraan(){
        System.out.println("--------------------");
        System.out.println("PRINT DATA KENDARAAN");
        System.out.println("--------------------");
        for (int i = 0; i < ken.length; i++) {
            ken[i].tampilKendaraan();
            System.out.println();
        }
   }

    static void inputPajak() {
        System.out.println("--------------------");
        System.out.println("INPUT DATA PAJAK");
        System.out.println("--------------------");
        System.out.println(" Nomor TNBK :");
        tnbk = sc.nextLine();
        System.out.println(" Bulan Bayar :");
        bulanBayar = sc.nextInt();
        sc.nextLine();
        System.out.println("===============================");
        System.out.println();
        System.out.println();
    }
    
    static void tampilPajak() {
        for (int i = 0; i < ken.length; i++) {
            if (ken[i].getTNKB().contains(tnbk)) {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("INPUT DATA KENDARAAN");
                System.out.println("-------------------------------------------------------------------");
                System.out.println("| PLAT | NAMA | JENIS | CC | TAHUN | BULAN |");
                System.out.println("===================================================================");
                System.out.printf("|"+ken[i].getTNKB()+"|"+ken[i].getNama()+"|"+ken[i].getJenis()+"|"+ken[i].getCc()+"|"+ken[i].getTahun()+"|"+ken[i].getBulanHarusBayar()+"|\n");
                System.out.println("-------------------------------------------------------------------");
                
                if (ken[i].getJenis().equals("Roda 2")) {
                    if (ken[i].getCc() <= 100) {
                        Pajak = 100000;
                    } else if (ken[i].getCc() <= 250) {
                        Pajak = 250000;
                    } else {
                        Pajak = 500000;
                    }
                } else if (ken[i].getJenis().equals("Roda 4")) {
                    if (ken[i].getCc() <= 1000) {
                        Pajak = 750000;
                    } else if (ken[i].getCc() <= 2500) {
                        Pajak = 1000000;
                    } else {
                        Pajak = 1500000;
                    }
                }
                
                System.out.printf("PAJAK KENDARAAN = "+Pajak);
                penguranganBulan = bulanBayar - ken[i].getBulanHarusBayar();
                
                
                if (penguranganBulan >= 1 && penguranganBulan <= 3) {
                    Denda = 50000;
                } else if (penguranganBulan > 3) {
                    Denda = penguranganBulan * 50000;
                } else {
                    Denda = 0;
                }
                System.out.printf("DENDA ="+Denda+"\n");
                System.out.println("===================================================================");
                totPendapatan = Pajak + Denda;
                totPen += totPendapatan;
                trx[i] = new Pajak(counter, ken[i].getTNKB(), ken[i].getNama(), Pajak, Denda, totPen);
                counter++;
            }
        }
    }
    
    static void tampilTransaksi() {
        System.out.println("======================");
        System.out.println("TOTAL TRANSAKSI");
        System.out.println("=======================");
        System.out.println("---------------------------------------------------");
        System.out.println("| KODE | PLAT | NAMA |NOMINAL | DENDA |");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < trx.length; i++) {
            Pajak pjk1 = trx[i];
            if (pjk1 == null) {
                System.out.println(" ");
                return;
            }
            trx[i].printpjk();
        }
    }
    
    static void totalPendapatan() {
        tampilTransaksi();
        System.out.println("==================================================================");
        System.out.printf("| TOTAL PENDAPATAN ="+totPen+"|\n");
        System.out.println("==================================================================");
        System.out.println();
        System.out.println();
    }
    
}