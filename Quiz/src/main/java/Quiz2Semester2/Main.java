package Quiz2Semester2;
import java.util.*;
public class Main {
    
    static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("================================== Login Akun ==================================");
        int username;
        int pass;
        do{
            System.out.println("Masukkan username (dengan angka 4 huruf) : ");
            username = sc.nextInt();
            System.out.println("Masukkan password (dengan angka 4 huruf) : ");
            pass = sc.nextInt();
            if(username==1234){
                System.out.println("username anda benar (v)");
                if(pass==1234){
                    System.out.println("password anda benar (v)");
                    System.out.println("");
                }else if(pass!=1234){
                    System.out.println("password anda salah (x)");
                    System.out.println("-----------------------");
                    System.out.println("");
                }
            }else if(username != 1234){
                System.out.println("username anda salah (x)");
                if(pass==1234){
                    System.out.println("password anda benar (v)");
                    System.out.println("");
                }else if(pass!=1234){
                    System.out.println("password anda salah (x)");
                    System.out.println("-----------------------");
                    System.out.println("");
                }
                System.out.println("");
            }
            continue;
        }
        while(username != 1234 || pass != 1234);
        
        System.out.println("==================================");
        System.out.println("\tAnda berhasil login!");
        System.out.println("==================================");
    }
    
    static void menu(){
        System.out.println("==================================================");
        System.out.println("\t\tMenu Antri SPBU");
        System.out.println("==================================================");
        System.out.println("1. addLast");
        System.out.println("2. peek");
        System.out.println("3. RemoveFirst");
        System.out.println("4. RemoveLast");
        System.out.println("5. GetData");
        System.out.println("6. Print");
        System.out.println("0. Keluar");
        System.out.println("------------------------------------");
    }
    
    static void data(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        NodeService a = new NodeService();
        
        Kendaraan s1 = new Kendaraan("Tini","B4245BUB","Matic",2018,"Honda Brio");
        Kendaraan s2 = new Kendaraan("Wati","S2105OP","Matic",2017,"Honda Jazz");
        Kendaraan s3 = new Kendaraan("Tono","KT2314YT","Manual",2017,"Honda HR-V");

        a.addFirst(s2);
        a.addFirst(s1);
        a.addFirst(s3);
        
        int ulang = 0;
        do{
            menu();
            int pilih = sc.nextInt();
            if(pilih == 1){
                System.out.println("Masukkan nama : ");
                String nama = sc1.nextLine();
                System.out.println("Masukkan Nomer Kendaraan : ");
                String NoKen = sc1.nextLine();
                System.out.println("Masukkan Tipe (Matic/Manual) : ");
                String tipe = sc1.nextLine();
                System.out.println("Masukkan tahun kendaraan : ");
                int tahun = sc.nextInt();
                System.out.println("Masukkan Merk kendaraan : ");
                String merk = sc1.nextLine();
                Kendaraan list = new Kendaraan(nama,NoKen,tipe,tahun,merk);
                a.addLast(list);
                continue;
            }else if(pilih == 2){
                a.peek();
                continue;
            }else if(pilih == 3){
                a.removeFirst();
                continue;
            }else if(pilih == 4){
                a.removeLast();
                continue;
            }else if(pilih == 5){
                System.out.println("cari indeks : ");
                int cari = sc.nextInt();
                a.getData(cari+1);
            }else if(pilih == 6){
                a.print();
                System.out.println("--------------------------------------");
                continue;
            }else if(pilih == 0){
                System.out.println("Anda Keluar Dari Program!");
                break;
            }else{
                System.out.println("Pilihan Menu Tidak Tersedia!");
            }
        }while(ulang != 0 || ulang < 3);
    }
    
    public static void main(String[] args) {
        login();
        data();
    }
}
