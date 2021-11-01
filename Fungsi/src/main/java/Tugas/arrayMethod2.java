package Tugas;
import java.util.*;
public class arrayMethod2 {
    //==========================================================================
    static void arr(int nilai[]){
        Scanner input = new Scanner(System.in);
        int i=0;
        for(; i<nilai.length;i++)
        {
        System.out.println("Masukkan nilai mahasiswa "+(i+1)+" = ");
        nilai[i] = input.nextInt();
        }
    }
    //==========================================================================
    static float ratarata(int nilai[]){
        float rata = 0;
        int j=0;
        for(;j<nilai.length;j++)
        {
        rata += nilai[j];
        }
        rata/=nilai.length;
        return rata;
    }
    //==========================================================================
    static int nilaiTerbesar(int a[]){
        int max = 0;
        for(int i = 0; i<10; i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        int terbesar = max;
        System.out.println("nilai terbesar = "+terbesar);
        return max;
    }
    //==========================================================================
    static int nilaiTerkecil(int a[]){
        int min = a[0];
        for(int i = 0; i<10; i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        System.out.println("nilai terkecil = "+min);
        int terkecil = min;
        return min;
    }
    //==========================================================================
    public static void main(String[] args) {
        int nilai[] = new int[10];
        arr(nilai);
        float rataRata = ratarata(nilai);
        System.out.println("nilai rata-rata = "+rataRata);
        int terbesar = nilaiTerbesar(nilai);
        int terkecil = nilaiTerkecil(nilai);
    }
}