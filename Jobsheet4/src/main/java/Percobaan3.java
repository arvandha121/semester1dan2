import java.util.Scanner;

public class Percobaan3{
    public static void main(String[] args){
        
        int umur;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Masukkan umur anda");
        umur=input.nextInt();
        
        if (umur>60){
            System.out.println("Lansia");
        }
        else if (umur>45){
            System.out.println("Tua");
        }
        else if (umur>17){
            System.out.println("Dewasa");
        }
        else if (umur>5){
            System.out.println("Anak anak");
        }
        else {
            System.out.println("Balita");
        }
        
    }
}