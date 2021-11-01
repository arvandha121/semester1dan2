import java.util.*;
public class tutorial30LatihanLoopingSederhana {
    public static void main(String args[]){
        
        //program untuk menjumlahkan angka dengan rentang
        
        Scanner sc =new Scanner (System.in);
        int nilaiAwal, nilaiAkhir, total;
        
        System.out.println("masukkan nilai awal = ");
        nilaiAwal = sc.nextInt();
        System.out.println("masukkan nilai akhir = ");
        nilaiAkhir = sc.nextInt();
        
        total = 0;
        //menggunakan while
        while(nilaiAwal <= nilaiAkhir){
        total = total + nilaiAwal;
            System.out.printf("%d ditambah menjadi %d\n",nilaiAwal,total);
        nilaiAwal++;
        }
        //menggunakan for
        for (;nilaiAwal<=nilaiAkhir;){
            total = total + nilaiAwal;
            System.out.printf("%d ditambah menjadi %d\n",nilaiAwal,total);
        nilaiAwal++;
        }
        
    }
}
