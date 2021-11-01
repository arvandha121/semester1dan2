package Jobsheet1Praktikum;
import java.util.*;
public class Praktikum4 {
    static void perulangan(){
        Scanner input = new Scanner(System.in);
        int i;
        System.out.print("Masukan Banyak Bilangan Yang Ditampilkan : ");
        int batas = input.nextInt();
        int f = 1;
        int f2 = 0;
        int fib = 1;
        for (i = 0; i <= batas; i++) {
            System.out.print(f2+",");
            fib = f+f2;
            f=f2;
            f2=fib;
        }
    }
    public static void main(String[] args) {
        perulangan();
    }
}
