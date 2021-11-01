import java.util.*;
public class tutorial29ForLoop {
    public static void main(String args[]){
        
        int a;
        boolean kondisi = true;
        
        System.out.println("awal kondisi\n");
        System.out.println("lloop pertama");
        for(a=0; a<=10; a++){
            System.out.println("for loop ke-"+a);
        }
        System.out.println("loop kedua");
        for(a=0; a<10; a++){
            System.out.println("for loop ke-"+a);
        }
        System.out.println("loop ketiga");
        for(a=11; a>=0; a--){
            a--;
            System.out.println("for loop ke-"+a);
        }
        System.out.println("loop keempat");
        int nilai = 0;
        for(; nilai!=10;){
            nilai++;
            System.out.println("for loop ke-"+nilai);
        }
    }
}
