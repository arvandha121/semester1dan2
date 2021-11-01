import java.util.*;
import java.util.Arrays;
public class tutorial41LoopingArrayDenganForEach {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int[]arr = {11,12,13,14,15,16,17,18,19,20};
        
        for(int i=0; i<10; i++){
            System.out.println("index angka ke-"+i+" : "+arr[i]);
        }
        System.out.println(" ");
        for(int i=0; i<arr.length; i++){
            System.out.println("index angka ke-"+i+" : "+arr[i]);
        }
        
        for(int angka : arr){
            System.out.println("index angka ke: "+angka);
        }
        
    }
}