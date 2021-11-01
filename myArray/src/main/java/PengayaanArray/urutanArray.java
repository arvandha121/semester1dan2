package PengayaanArray;

import java.util.*;
public class urutanArray {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int[]arr = new int[4];
        
        System.out.print("Masukkan jumlah elemen array: ");
        int jml = input.nextInt();
        
        for(int i=1-1; i<4; i++){
            System.out.printf("Array ke %d: ",i);
            arr[i] = input.nextInt();
        }
        int m;
        for(int j=0; j<4; j++){
            for(int k=0; k<4; k++){
                if(arr[j]<arr[k]){
                    m = arr[j];
                    arr[j] = arr[k];
                    arr[k] = m;
                }
            }
        }
        System.out.print("Hasil Pengurutan: "+"\t");
        for(int i=0; i<4; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
