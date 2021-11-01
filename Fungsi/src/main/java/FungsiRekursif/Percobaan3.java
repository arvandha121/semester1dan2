package FungsiRekursif;
import java.util.*;
public class Percobaan3 {
    static int hitungBunga(int tahun, double saldo){
        if(tahun==0){
            return(int) (saldo);
        }
        else{
            return(int) (1.11 * hitungBunga((int) saldo,tahun-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah saldo awal : ");
        int saldoAwal = sc.nextInt();
        System.out.println("Lamanya menabung(Tahun) : ");
        int tahun = sc.nextInt();
        System.out.println("Jumlah uang setelah "+tahun+" tahun : ");
        System.out.println(hitungBunga(saldoAwal,tahun));
    }
}