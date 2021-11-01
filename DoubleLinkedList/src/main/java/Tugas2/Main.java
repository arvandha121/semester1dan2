package Tugas2;
import java.util.*;
public class Main {
    static void menu(){
        System.out.println("************************");
        System.out.println(" Data Buku Perpustakaan");
        System.out.println("************************");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println("------------------------");
    }
    
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        DoubleService ds = new DoubleService();
        
        int ulang = 0;
        do{
            menu();
            int pilih = sc.nextInt();
            System.out.println("------------------------");
            switch(pilih){
                case 1:
                    System.out.println("Masukkan judul buku : ");
                    String jb = sc1.nextLine();
                    ds.addLast(jb);
                    break;
                case 2:
                    System.out.println("Buku pada tumpukan teratas telah diambil");
                    ds.removeFirst();
                    break;
                case 3:
                    ds.peek();
                    break;
                case 4:
                    ds.print();
                    break;
            }
            if(pilih == 5){
                System.out.println("Anda telah keluar!");
                break;
            }
        }while(ulang!=0 || ulang<3);
    }
}
