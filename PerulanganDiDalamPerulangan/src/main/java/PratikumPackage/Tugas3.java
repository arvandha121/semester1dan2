package PratikumPackage;

import java.util.*;
public class Tugas3 {

    private static int i;
    @SuppressWarnings("empty-statement")
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        int total = N;
        
        for(int i=1 ;i<=N; i++){
            for(int j=1;j<=N;j++){
                if(i>1 && i<=(N-1) && j>1 && j<=(N-1)){
                    System.out.print("  ");
                    continue;
                }
                System.out.print(total+ " ");
            }
            System.out.println();
        }
        if(N<3){
            System.out.println("Nilai yang anda masukkan salah karena dibawah 3");
        }
    }
}