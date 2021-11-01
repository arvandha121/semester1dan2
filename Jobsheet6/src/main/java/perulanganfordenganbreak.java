import java.util.*;
public class perulanganfordenganbreak {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int angka,b;
        System.out.println("=====PROGRAM LOOP DENGAN BREAK=====");
        for (b=0; true;){
            
            System.out.println("Masukkan bilangan : ");
            angka = input.nextInt();
            b+= angka;
                if(b>50)break;
        }
        
        System.out.printf("Angka berhenti pada jumlah angka : %d \n", b);
        
    }
}
