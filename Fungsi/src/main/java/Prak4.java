import java.util.*;
public class Prak4 {
    static int Kali(int c, int d){
        int H;
        H = (c+10) % (d+19);
        return H;
    }
    static int Kurang(int a, int b){
        int x;
        a=a+7;
        b=b+4;
        x=Kali(a,b);
        return x;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai 1: ");
        int nilai1 = input.nextInt();
        System.out.println("Masukkan Nilai 2: ");
        int nilai2 = input.nextInt();
        int hasil = Kurang(nilai1, nilai2);
        System.out.println("Hasil akhir adalah "+hasil);
    }
}
