import java.util.*;
public class tutorial45ArrayMultiDimensi {
    public static void main(String[] args) {
        System.out.println("Belajar Array multi dimensi");
        
        //cara membuat array 2 dimensi
        
        int[]arr[] = {{1,2},{3,4}};
        
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
        
        //cara membuat array 2 dimensi dengan deklarasi
        int[]arr2[] = new int[5][4];
        for(int i=0; i<arr2.length; i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
        
        //menggunakan array looping secara manual
        
        for(int i=0; i<arr2.length; i++){
            System.out.print("[");
            for(int j=0; j<arr2[0].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("]");
        }
        
        //looping dengan for each
        
        for(int[]baris : arr2){
            for(int angka : baris){
                System.out.print(angka+" ");
            }
            System.out.println("");
        }
        
        //contoh
        
        int[]arr2d[] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
        for(int[]array : arr2d){
            for(int hasil : array){
                System.out.print(hasil+" ");
            }
            System.out.println("");
        }
    }

    private static void printArray2D(int[][] arr2d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
