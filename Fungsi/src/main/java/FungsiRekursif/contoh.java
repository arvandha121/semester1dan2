package FungsiRekursif;
import java.util.*;
public class contoh {
    public static void main(String[] args) {
        tampilDeret(5);
    }
    static void tampilDeret(int x){
        if(x>0){
            System.out.print(x+" ");
            tampilDeret(x-2);
        }
        else{
            System.out.println();
        }
    }
}
