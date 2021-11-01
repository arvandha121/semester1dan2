import java.util.*;
public class perulanganfor {
    public static void main(String Args[]){
        
        int angka, fac, i;
            System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
            System.out.println("Masukkan bilangan : ");
            
            Scanner input = new Scanner (System.in);
            angka = input.nextInt();
            fac = 1;
            for (i=1; i<=angka ;i++){
                if(fac>i){
                }
                fac = fac*i;   
            }
        System.out.printf("Nilai faktorial bilangan tersebut adalah : %d \n",fac);
    }
}
