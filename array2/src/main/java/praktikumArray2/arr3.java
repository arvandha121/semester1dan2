package praktikumArray2;

import java.util.*;
import java.util.Arrays;
public class arr3 {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int[]nilai[] = new int [4][3];
        
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.print("Masukkan nilai ke-["+i+"]["+j+"]");
                nilai[i][j] = input.nextInt();
            }
            System.out.println("-------------------------------------");
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.print(nilai[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}