package PratikumPackage;

import java.util.*;
public class Tugas2 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nilai N = \n");
        int N = sc.nextInt();
        int i = 1;
        while(i<=N){
            i++;
        int j=N;
        while(j>=i){
            System.out.print("*");
            j--;
        }    
        System.out.println("");
        }
        
    }
}
