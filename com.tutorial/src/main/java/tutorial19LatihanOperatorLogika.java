import java.util.Scanner;
import java.util.*;

public class tutorial19LatihanOperatorLogika {
    public static void main(String args[]){
        
        // Membuat sebuah objek untuk menangkap input user
        Scanner input = new Scanner (System.in);
        
        // Sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.println("Masukkan nilai tebakan anda: ");
        nilaiTebakan = input.nextInt();
        System.out.println("nilai tebakan anda adalah = "+ nilaiTebakan);
        
        //operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda "+statusTebakan);
        
        //operasi aljabar boolean (and / or)
        System.out.println("masukkan nilai diantara 4 dan 9");
        nilaiTebakan = input.nextInt();
        statusTebakan = (nilaiTebakan >= 4)&& (nilaiTebakan <= 9);
        
        /*
            a | b | c
            0 | 0 | 0
            0 | 1 | 0
            1 | 0 | 0
            1 | 1 | 1
        */
        
        System.out.println("tebakan anda = "+statusTebakan);
        
    }
}
