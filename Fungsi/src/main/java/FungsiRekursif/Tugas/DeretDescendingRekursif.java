package FungsiRekursif.Tugas;
import java.util.*;
public class DeretDescendingRekursif {
    static int tampilDeretRekursif(int x){
        if(x>=0){
            System.out.print(x+",");
            tampilDeretRekursif(x-1);
        }else{
            System.out.println();
        }
        return x;
    }
    static int tampilDeretInteratif(int y){
        for(int i=y; i>=0; i--){
            System.out.print(y+",");
            y = y-1;
        }
        return y;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan nilai urut Rekursif!");
//        int rekursif = sc.nextInt();
//        tampilDeretRekursif(rekursif);
//        System.out.println("Masukkan nilai urut Interatif!");
//        int interatif = sc.nextInt();
//        tampilDeretInteratif(interatif);
        tampilDeretRekursif(10);
        tampilDeretInteratif(10);
    }
}