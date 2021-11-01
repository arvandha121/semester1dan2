import java.util.*;
import java.util.Arrays;
public class tutorial42MengenalArrayLebihDalam {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int[]arr = {1,2,3,4,5};
        int[]arr2 = new int[5];
        
        arr2 = arr;
        System.out.println("Array1 --> "+Arrays.toString(arr));
        System.out.println("Array2 --> "+Arrays.toString(arr2));
        
        arr[0] = 100;
        arr[4] = 400;
        System.out.println("Array1 --> "+Arrays.toString(arr));
        System.out.println("Array2 --> "+Arrays.toString(arr2));
    }
}