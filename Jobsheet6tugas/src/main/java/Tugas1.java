import java.util.*;
public class Tugas1 {
    public static void main(String Args[]){
        //===============================================
        Scanner sc = new Scanner(System.in);
        int x, angka;
        //===============================================
        System.out.println("-----PROGRAM ANGKA-----");
        System.out.println("Masukkan angka : ");
        angka = sc.nextInt();
        System.out.println("-----URUTAN-----");
        for (x=1; x<=angka ;x++){
            if (x%5==0) continue;
            System.out.printf("%d \n",x);
        }
        
    }
}
