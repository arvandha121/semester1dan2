package UTS1;
import java.util.*;
public class MainTransaksi {
    public static void main(String[] abcd) {
        Scanner sc = new Scanner(System.in);
        RekeningService rek = new RekeningService();
        
        Rekening r0 = new Rekening("16030927 3084","Wallace","Chase Castro","1-458-264-3263","ligula.Nullam@tacitisociosqu.edu");
        Rekening r1 = new Rekening("16100617 0573","Darius","Julian Daniel","1-357-843-0547","nec@lectusjusto.org");
        Rekening r2 = new Rekening("16240401 2243","Fuller","Finn Dunlap","571-7062","convallis@Vestibulumanteipsum.org");
        Rekening r3 = new Rekening("16270525 0112","Malcolm","Keane Floyd","623-0234","porttitor.tellus.non@Curabitur.ca");
        Rekening r4 = new Rekening("16971204 2416","Geoffrey","Stephen Pratt","1-683-416-8323","ut.pellentesque@luctusutpellentesque.com");
        
        TransaksiService ser = new TransaksiService();
        Transaksi t1 = new Transaksi(898214.0,494048.0,3587.0,"2021-03-09 07:54:42","16100617 0573");
        Transaksi t0 = new Transaksi(205420.0,200162.0,775880.0,"2021-06-25 10:23:00","16030927 3084");
        Transaksi t2 = new Transaksi(838632.0,350929.0,328316.0,"2021-09-18 23:00:04","16240401 2243");
        Transaksi t3 = new Transaksi(838632.0,350929.0,328316.0,"2021-09-18 23:00:04","16270525 0112");
        Transaksi t4 = new Transaksi(770592.0,334245.0,444267.0,"2020-08-11 13:36:56","16971204 2416");
        
        rek.tambah(r0);
        rek.tambah(r1);
        rek.tambah(r2);
        rek.tambah(r3);
        rek.tambah(r4);
        
        ser.tambah(t0);
        ser.tambah(t1);
        ser.tambah(t2);
        ser.tambah(t3);
        ser.tambah(t4);
        
        int ulang = 0;
        do {
            System.out.println("===========================");
            System.out.println("           UTS            ");
            System.out.println("===========================");
            System.out.println("Pilih menu dibawah ini!");
            System.out.println("1. Tampil Data Rekening");
            System.out.println("2. Tampil Data Transaksi");
            System.out.println("3. Mencari saldo > inputan user");
            System.out.println("4. Sorting by name");
            System.out.println("0. Keluar");
            System.out.println("--------------------------------------------");
            System.out.println("Pilihah menu :");
            int pilih = sc.nextInt();
            System.out.println("--------------------------------------------");
            if (pilih == 1) {
                System.out.println();
                System.out.println("Menampilkan Data Rekening");
                rek.tampilrek();
                continue;
            }else if (pilih == 2) {
                System.out.println();
                System.out.println("Menampilkan Data Transaksi");
                ser.tampilser();
                continue;
            }else if (pilih == 3) {
                ser.SearchSaldo();
                ser.tampilser();
                continue;
//                System.out.println("16030927  3084   898214.0          3587.0       2021-03-09 07:54:42");
//                System.out.println("16240401  2243   350929.0          328316.0     2021-09-18 23:00:04");
//                System.out.println("16971204  2416   334245.0          444267.0     2021-08-11 13:36:56");
            }else if(pilih == 4){
                System.out.println("Sorting cari Nama");
                rek.NamaBubbleSort();
                rek.tampilrek();
                continue;
            }
            else if (pilih == 0) {
                System.out.println("Anda telah keluar dari program");
                break;
            } else {
                System.out.println("Menu yang anda berikan tidak tersedia");
            }
        }
        while (ulang != 0 || ulang < 3);
    }
}
