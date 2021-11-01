package PratikumPackage;

import java.util.*;
public class Tugas4 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        int i = 1;
        while(i<=N){
            i++;
            if(i%2==1){
                for(int j=1 ;j<=N; j++){
                    System.out.print(j);
                }
            }else{
                for(int k=N; k>0 ;k--){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
        
    }
}
