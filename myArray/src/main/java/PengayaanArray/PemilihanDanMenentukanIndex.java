package PengayaanArray;

import java.util.*;
public class PemilihanDanMenentukanIndex {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int []arr = new int[4];
        int indeks = 0, i=1-1;
        
        System.out.println("\t==========Mencari Indeks Array==========\t");
        System.out.print("Masukkan isi array: ");
        int isi = input.nextInt();
        
        for(i=1-1; i<arr.length; i++){
            System.out.print("Masukkan elemen array ke-"+i+": ");
            arr[i] = input.nextInt();
        }
        for(i=1; i<arr.length; i++){
            if(i==arr[i]){
                indeks = i;
            }
        }
        System.out.print("Masukkan indek yang dicari : ");
        int cari = input.nextInt();
        System.out.println("Key indek ada di posisi: "+indeks);
    }
}
