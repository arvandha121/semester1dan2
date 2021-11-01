import java.util.*;
public class main {
    
    static void menu(){
        System.out.println("========================");
        System.out.println("Masukkan Jenis Kendaraan");
        System.out.println("========================");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("------------------------");
        System.out.println("Pilih : ");
    }
    
    static void menuccmotor(){
        System.out.println("=========================");
        System.out.println("  Masukkan cc kendaraan  ");
        System.out.println("=========================");
        System.out.println("100");
        System.out.println("100 - 250");
        System.out.println("250");
        System.out.println("-------------------------");
        System.out.println("pilih : ");
    }
    
    static void menuccmobil(){
        System.out.println("=========================");
        System.out.println("  Masukkan cc kendaraan  ");
        System.out.println("=========================");
        System.out.println("1000");
        System.out.println("1000 - 2500");
        System.out.println("2500");
        System.out.println("-------------------------");
        System.out.println("pilih : ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        PajakService ps = new PajakService();
        
        Kendaraan ken1 = new Kendaraan("AG2021UV","Yamaha","Motor",150,2017,1000000);
        Kendaraan ken2 = new Kendaraan("AG5221UX","Honda","Motor",125,2015,500000);
        Kendaraan ken3 = new Kendaraan("AG6243UY","Suzuki","Mobil",1500,2019,3000000);
        Kendaraan ken4 = new Kendaraan("AG5261UZ","Toyota","Mobil",1000,2016,2500000);
        
        int ulang = 0;
        do{
            menu();
            int men = sc.nextInt();
            if(men == 1){
                menuccmotor();
                int pcmot = sc.nextInt();
                if(pcmot <= 100){
                    System.out.println("TNKB            : ");
                    String t = sc1.nextLine();
                    System.out.println("nama            : ");
                    String n = sc1.nextLine();
                    System.out.println("jenis           : ");
                    String j = sc1.nextLine();
                    System.out.println("cc              : ");
                    int c = sc.nextInt();
                    System.out.println("tahun           : ");
                    int thn = sc.nextInt();
                    System.out.println("Bayar per bulan : ");
                    int bb = sc.nextInt();
                    
                }else if(pcmot > 100 && pcmot == 250){
                    
                }else if(pcmot > 250){
                    
                }
            }else if(men == 2){
                menuccmobil();
                int pcmob = sc.nextInt();
                if(pcmob <= 1000){
                    
                }else if(pcmob > 1000 && pcmob == 2500){
                    
                }else if(pcmob > 2500){
                    
                }
            }
        }while(ulang != 0 || ulang < 3);
    }
}
