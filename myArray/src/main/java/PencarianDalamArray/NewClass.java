package PencarianDalamArray;

import java.util.*;
public class NewClass {
    public static void main(String Args[]){
        
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,12,25,10};
        int hasil = 0;
        
        
        for(int i=0; i<arr.length; i++){
            System.out.println("Array ke-"+i+" adalah: "+arr[i]);
                int key = 0;
                if(key == arr[i]){
                hasil = i;
                break;
            }
        }
        System.out.println("Masukkan key yang ingin dicari : ");
        int a = sc.nextInt();
        System.out.println("key ada di array ke: "+hasil);
    }
}
