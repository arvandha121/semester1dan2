import java.util.*;
public class contoh{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah barang: ");
        int jumlah = sc.nextInt();
        System.out.println("----------------------------------");
        int harga, jumlahbeli;
        //menggunakan for
        for(int i = 0; i<jumlah; i++){
            System.out.println("Masukkan nama barang ke-"+(i+1)+" : ");
            String barang = sc.next();
            System.out.println("Masukkan harga barang : ");
            harga = sc.nextInt();
            System.out.println("Masukkan jumlah barang beli : ");
            jumlahbeli = sc.nextInt();
            int total = harga * jumlahbeli;
            System.out.println("Total : "+total);
            System.out.println("----------------------------------");
        }
        //menggunakan while
        int j = 0;
        while(j<jumlah){
            System.out.println("Masukkan nama barang ke-"+(j+1)+" : ");
            String barang = sc.next();
            System.out.println("Masukkan harga barang : ");
            harga = sc.nextInt();
            System.out.println("Masukkan jumlah barang beli : ");
            jumlahbeli = sc.nextInt();
            int total = harga * jumlahbeli;
            System.out.println("Total : "+total);
            j++;
            System.out.println("----------------------------------");
        }
        //menggunakan do while
        int k = 0;
        do{
            System.out.println("Masukkan nama barang ke-"+(k+1)+" : ");
            String barang = sc.next();
            System.out.println("Masukkan harga barang : ");
            harga = sc.nextInt();
            System.out.println("Masukkan jumlah barang beli : ");
            jumlahbeli = sc.nextInt();
            int total = harga * jumlahbeli;
            System.out.println("Total : "+total);
            System.out.println("----------------------------------");
            k++;
        }while(k<jumlah);
    }
}