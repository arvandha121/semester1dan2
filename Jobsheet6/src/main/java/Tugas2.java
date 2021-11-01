import java.util.*;
public class Tugas2 {
    public static void main(String Args[]){
        //===============================================
        Scanner sc = new Scanner(System.in);
        int angka,a,b,rata;
        int total;
        //===============================================
        System.out.println("====MENGHITUNG BILANGAN GENAP N BILANGAN=====");
        System.out.println("--------------------------------------------------");
        System.out.println("Masukkan range bilangan = ");
        angka = sc.nextInt();
        System.out.println("Banyak Bilangan genap dari 1 sampai "+angka+" adalah "+(angka/2));
        System.out.println("--------------------------------------------------");
        //===============================================
        for (a=1,b=0,total=0; a<=angka ;a+=2){
            if(a%2==0);
            b++;
            System.out.println("Bilangan genap "+a+" = "+b);
            total +=a;
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Jumlah bilangan genap 1 sampai "+b+" = "+total);
        System.out.println("--------------------------------------------------");
        rata = total/(angka/2);
        System.out.println("Rata-rata bilangan genap 1 sampai"+b+" = "+rata);
        
    }
}
