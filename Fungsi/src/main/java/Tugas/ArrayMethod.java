package Tugas;
import java.util.*;
public class ArrayMethod {
    static void arr(int nilai[]){
        Scanner input = new Scanner(System.in);
        int i=0;
        for(; i<nilai.length;i++)
        {
        System.out.println("Masukkan nilai mahasiswa "+(i+1)+" = ");
        nilai[i] = input.nextInt();
        }
    }
    static float ratarata(int nilai[]){
        float rata = 0;
        int j=0;
        for(;j<nilai.length;j++)
        {
        rata += nilai[j];
        }
        rata = rata/nilai.length;
        return rata;
    }
    public static void main(String[] args) {
        int nilai[] = new int[10];
        arr(nilai);
        float rataRata = ratarata(nilai);
        System.out.println("rata-rata nilai = "+rataRata);
    }
}
