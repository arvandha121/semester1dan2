package FungsiRekursif.Tugas;
import java.util.*;
public class Fibonacci {
    //==========================================================================
    static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }else {
            return (fibo(n-1) + fibo(n-2));
        }
    }
    //==========================================================================
    public static void main(String[]args){
        int i, j = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah deret bulan: ");
        int n = scan.nextInt();
        System.out.println("bilangan fibonacci");
        for (i = (0-1); i < n; i++){
            System.out.println(fibo(j)+"");
            j++;
        }
    //==========================================================================    
        System.out.println("nilai akhir dari bulan "+i+" adalah : "+fibo(j-1));
    }
}