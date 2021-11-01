import java.util.*;
public class tutorial28DoWhileLoop {
    public static void main(String args[]){
        
        Scanner sc = new Scanner (System.in);
        
        boolean kondisi = true;
        int a = 0;
        
        System.out.println("awal program");
        do{
            a++;
            System.out.println("do while ke-"+a);
            if (a == 10){
                kondisi = false;
            }
        }while(kondisi);
        System.out.println("akhir program");
    }
}
