package Praktikum2;
import java.util.*;
public class StackMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack(5);
        int pilihmenu = 0;
        do{
            System.out.println("================================================");
            System.out.println("\t\tList Menu");
            System.out.println("================================================");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("0. Keluar");
            System.out.println("------------------------------------------------");
            System.out.println("Masukkan pilihan list menu diatas : ");
            pilihmenu = sc.nextInt();
            System.out.println("------------------------------------------------");
            if(pilihmenu == 1){
                char pilih = 'y';
                do {            
                    System.out.println("Judul: ");
                    String judul = sc.nextLine();
                    System.out.println("Nama Pengarang: ");
                    String nama = sc.nextLine();
                    System.out.println("Tahun Terbit: ");
                    int tahun = sc.nextInt();
                    System.out.println("Jumlah Halaman: ");
                    int jml = sc.nextInt();
                    System.out.println("Harga: ");
                    int hrg = sc.nextInt();

                    Buku bk = new Buku(judul, nama, tahun, jml, hrg);
                    System.out.println("Apakah Anda akan menambahkan data baru ke stack (y/n)");
                    pilih = sc.next().charAt(0);
                    sc.nextLine();
                    st.push(bk);
                } 
                while (pilih == 'y' || pilih == 'Y');
                continue;
            }else if(pilihmenu == 2){
                st.pop();
                continue;
            }else if(pilihmenu == 3){
                st.peek();
                continue;
            }else if(pilihmenu == 4){
                st.print();
                continue;
            }else if(pilihmenu == 0){
                System.out.println("Anda Telah keluar dari program");
                break;
            }
            else{
                System.out.println("Pilihan Anda tidak ada!");
            }
        }
        while(pilihmenu != 0 || pilihmenu == 3);
    }

}
