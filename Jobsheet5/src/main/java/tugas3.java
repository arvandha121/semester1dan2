import java.util.Scanner;
public class tugas3{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String makanan;
        int harga, total, ongkir;
        double pengiriman;
        //===============================================================================
        System.out.println("Masukkan nama makanan\t: ");
        makanan = sc.nextLine();
        System.out.println("Masukkan harga makanan\t: ");
        harga = sc.nextInt();
        System.out.println("Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)?");
        pengiriman = sc.nextDouble();
        //===============================================================================
        if (pengiriman==0){
            if (harga<=100000){
            ongkir = 20000;
        } else{
            ongkir = 30000;
        }
        System.out.println(makanan + "\t\t\t:Rp " + harga);
        System.out.println("biaya pengiriman\t:Rp " + ongkir);
        total = (harga + ongkir);
        System.out.println("Total\t\t\t:Rp " + total);
        }
        //===============================================================================
        else if(pengiriman==1){
            if (harga<=100000){
                ongkir = 20000 + 25000;
            }else{
                ongkir = 30000 + 25000;
            }
        System.out.println(makanan + "\t\t\t:Rp " + harga);
        System.out.println("biaya pengiriman\t:Rp " + ongkir);
        total = (harga + ongkir);
        System.out.println("Total\t\t\t:Rp " + total);
        }
    }
}