package Tugas;
import java.util.*;
public class MahasiswaMain {
    
    static void menu(){
        System.out.println("================================================");
        System.out.println("\t\t     MENU");
        System.out.println("================================================");
        System.out.println("1. Antrian baru(Enqueue)");
        System.out.println("2. Antrian keluar(Dequeue)");
        System.out.println("3. Print");
        System.out.println("4. Print Mahasiswa");
        System.out.println("5. Peek");
        System.out.println("6. Peek Rear");
        System.out.println("7. Peek Posisi");
        System.out.println("8. Peek At");
        System.out.println("9. Clear");
        System.out.println("10. Keluar");
        System.out.println("------------------------------------------------");
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Masukkan kapasitas queue : ");
        int kapasitas = sc.nextInt();
        
        Queue queue = new Queue(kapasitas);
        
        int pilih = 0;
        do{
            menu();
            System.out.println("Pilih menu : ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("NIM: ");
                    String nim = sc.next();
                    sc.nextLine();
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Absen: ");
                    int absen = sc.nextInt();
                    System.out.println("Ipk: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa mhs = new Mahasiswa(nim, 
                    nama, absen, ipk);
                    sc.nextLine();
                    queue.Enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa data = queue.Dequeue();
                        if(!"".equals(data.nim) && !"".equals(data.nama) && !"".equals(data.absen) && data.ipk !=0){
                            System.out.println("Antrian yang keluar: "+data.nim+" "+data.nama+" "+data.absen+" "+data.ipk);
                        }
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    System.out.println("Masukkan NIM yang dicari : ");
                    String cari_nim = sc1.nextLine();
                    queue.peekPosition(cari_nim);
                    break;
                case 5:
                    queue.peek();
                    break;
                case 6:
                    queue.peekRear();
                    break;
                case 7:
                    System.out.print("cari data nim : ");
                    int a = sc.nextInt();
                    queue.printMahasiswa(a);
                    break;
                case 8:
                    System.out.println("cari posisi index : ");
                    int index = sc.nextInt();
                    queue.peekAt(index);
                    break;
                case 9:
                    queue.clear();
                    break;
                default:
                    System.out.println("Pilihan menu tidak tersedia!");
                    break;
            }
            
        }while(pilih == 1 || pilih < 10);
        System.out.println("Anda telah keluar dari program!");
    }
    
}
