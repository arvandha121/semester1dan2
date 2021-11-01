import java.util.*;
public class perulanganwhile {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int angka,fact,i;
        System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
        System.out.println("Masukkan bilangan : ");
        
        angka = input.nextInt();
        fact = 1;
        i = 1;
        while (i<=angka){
            
            fact = fact * i;
            i++;
            
        }
        System.out.printf("Nilai faktorial bilangan tersebut adalah : %d \n",fact);
    }
}