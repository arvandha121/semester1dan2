package PratikumPackage;

import java.util.*;
public class Tugas3Revisi {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai N = ");
        int N = sc.nextInt();
        int total = N;
        int i=1;
        while(i<=N){
            i++;
            int j=1;
            while(j<=N){
                j++;
                if(i>1 && i<=(N-1) && j>1 && j<=(N-1)){
                    System.out.print("  ");
                    continue;
                }
                System.out.print(N+" ");
            }
            System.out.println();
        }
    }
}
