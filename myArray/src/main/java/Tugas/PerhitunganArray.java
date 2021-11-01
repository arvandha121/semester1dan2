package Tugas;

import java.util.*;
public class PerhitunganArray {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int[]arr = new int[8];
        
        System.out.println("\t=====PERHITUNGAN MENGGUNAKAN ARRAY=====\t\n");
        
        int jml = 0;
        int urutan =arr.length;
        
        for(int i=0; i<arr.length; i++){
            System.out.print(urutan+" ");
            arr[i]=urutan;
            urutan *= 3;
            jml += arr[i];
        }
        System.out.println();
        System.out.println(arr[0]+ "+" +arr[1]+ "+" + arr[2] + "+" +arr[3]+ "+" +arr[4]+ "+" +arr[5]+ "+" +arr[6]+ "+" +arr[7]);
        System.out.println("Jumlah Keseluruhan : "+jml);
    }
}