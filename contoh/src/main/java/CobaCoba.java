import java.util.*;
public class CobaCoba {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt();
        
        for(int i=1; i<angka; i++){
            for(int j=angka; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print(""+k);
            }
            System.out.println("\n");
        }
    }
}
