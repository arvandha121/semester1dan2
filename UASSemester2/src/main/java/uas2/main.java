package uas2;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Kendaraan ken;
        Pajak p;
        
        int tnkb;
        boolean file;
        int menu;
        
        Proses pr = new Proses();
        
        System.out.println("Data Roda 2");
        ken = new Kendaraan(444, "Arva", 2, 250, "2005", 2);
        pr.addFirst(ken);
        ken = new Kendaraan(555, "Gamtenk", 2, 100, "2010", 2);
        pr.addLast(ken);
        ken= new Kendaraan(666, "Banget", 2, 200, "2004", 2);
        pr.addLast(ken);
        pr.print();
        System.out.println("Data Roda 2 dan Roda 4");
        ken = new Kendaraan(445, "Arvas", 4, 1000, "2006", 2);
        pr.addFirst(ken);
        ken = new Kendaraan(554, "Gamtes", 4, 2500, "2008", 2);
        pr.addLast(ken);
        ken = new Kendaraan(665, "Bangets", 4, 3000, "2009", 2);
        pr.addLast(ken);
        pr.print();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("=========================================");
            System.out.println("    Pajak Kendaraan   ");
            System.out.println("=========================================");
            System.out.println("1. Data Masuk  ");
            System.out.println("2. Cetak ");
            System.out.println("3. Urutkan Data");
            System.out.println("4. Keluar ");
            System.out.println("Input Nomer :");
            menu = sc.nextInt();
            switch (menu)
            {
                case 1:
                {
                    System.out.println("=====================================");
                    System.out.println("\t\t BAYAR PAJAK");
                    System.out.println("=====================================");
                    do
                    {
                        System.out.println("Masukkan TNBK ");
                        tnkb = sc.nextInt();
                        file = pr.Denda(tnkb);
                    } while (file == false);
                }
                break;
                 case 2: {
                     pr.printpajak();
                     System.out.println("Total Pendapatan " + pr.totalakhir);
                    
                }
                 case 3:{
                     
                 }
            }
        } while (menu > 0 && menu < 4);   
  
    }
}
