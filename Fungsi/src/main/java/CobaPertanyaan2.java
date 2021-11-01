import java.util.*;
public class CobaPertanyaan2 {
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
    static void coba(int a, int b){
        if(a<0){
            System.out.println("nilai 1 kurang dari 0");
        }else if(b<0){
            System.out.println("nilai 2 kurang dari 0");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai 1: ");
        int nilai1 = input.nextInt();
        System.out.println("Masukkan Nilai 2: ");
        int nilai2 = input.nextInt();
        if(nilai1<0 != nilai2<0){
        coba(nilai1, nilai2);
        }
        else{
        int hasil = Kurang(nilai1, nilai2);
        System.out.println("Hasil akhir adalah "+hasil);
        }
    }
}