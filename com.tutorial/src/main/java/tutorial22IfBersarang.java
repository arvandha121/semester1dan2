import java.util.Scanner;
import java.util.*;

public class tutorial22IfBersarang {
    public static void main(String args[]){
        
        // nested if atau if bersarang
        
        int a = 2;
        int b = 7;
        
        System.out.println("ini adalah awal dari program");
        if(a==5){
            if(b == 10){
                System.out.println("ini adalah dimana a = 5, b = 10");
            }else{
                System.out.println("ini adalah dimana a = 5 dan b bukan 10");
            }
        }else{
            System.out.println("ini adalah dimana a dan b salah");
        }
        
        System.out.println("ini adalah akhir program");
        
    }
}
