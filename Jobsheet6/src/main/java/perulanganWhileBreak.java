import java.util.*;
public class perulanganWhileBreak {
    public static void main(String args[]){
        int angka,b;
        Scanner input = new Scanner(System.in);
        System.out.println("=====PROGRAM LOOP DENGAN BREAK=====");
        b=0;
        while (true){
            
            System.out.println("Masukkan bilangan : ");
            angka = input.nextInt();
            b+=angka;
                if(b>50)break;
            
        }
        System.out.printf("Angka berhenti pada angka : %d \n",b);
    }
}
