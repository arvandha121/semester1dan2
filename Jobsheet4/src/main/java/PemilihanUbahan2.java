import java.util.Scanner;

public class PemilihanUbahan2{
    public static void main(String[] args){
        
        int nilai1;
        int nilai2;
        float ratarata;
        Scanner input=new Scanner(System.in);
        
            System.out.println("Masukkan Sebuah Bilangan pertama: ");
            nilai1=input.nextInt();
            
            System.out.println("Masukkan Sebuah Bilangan kedua: ");
            nilai2=input.nextInt();
            
            ratarata = (float)(nilai1+nilai2)/2;
            
            if (ratarata>=100){
                System.out.println("Hasil nilai adalah: " +(ratarata+5));
            }
            else {
                System.out.println("Hasil nilai adalah: " +(ratarata));
            }
            
    }
}