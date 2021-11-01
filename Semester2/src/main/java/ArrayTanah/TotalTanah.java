package ArrayTanah;
import java.util.*;
public class TotalTanah{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan array: ");
        int array = sc.nextInt();
        Tanah[] tanah  =new Tanah[array];
        for (int i = 0; i < tanah.length; i++) {
            tanah[i] = new Tanah();
            System.out.println("Masukkan panjang ke-"+(i+1)+": ");
            tanah[i].panjang = sc.nextInt();
            System.out.println("Massukkan lebar"+(i+1)+": ");
            tanah[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < tanah.length; i++) {
            int j = i+1;
            System.out.println("Luas tanah ke-"+j+" = "+tanah[i].luasTanah());
        }
        for (int j = 0; j < tanah.length; j++) {
            if (tanah[j].luasTanah() == tanah[j].tanahTerluas(tanah)) {
                int k = 0;
                k = j+1;
                System.out.println("Tanah yang terluas adalah : "+k);
            }
        }
    }
}