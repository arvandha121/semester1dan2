import java.util.Scanner;
public class kasir{
    public static void main(String[] args){
        int total, diskon, bayar;
        String kartu;
        Scanner input = new Scanner(System.in);
        //===========================================================================
        System.out.println("Apakah pelanggan mempunyai kartu anggota (y atau t)?");
        kartu = input.nextLine();
        System.out.println("Berapa total barang belanjaan? Rp ");
        total = input.nextInt();
        //===========================================================================
        if (kartu.equals("y")){
            if (total >= 500000){
                diskon = 50000;
            }else {
                diskon = 25000;
            }
        }else {
            if (total >= 200000){
                diskon = 10000;
            }else {
                diskon = 0;
            }
        }
        //===========================================================================
        bayar = total - diskon;
        System.out.println("Total yang harus dibayar: " + bayar);
    }
}