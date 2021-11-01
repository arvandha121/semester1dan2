import java.util.Scanner;

public class Pemilihan1{
    public static void main(String[] args){
        
        Scanner input =new Scanner(System.in);
        int bil;
        
        System.out.println("Masukkan Sebuah Bilangan : ");
        bil=input.nextInt();
        
        if (bil%2==0){
            System.out.println("Bilangan Genap");
        }
        else{
            System.out.println("Bilangan Ganjil");
        }
    }
}