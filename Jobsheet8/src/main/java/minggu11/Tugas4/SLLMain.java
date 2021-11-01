package minggu11.Tugas4;
import java.util.*;
public class SLLMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        SingleLinkedList a = new SingleLinkedList();
        
        Nasabah nb0 = new Nasabah("Nauvan","Nganjuk",12345);
        Nasabah nb1 = new Nasabah("Erlangga","Surabaya",54321);
        Nasabah nb2 = new Nasabah("Risdian","Jombang",23456);
        Nasabah nb3 = new Nasabah("Berliana","Kediri",98765);
        Nasabah nb4 = new Nasabah("Siti","Jember",15320);
        
        a.addLast(nb0);
        a.addLast(nb1);
        a.addLast(nb2);
        a.addLast(nb3);
        a.addLast(nb4);
        
        int ulang = 0;
        do{
            System.out.println("====================================================");
            System.out.println("\t\t   Menu");
            System.out.println("====================================================");
            System.out.println("1. Print seluruh data nasabah");
            System.out.println("2. Tambah data nasabah dari depan linked list");
            System.out.println("3. Tambah data nasabah dari belakang linked list");
            System.out.println("4. Cari data nasabah diantara index linked list");
            System.out.println("5. Munculkan Data Nasabah dari teratas");
            System.out.println("6. Menghapus seluruh data nasabah");
            System.out.println("0. Keluar Dari Program");
            System.out.println("----------------------------------------------------");
            System.out.println("pilih menu : ");
            int pilih = sc.nextInt();
            
            switch(pilih){
                case 1:
                    a.print();
                    break;
                case 2:
                    System.out.println("Masukkan Nama : ");
                    String nama = sc1.nextLine();
                    System.out.println("Masukkan Alamat : ");
                    String alamat = sc1.nextLine();
                    System.out.println("Masukkan Nomer Rekening : ");
                    int nomor = sc.nextInt();
                    Nasabah nhs = new Nasabah(nama, alamat, nomor);
                    a.addFirst(nhs);
                    break;
                case 3:
                    System.out.println("Masukkan Nama : ");
                    String nama1 = sc1.nextLine();
                    System.out.println("Masukkan Alamat : ");
                    String alamat1 = sc1.nextLine();
                    System.out.println("Masukkan Nomer Rekening : ");
                    int nomor1 = sc.nextInt();
                    Nasabah nhs1 = new Nasabah(nama1, alamat1, nomor1);
                    a.addLast(nhs1);
                    break;
                case 4:
                    System.out.println("index : ");
                    int index = sc.nextInt();
                    a.getData(index);
                    break;
                case 5:
                    a.peek();
                    break;
                case 6:
                    a.clear();
                    break;
                default :
                    System.out.println("");
            }
            if(pilih==0){
                System.out.println("Anda telah keluar dari program!");
                break;
            }
        }while(ulang!=0 || ulang<3);
        
    }
}
