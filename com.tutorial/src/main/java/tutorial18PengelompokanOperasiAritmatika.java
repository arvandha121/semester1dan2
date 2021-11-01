import java.util.Scanner;

public class tutorial18PengelompokanOperasiAritmatika {
    public static void main(String args[]){
        
        // Kesimpulan adalah
        // perkalian dan pembagian akan dilakukan terlebih dahulu
        
        // Jika dilakukan perkalian dan pembagian, maka
        // akan dilakukan operasinya dari kiri ke kanan
        float hasil1;
        int hasil = 5*10/2;
        System.out.println(hasil);
        hasil = 5+2-10;
        System.out.println(hasil);
        
        // Menggunakan pengelompokan operasi dengan ()
        hasil = 5 * (2 + 10);
        System.out.println(hasil);
        
        hasil1 = (float)63 / (2 + 10);
        System.out.println(hasil1);
        
        Scanner input = new Scanner(System.in);
        // Perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,c;
        int x;
        System.out.println("nilai x = ");
        x = input.nextInt();
        System.out.println("gradient m = ");
        m = input.nextInt();
        System.out.println("bias c = ");
        c = input.nextInt();
        int y;
        y = m*x*x + c;
        System.out.println("nilai y = "+y);
        
    }
}
