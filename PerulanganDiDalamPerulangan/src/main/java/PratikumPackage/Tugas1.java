package PratikumPackage;

import java.util.*;
public class Tugas1 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        for(int i=1; i<=N ;i++){
            int j=N;
            while(j>i){
                j--;
                System.out.print(" ");
            }for(int k=1; k<=i ; k++){
                System.out.print(""+k);
            }
            System.out.print("\n");
        }
    }
}
