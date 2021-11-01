package Tugas4Baru;
import Tugas4.mahasiswa;
import Tugas4.mahasiswa;
import Tugas4Baru.Doubleservice;
import java.util.*;
public class main{
    
    static void menu(){
        System.out.println("====================================================");
        System.out.println(" PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLE LINKED LIST");
        System.out.println("====================================================");
        System.out.println("1. Tambah data awal");
        System.out.println("2. Tambah data akhir");
        System.out.println("3. Tambah Data tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari Nim");
        System.out.println("9. Urut Data IPK-DESC");
        System.out.println("10. Keluar");
        System.out.println("===============================");
    }
    
    static void data()throws Exception{
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Doubleservice ds = new Doubleservice();
        
        ds.addFirst(788, "Wendy", 3.87);
        ds.addLast(234,"Rendy",3.45);
        ds.addLast(564, "Ahmad", 4);
        
        int ulang = 0;
        do{
            menu();
            int pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Masukkan data mahasiswa posisi awal");
                    System.out.println("nim : ");
                    int nim = sc.nextInt();
                    System.out.println("nama : ");
                    String nama = sc.next();
                    System.out.println("IPK : ");
                    double ipk = sc2.nextDouble();
                    ds.addFirst(nim, nama, ipk);
                    break;
                case 2:
                    System.out.println("Masukkan data mahasiswa posisi akhir");
                    System.out.println("nim : ");
                    int nim2 = sc.nextInt();
                    System.out.println("nama : ");
                    String nama2 = sc.next();
                    System.out.println("IPK : ");
                    double ipk2 = sc2.nextDouble();
                    ds.addLast(nim2, nama2, ipk2);
                    break;
                case 3:
                    System.out.println("Masukkan Data Mahasiswa");
                    System.out.println("nim : ");
                    int nimadd = sc.nextInt();
                    System.out.println("nama : ");
                    String namaadd = sc1.next();
                    System.out.println("ipk : ");
                    double ipkadd = sc2.nextDouble();
                    System.out.println("Masukkan pointer : ");
                    int pointer = sc.nextInt();
                    ds.add(nimadd, namaadd, ipkadd, pointer);
                    break;
                case 4:
                    ds.removeFirst();
                    break;
                case 5:
                    ds.removeLast();
                    break;
                case 6:
                    System.out.println("Masukkan pointer : ");
                    int pointer1 = sc.nextInt();
                    ds.remove(pointer1);
                    break;
                case 7:
                    ds.print();
                    break;
                case 8:
                    System.out.println("Cari Data : ");
                    int cari = sc.nextInt();
                    if (cari != 0) {
                        ds.seqSearch(cari);
                    }
                    break;
                case 9:
                    ds.sortList();
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