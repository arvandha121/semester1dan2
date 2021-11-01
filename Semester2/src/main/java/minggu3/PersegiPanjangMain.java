package minggu3;
import java.util.Scanner;
public class PersegiPanjangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        int array;
//        
//        System.out.println("Masukkan panjang array: ");
//        array = sc.nextInt();
        
        PersegiPanjang[] ppArray = new PersegiPanjang[100];
        
//        ppArray[0] = new PersegiPanjang();
//        ppArray[0].panjang = 110;
//        ppArray[0].lebar = 30;
//        
//        ppArray[1] = new PersegiPanjang();
//        ppArray[1].panjang = 80;
//        ppArray[1].lebar = 40;
//        
//        ppArray[2] = new PersegiPanjang();
//        ppArray[2].panjang = 100;
//        ppArray[2].lebar = 20;
//    
//        System.out.println("Persegi Panjang ke-0, panjang: "+ppArray[0].panjang+", lebar: "+ppArray[0].lebar);
//        System.out.println("Persegi Panjang ke-0, panjang: "+ppArray[1].panjang+", lebar: "+ppArray[1].lebar);
//        System.out.println("Persegi Panjang ke-0, panjang: "+ppArray[2].panjang+", lebar: "+ppArray[2].lebar);
    
        
        for(int i = 0; i<3; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Masukkan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar: ");
            ppArray[i].lebar = sc.nextInt();
            System.out.println("---------------------");
        }
        for(int i = 0; i<3; i++){
            System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[i].panjang+", lebar: "+ppArray[i].lebar);
        }
    }
}
