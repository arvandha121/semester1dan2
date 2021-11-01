package latihanPraktikum;
import java.util.*;
public class MainTiket {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        tiketService list = new tiketService();
        tiket tkt1 = new tiket("Garuda Indonesia\t", 1500000 ,"Ambon","Papua");
        tiket tkt2 = new tiket("Citilink \t\t", 525000 ,"Kediri","Surabaya");
        tiket tkt3 = new tiket("Lion Air \t", 678500 ,"Surabaya","Malang");
        tiket tkt4 = new tiket("Batik Air\t", 1105000 ,"Malang","Bali");
        tiket tkt5 = new tiket("Lion Air \t", 1500000 ,"Ambon","Papua");
        
        list.tambah(tkt1);
        list.tambah(tkt2);
        list.tambah(tkt3);
        list.tambah(tkt4);
        list.tambah(tkt5);
        
        
        int ulang = 0;
        do{
            System.out.println("");
            System.out.println("Pilih menu dibawah ini!");
            System.out.println("1. Memunculkan Data Sebelum Sorting");
            System.out.println("2. Memunculkan Data Bubble Sort");
            System.out.println("3. Memunculkan Data Selection Sort");
            System.out.println("4. Keluar");
            System.out.println("Pilihah menu :");
            int pilih = sc.nextInt();
            if(pilih == 1){
                System.out.println("Data mahasiswa sebelum sorting = ");
                list.tampil();
                continue;
            }else if(pilih == 2){
                System.out.println("========== bubble sort ==========");
                list.bubbleSort();
                list.tampil();
                continue;
            }else if(pilih == 3){
                System.out.println("========== selectionSort ==========");
                list.selectionSort();
                list.tampil();
            }else if(pilih==4){
                System.out.println("Anda telah keluar dari program");
                break;
            }else{
                System.out.println("Menu yang anda berikan tidak tersedia");
                System.out.println("");
            }
        }while(ulang !=0 || ulang<3);
       
    
    }
}
