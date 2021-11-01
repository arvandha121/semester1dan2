package ArrayTanah;
import java.util.*;
public class luasTotalTanah {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //================================================================
        
        System.out.println("\t ===== Luas Seluruh Tanah =====");
        System.out.println("-----------------------------------------");
        System.out.println("Masukkan array total: ");
        int arrayTotal = sc.nextInt();
        System.out.println("-----------------------------------------");
        
        //================================================================
        
        Tanah1[] tanah1 = new Tanah1[arrayTotal];
        for (int i=0; i<tanah1.length; i++){
            tanah1[i] = new Tanah1();
            System.out.println("Masukkan Panjang"+(i+1)+": ");
            tanah1[i].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar"+(i+1)+": ");
            tanah1[i].lebar = sc.nextInt();
        }
        for (int i=0; i<tanah1.length; i++) {
            System.out.println("Luas Tanah1 = "+tanah1[i].luasTanah1());
        }
        System.out.println("-----------------------------------------");
        
        //================================================================
        
        Tanah2[] tanah2 = new Tanah2[arrayTotal];
        for (int i = 0; i<tanah2.length; i++){
            tanah2[i] = new Tanah2();
            System.out.println("Masukkan Panjang"+(i+1)+": ");
            tanah2[i].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar"+(i+1)+": ");
            tanah2[i].lebar = sc.nextInt();
        }
        for (int i=0; i<tanah1.length; i++){
            System.out.println("Luas Tanah2 = "+tanah2[i].luasTanah2());
        }
        System.out.println("-----------------------------------------");
        
        //================================================================
        
        Tanah3[] tanah3 = new Tanah3[arrayTotal];
        int k = 0;
        for (int i=0; i<tanah3.length; i++){
            tanah3[i] = new Tanah3();
            System.out.println("Masukkan Panjang"+(i+1)+": ");
            tanah3[i].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar"+(i+1)+": ");
            tanah3[i].lebar = sc.nextInt();
        }
        for (int i=0; i<tanah3.length; i++) {
            System.out.println("Luas Tanah2 = "+tanah3[i].luasTanah3());
        
        }
        System.out.println("-----------------------------------------");
        
        //================================================================
        
        for (int i = 0; i < tanah1.length; i++) {
            System.out.println("Luas Tanah1 = "+tanah1[i].luasTanah1());
        }
        for (int i = 0; i < tanah2.length; i++) {
            System.out.println("Luas Tanah2 = "+tanah2[i].luasTanah2());
        }
        for (int i = 0; i < tanah3.length; i++) {
            System.out.println("Luas Tanah1 = "+tanah3[i].luasTanah3());
        }
    }
}
