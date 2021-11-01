package Tugas;

import java.util.*;
public class NamaBulan {
    public static void main(String Args[]){
        //==============================================================================
        Scanner input = new Scanner(System.in);
        String[]arr = {"January","February","March","April","May","June","July",
                       "September","October","November", "December"};
        //==============================================================================
        System.out.println("\t==========INPUTAN BULAN BERDASARKAN URUTAN==========\t\n");
        System.out.println("Masukkan nilai input bulan dari (1-12): ");
        int keluar = input.nextInt();
        keluar += -1;
        System.out.println("Bulan: "+arr[keluar]);
        //==============================================================================
    }
}