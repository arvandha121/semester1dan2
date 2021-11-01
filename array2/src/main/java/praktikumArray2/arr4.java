package praktikumArray2;

import java.util.*;
import java.util.Arrays;
public class arr4 {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris : ");
        int m = input.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int n = input.nextInt();
        System.out.println("======================================================");
        int [][]nilai = new int [m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.println("Masukkan angka array pada baris ke-"+i+" kolom ke-"+j+" : ");
                nilai[i][j] = input.nextInt(); 
            }
        }
        System.out.println("=======================================================");
    
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.println(nilai[i][j]+" Pada indeks["+i+"]{"+j+"}"); 
            }
            System.out.println();
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(nilai[i][j]%2==1 && !!(nilai [i][j]==7)){
                    System.out.println("angka ganjil"+nilai[i][j]+" Pada indeks["+i+"]"+"{"+j+"}"); 
                }
            }
            System.out.println();
        }
    }
}
