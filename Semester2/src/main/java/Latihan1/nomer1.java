package Latihan1;

import java.util.*;
public class nomer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan urutan angka: ");
        int urut = sc.nextInt();
        for(int i=1; i<=urut; i++){
            if(i==1)
                continue;
            if(i==7)
                continue;
            System.out.print(i+",");
        }
    }
}
