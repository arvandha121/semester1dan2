package Pratikum;
import java.util.*;

public class votingPemilihan {
    
    String kandidat;
    int suara;
    
    int votingPemilihan(int[] pilih, int low, int high){
        if(high - low == 1){
            if (pilih[low] >= pilih[high]){
                return pilih[low];
            }else {
                return pilih[high];
            }
        }else if(high > low){
            int a = (high-low)/1 + low;
            int kanan = votingPemilihan(pilih, (a+1), high);
            int kiri = votingPemilihan(pilih, low, a);
            if(kiri > 0){
                return kiri;
            } else if(kanan != 0){
                return kanan;
            }
            return high;
        }
    return 0;
    }
    
    static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("================================== Login Akun ==================================");
        int username;
        int pass;
        do{
            System.out.println("Masukkan username (dengan angka 4 huruf) : ");
            username = sc.nextInt();
            System.out.println("Masukkan password (dengan angka 4 huruf) : ");
            pass = sc.nextInt();
            if(username==1234){
                System.out.println("username anda benar (v)");
                if(pass==1234){
                    System.out.println("password anda benar (v)");
                    System.out.println("");
                }else if(pass!=1234){
                    System.out.println("password anda salah (x)");
                    System.out.println("-----------------------");
                    System.out.println("");
                }
            }else if(username != 1234){
                System.out.println("username anda salah (x)");
                if(pass==1234){
                    System.out.println("password anda benar (v)");
                    System.out.println("");
                }else if(pass!=1234){
                    System.out.println("password anda salah (x)");
                    System.out.println("-----------------------");
                    System.out.println("");
                }
                System.out.println("");
            }
            continue;
        }
        while(username != 1234 || pass != 1234);
        
        System.out.println("==================================");
        System.out.println("\tAnda berhasil login!");
        System.out.println("==================================");
    }
    
}
