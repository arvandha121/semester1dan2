package ContohSoal;
import java.util.*;
public class PersegiPanjangMain {
    //==========================================================================
    //==========================================================================
    static double hitung(double panjang, double lebar){
        double luas;
        luas = panjang * lebar;
        System.out.println("----------------------");
        System.out.println("Panjang = "+panjang);
        System.out.println("Lebar = "+lebar);
        System.out.println("----------------------");
        System.out.println("Luas = Panjang * Lebar");
        System.out.println("Luas = "+panjang+" * "+lebar);
        System.out.println("Luas = "+luas);
        return luas;
    }
    //==========================================================================
    static void menu(){
        System.out.println("=================");
        System.out.println("~~~INI MENU YA~~~");
        System.out.println("=================");
        System.out.println("1. input data");
        System.out.println("2. print");
        System.out.println("3. keluar");
        System.out.println("-----------------");
    }
    //==========================================================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjangService pp = new PersegiPanjangService();
        pp.login();
        int pilih;
        int ulang = 0;
        do{
            menu();
            System.out.println("pilih menu : ");
            pilih = sc.nextInt();
            if(pilih == 1){
//                System.out.println("Masukkan Panjang /: ");
//                pp.panjang = sc.nextDouble();
//                System.out.println("Masukkan Lebar : ");
//                pp.lebar = sc.nextDouble();
                System.out.println("Masukkan panjang = ");
                double panjang = sc.nextDouble();
                System.out.println("Masukkan lebar = ");
                double lebar = sc.nextDouble();
                continue;
            }else if(pilih == 2){
//                pp.hitung();
                System.out.println("Lua");
                continue;
            }else if(pilih == 3){
                System.out.println("Anda Keluar dari Program!");
                break;
            }else{
                System.out.println("~~pilihan tidak tersedia~~");
            }
        }while(ulang != 0 || ulang < 3);
    }
    //==========================================================================
}
