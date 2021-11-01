import java.util.*;
import java.util.Arrays;
public class Tutorial40PengenalanArray {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int[]arr = {1,2,3,4};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        
        System.out.println("Deklarasi Array");
        float[]arrFloat = new float[5];
        
        arrFloat[2] = 11.5f;
        
        System.out.println(arrFloat[0]);
        System.out.println(arrFloat[1]);
        System.out.println(arrFloat[2]);
        System.out.println(arrFloat[3]);
        System.out.println(arrFloat[4]);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrFloat));
    }
}
