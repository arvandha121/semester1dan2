import java.io.PrintStream;
import java.util.*;
public class Tugas2 {
    public static void main(String Args[]){
    //========================================================================================
    Scanner sc = new Scanner(System.in);
    int a,b,jumlah,rata_rata, angka;
        //========================================================================================
        System.out.println("=====MENGHITUNG BILANGAN GENAP N BILANGAN=====");
        System.out.println("------------------------------------------------");
        System.out.println("Masukkan range bilangan = ");
        angka = sc.nextInt();
        System.out.printf("Banyaknya Bilangan genap dari 1 sampai %d adalah %d\n",angka,(angka/2));
        //========================================================================================
        for(a=1,b=0,jumlah=0;a<=angka; a++){
            if(a%2==0){
                b++;
                System.out.printf("Bilangan genap %d adalah %d\n", b,a);
                jumlah +=a;
            }
        }
        //========================================================================================
        System.out.println("------------------------------------------------");
        System.out.println("Jumlah Bilangan genap dari 1 sampai "+b+" = "+angka);
        System.out.println("------------------------------------------------");
        rata_rata=jumlah/(angka/2);
        System.out.println("Rata-rata Bilangan genap dari 1 sampai "+b+" = "+rata_rata);
        System.out.println("------------------------------------------------");
    }
}
