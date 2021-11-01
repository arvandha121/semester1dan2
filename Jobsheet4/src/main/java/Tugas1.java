import java.util.Scanner;

public class Tugas1{
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        int bilangan1, bilangan2;
        
        System.out.println("Masukkan nilai bilangan pertama:\t\t");
        bilangan1= input.nextInt();
        
        System.out.println("Masukka nilai bilangan kedua:\t\t");
        bilangan2= input.nextInt();
        
        if (bilangan1 > bilangan2){
            System.out.println("Bilangan terbesar adalah:\t\t" +bilangan1);
        }
        else{
            System.out.println("Bilangan terbesar adalah:\t\t" +bilangan2);
        }
    }
}