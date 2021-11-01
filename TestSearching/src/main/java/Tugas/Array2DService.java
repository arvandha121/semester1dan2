package Tugas;
import java.util.*;
public class Array2DService {
    
    Array2D[] array[] = new Array2D[4][6];
    
    void pencarian(){
        Scanner sc = new Scanner(System.in);
        Array2D arr = new Array2D(4,6);
//        int[] array[] = {
//            {45, 78, 7, 200, 80},
//            {90, 1, 17, 100, 50},
//            {21, 2, 40, 18, 65}};
        int[] array[] = new int[arr.baris][arr.kolom];
        System.out.println("Masukkan baris array :");
        arr.baris = sc.nextInt();
        System.out.println("Masukkan kolom array :");
        arr.kolom = sc.nextInt();
        for (int i = 0; i < arr.baris; i++) {
            for (int j = 0; j < arr.kolom; j++) {
                System.out.println("Masukkan array ke-["+i+"]["+j+"]");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("==================================================");
        for (int i = 0; i < arr.baris; i++) {
            for (int j = 0; j < arr.kolom; j++) {
                System.out.println("data ["+i+"]["+j+"] = "+array[i][j]);
            }
        }
        System.out.println("==================================================");
        boolean ketemu = false;
        System.out.println("cari array: ");
        int cari = sc.nextInt();
        System.out.println("----------------------------------");
        for (int i = 0; i < arr.baris; i++) {
            for (int j = 0; j < arr.baris; j++) {
                if(cari == array[i][j]){
                    System.out.println("Data ditemukan pada index ke-["+i+"]["+j+"]");
                    ketemu = false;
                    break;
                    
                }
                
            }
        }
        if(ketemu == true){
            System.out.println("Data tidak ditemukan!");
        }
    }
}