package Tugas;

import java.util.*;
public class GenapGanjilArray {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        System.out.println("\t=====BILANGAN GANJIL GENAP ARRAY=====\t");
        System.out.print("Masukkan jumlah array: ");
        int jumlahArray = input.nextInt();
        int[]arr = new int[jumlahArray];
        
        for(int i=1-1; i<arr.length; i++){
            System.out.print("Masukkan Array ke-"+i+": ");
            arr[i] = input.nextInt();
        }
        
        int j = -1;
        while(j<arr.length){
            j++;
            if(arr[j]%2 == 0){
                System.out.println("Bilangan genap : "+arr[j]);
            }else{
                System.out.println("Bilangan ganjil : "+arr[j]);
            }
        }
    }
}