import java.util.Scanner;

public class Pemilihan2{
    public static void main(String[] args){
        
        int nilai;
        Scanner input=new Scanner(System.in);
        
            System.out.println("Masukkan Sebuah Bilangan: ");
            nilai=input.nextInt();
            
            if(nilai>=100){
                nilai+=10;
            }
            else{
                nilai-=10;
            }
            
            System.out.println("Hasil Nilai Akhir adalah" +nilai);
    }
}