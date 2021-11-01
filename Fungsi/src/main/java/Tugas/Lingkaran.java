package Tugas;
import java.util.*;
public class Lingkaran {
    static int kelilingLingkaran(int r){
        float phi = (float) 3.14;
        float keliling = phi * 2 * r;
        System.out.println("Keliling lingkaran = "+keliling);
        return (int) keliling;
    }
    static int luasLingkaran(int r){
        float phi = (float)3.14;
        float luas = phi * r * r;
        System.out.println("Luas lingkaran = "+luas);
        return (int) luas;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai r = ");
        int r = input.nextInt();
        System.out.print("\n");
        System.out.println("Rumus Keliling lingkaran");
        System.out.println("-------------------------");
        System.out.println("Keliling = phi * 2 * r");
        float Keliling = kelilingLingkaran(r);
        System.out.println("\n");
        System.out.println("Rumus Luas lingkaran");
        System.out.println("-------------------------");
        System.out.println("Keliling = phi * r * r");
        float Luas = luasLingkaran(r);
    }
}