package ArraySegitiga;
import java.util.*;
import minggu3.PersegiPanjang;
public class SegitigaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan array: ");
        int array = sc.nextInt();
        Segitiga[] sgArray = new Segitiga[array];
        
        for(int i = 0; i<sgArray.length; i++){
            sgArray[i] = new Segitiga();
            System.out.println("Segitiga ke-"+i);
            System.out.println("Masukkan alas: ");
            sgArray[i].alas = sc.nextInt();
            System.out.println("Segitiga ke-"+i);
            System.out.println("Masukkan tinggi: ");
            sgArray[i].tinggi = sc.nextInt();
        }
        for(int i = 0; i<sgArray.length; i++){
            System.out.println("Segitiga ke-"+i);
            System.out.println("sgArray: "+i+", alas: "+sgArray[i].alas+", lebar: "+sgArray[i].tinggi);
            System.out.println("Luas: "+sgArray[i].hitungLuas());
            System.out.println("Keliling: "+sgArray[i].hitungKeliling());
        }
    }
}
