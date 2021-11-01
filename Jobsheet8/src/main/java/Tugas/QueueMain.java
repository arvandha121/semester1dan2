package Tugas;
import java.util.*;
public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan kapasitas Queue : ");
        int kapasitas = sc.nextInt();
        
        QueueService Q = new QueueService(kapasitas);
        
        int pilih = 0;
        do{
            System.out.println("================================================");
            System.out.println("\t\t   MENU");
            System.out.println("================================================");
            System.out.println("1. Antrian baru(Enqueue)");
            System.out.println("2. Antrian keluar(Dequeue)");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Peek Posisi");
            System.out.println("6. Peek At");
            System.out.println("7. Clear");
            System.out.println("0. Keluar");
            System.out.println("------------------------------------------------");
            System.out.println("Pilih menu : ");
            pilih = sc.nextInt();
            
            if(pilih == 1){
                System.out.println("Masukkan data baru : ");
                int dataMasuk = sc.nextInt();
                Q.Enqueue(dataMasuk);
                continue;
                
            }else if(pilih == 2){
                int dataKeluar = Q.Dequeue();
                if (dataKeluar != 0) {
                    System.out.println("Data yang dikeluarkan : "+dataKeluar);
                }
                continue;
            }else if(pilih == 3){
                Q.print();
                continue;
            }else if(pilih == 4){
                Q.peek();
                continue;
            }else if(pilih == 5){
                System.out.println("Masukkan data : ");
                int data = sc.nextInt();
                Q.peekPosition(data);
                continue;
            }else if(pilih == 6){
                System.out.println("cari posisi index : ");
                int cari = sc.nextInt();
                Q.peekAt(cari);
                continue;
            }else if(pilih == 7){
                Q.clear();
                continue;
            }else if(pilih == 0){
                System.out.println("Anda telah keluar dari program!");
                break;
            }else{
                System.out.println("Pilihan menu tidak tersedia!");
            }
        }
        while(pilih != 0 || pilih < 3);
    }
}
