import java.util.Scanner;
import java.util.*;

public class tutorial20IfElseStatement {
    public static void main(String args[]){
        
        // tutorial untuk if else statement bercabangan
        
        int a = 5;
        Scanner input = new Scanner(System.in);
        
        // ini adalah cabangnya
        System.out.println("Masukkan nilai cabang a = ");
        a = input.nextInt();
        if(a >= 5 && a <= 10){
            System.out.println("ini adalah cabang");
        }else{
            System.out.println("ini bukan cabang");
        }
        
        System.out.println("selesai");
        
    }
}
