import java.util.*;
public class perulanganDoWhile {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int angka,fact,i;
        System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
        System.out.println("Masukkan bilangan : ");
        
        angka = input.nextInt();
        fact = 1;
        i = 1;
        do{            
            fact = fact*i;
            i++;            
        }
        while (i<=angka);
        System.out.printf("Nilaii faktorial bilangan tersebut adalah : %d \n", fact);
    }
}
