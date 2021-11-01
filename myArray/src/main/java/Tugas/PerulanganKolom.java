package Tugas;

import java.util.*;
public class PerulanganKolom {

    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        String[]arr = {"5","2","7","9","6"};
        
        for(int i=1-1; i<arr.length; i++){
            System.out.println("bilangan "+(i+1)+": ");
            arr[i]=input.nextLine();
        }
        for(int j=4; j>=0; j--){
            System.out.print(arr[j]+" ");
        }
    }
}