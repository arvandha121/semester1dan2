import java.util.Scanner;

public class Tugas4{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int hargaA, hargaB, hargaC;
        int jumlah1, jumlah2, jumlah3, total_A, total_B, total_C;
        int totalKeseluruhan, totalbayar, diskon;
        //=================================================
        System.out.println("Masukkan Harga Barang A:\t\t");
        hargaA = input.nextInt();
        System.out.println("Masukkan Jumlah Barang:\t\t");
        jumlah1 = input.nextInt();
        
        System.out.println("Masukkan Harga Barang B:\t\t");
        hargaB = input.nextInt();
        System.out.println("Masukkan Jumlah Barang:\t\t");
        jumlah2 = input.nextInt();
        
        System.out.println("Masukkan Harga Barang C:\t\t");
        hargaC = input.nextInt();
        System.out.println("Masukkan Harga Jumlah Barang:\t\t");
        jumlah3 = input.nextInt();
        //=================================================
        total_A = hargaA * jumlah1;
        total_B = hargaB * jumlah2;
        total_C = hargaC * jumlah3;
        totalKeseluruhan = total_A + total_B + total_C;
        //=================================================
        if (totalKeseluruhan>=1000000){
            diskon = totalKeseluruhan * 10/100;
        }
        else if(totalKeseluruhan>=500000){
            diskon = totalKeseluruhan * 5/100;
        }
        else if(totalKeseluruhan>=200000){
            diskon = totalKeseluruhan * 2/100;
        }
        else{
            diskon = 0;
        }
        //=================================================
        System.out.println("============================================================");
        System.out.println("\t\t\tStruk Nota\t\t\t");
        System.out.println("============================================================");
        
        System.out.println("Nama Barang | Harga | Jumlah | Total");
        System.out.println("barang A " +"\t" +hargaA +"\t"+ jumlah1+"\t" + total_A);
        System.out.println("barang B " +"\t" +hargaB +"\t"+ jumlah2+"\t" +total_B);
        System.out.println("barang C " +"\t" +hargaC +"\t"+ jumlah3+"\t" +total_C);
        
        System.out.println("Total Bayar\t = " +totalKeseluruhan);
        totalbayar =totalKeseluruhan + diskon;
        System.out.println("Diskon\t\t = " +diskon);
        System.out.println("Harga Asli\t = " + totalbayar);
    }
}