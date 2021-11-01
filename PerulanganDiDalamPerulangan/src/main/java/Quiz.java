import java.util.*;
import java.util.Random;
public class Quiz {
    public static void main(String args[]){
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'y';
        do{
          int number = random.nextInt(10)+1;
          boolean success = false;
          do{
              System.out.print("Tebak angka(1-10): \n");
              int answer = input.nextInt();
              input.nextLine();
              success = (answer == number);
                if(answer<=number){
                    System.out.println("Angka yang Anda masukkan lebih kecil");
                }else{
                    System.out.println("Angka yang Anda masukka lebih besar");
                }
          }while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?\n");
            menu = input.findInLine(".").charAt(0);
            input.nextLine();
        }while(menu == 'y' || menu == 'Y');
    }
}
