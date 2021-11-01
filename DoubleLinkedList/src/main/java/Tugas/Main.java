package Tugas;
import java.util.*;
public class Main {
    
    static void menu(){
        System.out.println("====================================================");
        System.out.println(" PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLE LINKED LIST");
        System.out.println("====================================================");
        System.out.println("1. Tambah head");
        System.out.println("2. Tambah tail");
        System.out.println("3. Tambah Data");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut Data");
        System.out.println("10. Keluar");
        System.out.println("===============================");
    }
    
    static void data()throws Exception{
        Scanner sc = new Scanner(System.in);
        
        NodeService ns = new NodeService();
        
        ns.addLast(34);
        ns.addLast(23);
        ns.addLast(67);
        ns.addLast(44);
        ns.addLast(90);
        ns.addLast(99);
        
        int ulang = 0;
        do{
            menu();
            int pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Masukkan Data pada Posisi Head");
                    int posisiHead = sc.nextInt();
                    ns.addFirst(posisiHead);
                    break;
                case 2:
                    System.out.println("Masukkan Data pada Posisi Tail");
                    int posisiTail = sc.nextInt();
                    ns.addLast(posisiTail);
                    break;
                case 3:
                    System.out.println("Masukkan Data");
                    int masukData = sc.nextInt();
                    System.out.println("Pointer : ");
                    int pointer = sc.nextInt();
                    ns.add(masukData, pointer);
                    break;
                case 4:
                    ns.removeFirst();
                    break;
                case 5:
                    ns.removeLast();
                    break;
                case 6:
                    System.out.println("Masukkan pointer : ");
                    int pointer1 = sc.nextInt();
                    ns.remove(pointer1);
                    break;
                case 7:
                    ns.print();
                    break;
                case 8:
                    System.out.println("Cari Data : ");
                    int cari = sc.nextInt();
                    if (cari != 0) {
                        ns.searchNode(cari);
                    }
                    ns.print();
                    break;
                case 9:
                    ns.sortList();
                    System.out.println("Data berhasil diurutkan (Desc)");
                    break;
            }
            if(pilih == 10){
                System.out.println("Anda telah keluar dari program");
                break;
            }
        }while(ulang!=0 || ulang<3);
    }
    
    public static void main(String[] args) throws Exception {
        data();
    }
    
}
