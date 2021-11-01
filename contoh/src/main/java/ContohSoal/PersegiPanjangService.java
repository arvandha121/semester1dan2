//package ContohSoal;
//import java.util.*;
//public class PersegiPanjangService {
//    //==========================================================================
//    double panjang, lebar;
//    //==========================================================================
//    void hitung(){
//        double Luas = panjang * lebar;
//        System.out.println("---------------------------");
//        System.out.println("Panjang = "+panjang);
//        System.out.println("Lebar = "+lebar);
//        System.out.println("---------------------------");
//        System.out.println("Luas = "+panjang+" * "+lebar);
//        System.out.println("Luas Persegi Panjang = "+Luas+"\n");
//    }
//    //==========================================================================
//    void login(){
//        Scanner sc = new Scanner(System.in);
//        int username;
//        int pass;
//        do{
//            System.out.println("================================");
//            System.out.println("~~~~~~~~~~ Login Akun ~~~~~~~~~~");
//            System.out.println("================================");
//            System.out.println("Masukkan username (dengan 4 angka) : ");
//            username = sc.nextInt();
//            System.out.println("Masukkan password (dengan 4 angka) : ");
//            pass = sc.nextInt();
//            if(username == 1234){
//                System.out.println("-----------------------");
//                System.out.println("username anda benar (v)");
//                if(pass == 1234){
//                    System.out.println("password anda benar (v)");
//                    System.out.println("-----------------------");
//                }else if(pass != 1234){
//                    System.out.println("password anda salah (x)");
//                    System.out.println("-----------------------");
//                }
//                System.out.println("");
//            }else if(username != 1234){
//                System.out.println("-----------------------");
//                System.out.println("username anda salah (x)");
//                if(pass==1234){
//                    System.out.println("password anda benar (v)");
//                    System.out.println("-----------------------");
//                }else if(pass != 1234){
//                    System.out.println("password anda salah (x)");
//                    System.out.println("-----------------------");
//                }
//                System.out.println("");
//            }
//            continue;
//        }
//        while(username != 1234 || pass != 1234);
//        
//        System.out.println("==================================");
//        System.out.println("\tAnda berhasil login!");
//        System.out.println("==================================\n");
//    }
//    //==========================================================================
//}
