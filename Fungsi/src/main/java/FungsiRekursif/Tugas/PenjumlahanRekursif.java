package FungsiRekursif.Tugas;
import java.util.*;
public class PenjumlahanRekursif {
    static int jumlahRekursif(int n){
        if(n==1){
            return(1);
        }else{
            return(n+jumlahRekursif(n-1));
        }
    }
    public static void main(String[] args) {
        System.out.println("Perhitungan 1+2+3+4+5+6+7+8 adalah : ");
        System.out.println(jumlahRekursif(8));
    }
}
