package UTS1;
import java.util.Scanner;
public class MainTransaksi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RekeningService rek = new RekeningService();
        Rekening r0 = new Rekening("16100617 0573","Darius","Julian Daniel","1-357-843-0547","nec@lectusjusto.org");
        Rekening r1 = new Rekening("16030927 3084","Wallace","Chase Castro","1-458-264-3263","ligula.Nullam@tacitisociosqu.edu");
        Rekening r2 = new Rekening("16240401 2243","Fuller","Finn Dunlap","571-7062","convallis@Vestibulumanteipsum.org");
        Rekening r3 = new Rekening("16270525 0112","Malcolm","Keane Floyd","623-0234","porttitor.tellus.non@Curabitur.ca");
        Rekening r4 = new Rekening("16971204 2416","Geoffrey","Stephen Pratt","1-683-416-8323","ut.pellentesque@luctusutpellentesque.com");
        
        rek.tambah(r0);
        rek.tambah(r1);
        rek.tambah(r2);
        rek.tambah(r3);
        rek.tambah(r4);
        System.out.println("_________________");
        System.out.println("Menampilkan Data Semua");
       
    }
}
