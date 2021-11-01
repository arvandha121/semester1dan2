import java.util.Scanner;

public class Tugas2{
    public static void main(String[] args){
        
        int umur;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Masukkan umur anda: ");
        umur=input.nextInt();
        
                if (umur>=17){
                    System.out.println("Maka boleh berkendara");
                }
                else if (umur <=17){
                    System.out.println("Tidak boleh berkendara");
                }
    }
}