import javax.swing.JOptionPane;//digunakan untuk memanggil JOption
import java.util.*;
public class UjiCobaLoginDialogBox {
    public static void main(String args[]) {
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
        JOptionPane.showMessageDialog(null,"==================================\n\tAnda berhasil login!\n==================================");
        System.exit(0);//akhir program
//        System.out.println("\tAnda berhasil login!");
//        System.out.println("==================================");
    }
}
