package Praktikum2;
import java.util.*;
public class QueueMain {
    
    public static void menu() {
        System.out.println("pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. PeekRear");
        System.out.println("-------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan kapasitas queue :");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Kota Asal: ");
                    String asal = sc.nextLine();
                    System.out.println("Kota Tujuan: ");
                    String tujuan = sc.nextLine();
                    System.out.println("Jumlah Tiket: ");
                    int jml = sc.nextInt();
                    System.out.println("Harga: ");
                    int hrg = sc.nextInt();
                    Penumpang p = new Penumpang(nama, asal, tujuan, jumlah, hrg);
                    sc.nextLine();
                    antri.Enqueue(p);
                    break;
                case 2:
                    Penumpang data = antri.Dequeue();
                    if(!"".equals(data.nama)&&!"".equals(data.kotaAsal)&&!"".equals(data.kotaTujuan)
                            &&data.jumlahTiket !=0&&data.harga !=0){
                        System.out.println("Antrian yang keluar: "+data.nama+" "+data.kotaAsal+" "+
                                data.kotaTujuan+" "+data.jumlahTiket+" "+data.harga);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
            }
        }while(pilih == 1||pilih == 2||pilih == 3||pilih == 4);
    }
    
    
}
