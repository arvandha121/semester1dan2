package Tugas;

import java.util.*;
public class ElemenTerbesarArray {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int []arr = new int[4];
        arr[0] = 25;
        arr[1] = 10;
        arr[2] = 55;
        arr[3] = 15;
        System.out.println("\t==========Mencari Elemen Array Terbesar==========\t");
        System.out.print("Masukkan isi array: ");
        int isi = input.nextInt();
        
        for(int i=1-1; i<arr.length; i++){
            System.out.print("Masukkan elemen array ke-"+i+": ");
            arr[i] = input.nextInt();
        }int m = arr[0];
        for(int j=1; j<arr.length; j++){
            if(m<arr[j]){
                m = arr[j];
            }
        }
        System.out.printf("Bilangan terbesar adalah : %d",m);
    }
}