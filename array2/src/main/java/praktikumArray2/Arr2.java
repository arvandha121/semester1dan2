package praktikumArray2;

import java.util.*;
import java.util.Arrays;
public class Arr2 {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int[]nilai[] = new int[2][4];
        nilai[0][0] = 12;
        nilai[0][1] = 14;
        nilai[0][2] = 39;
        nilai[0][3] = 42;
        nilai[1][0] = 30;
        nilai[1][1] = 21;
        nilai[1][2] = 67;
        nilai[1][3] = 53;
        
        for(int i=0; i<nilai.length; i++){
            //int j=0;
            //while(j<nilai[0].length){
                //j++;
            for(int j=0; j<nilai[0].length; j++){
                System.out.println(nilai[i][j]+" ");
            //}
            //System.out.println();
        }
        //for(int array1D[] : nilai){
           // for(int j : array1D){
            //System.out.print(j+" ");
            //}
        }
        System.out.println("");
    }
}
