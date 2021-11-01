package uas;
import java.util.*;
public class main {
    
    static void menu(){
        System.out.println("============================");
        System.out.println("\t  SAMSAT");
        System.out.println("============================");
        System.out.println("1. Tampil Kendaraan");
        System.out.println("2. Input Pajak");
        System.out.println("3. Tampil Pajak");
        System.out.println("4. Tampil Transaksi");
        System.out.println("5. Tampil Pendapatan");
        System.out.println("0. Keluar!");
        System.out.println("---------------------------");
    }
    
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        Proses pr = new Proses();
        int ulang = 0;
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            if(pilih == 1){
                pr.TampilKendaraan();
            }else if(pilih == 2){
                pr.inputPajak();
            }else if(pilih == 3){
                pr.TampilPajak();
            }
        }while (ulang != 0 || ulang < 3);
    }
    
}
