package Kuis1;
import java.util.*;
public class MainBarang {
    
    public static String username;
    
    //=================================================================================================================================
    
    static void inputan() {
        int pass;
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------- Login Akun ----------------------------------");
        do{
            System.out.println("");
            //memasukkan username
            System.out.println("Masukkan username akun : ");//memasukkan username bebas dengan nama username apapun
            username = input.next();
            //memasukkan password
            System.out.println("Masukkan password akun (4 digit angka) : ");
            pass = input.nextInt();
            //password benar jika memasukkan input "1234"
            if (pass == 1234) {
                System.out.println("");
                System.out.println("~ANDA BERHASIL LOGIN~");
		System.out.println("------------------------------------------------------------------------------");
                System.out.println("\t\t~~SELAMAT DATANG "+username+" DI PROGRAM PEMBELIAN~~\n");
            }
            //password salah jika memasukkan selain input "1234"
            else {
                System.out.println("");
                System.out.println("~PASSWORD YANG ANDA MASUKKAN SALAH~");
            }
        }while (pass != 1234);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //=================================================================================================================================
        
        inputan();
        System.out.println("");
        
        //=================================================================================================================================
        
        Barang[] barang = new Barang[5];
        
        //=================================================================================================================================
        
        System.out.println("\t=======================");
        System.out.println("\tTOKO MAJU MUNDUR CANTIK");
        System.out.println("\t=======================");
        
        //=================================================================================================================================
        
        int ulang = 0;
        do{
            System.out.println("========== Pilihlah menu di bawah ini! ==========");
            System.out.println("1. Tampilkan barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.println("-------------------------");
            System.out.println("Pilih menu : ");
            int menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    TransaksiBarang tampil = new TransaksiBarang();
                    tampil.Tampil();
                    break;
                case 2:
                    TransaksiBarang beli = new TransaksiBarang();
                    beli.beli();
                    break;
                case 3:
                    TransaksiBarang tampilBeli = new TransaksiBarang();
                    tampilBeli.tampilBeli();
                    break;
            }
            if(menu == 4){
                System.out.println("Anda telah keluar dari program!");
                System.out.println();
                break;
            }
        }
        while(ulang!=0 || ulang<5);
        
        }
    
}
        
