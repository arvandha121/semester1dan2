import java.util.*;
//public class Prak6 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukan panjang");
//        int p = input.nextInt();
//        System.out.println("Masukkan lebar: ");
//        int l = input.nextInt();
//        System.out.println("Masukkan tinggi: ");
//        int t = input.nextInt();
//        
//        int L = p*l;
//        System.out.println("Luas Persegi Panjang Adalah : "+L);
//        
//        int vol = p*l*t;
//        System.out.println("Volume Balok Adalah : "+vol);
//    }
//}
public class Prak6{
    static int hitungLuas(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
    static int hitungVolume(int tinggi, int panjang, int lebar){
        int volume = hitungLuas(panjang,lebar)*tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Panjang : ");
        int panjang = input.nextInt();
        System.out.println("Masukkan Lebar : ");
        int lebar = input.nextInt();
        System.out.println("Masukkan Tinggi : ");
        int tinggi = input.nextInt();
        
        int Luas = hitungLuas(panjang, lebar);
        System.out.println("Luas Persegi Panjang Adalah : "+Luas);
        int vol = hitungVolume(panjang, tinggi, lebar);
        System.out.println("Volume Balok Adalah : "+vol);
    }
}