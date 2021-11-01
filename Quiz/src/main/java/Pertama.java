import java.util.*;
public class Pertama {
    public static void main(String[] args) {
        
        int i, j , k, N;
        System.out.println("Masukan nilai N : ");
        Scanner inputan = new Scanner(System.in);
        N = inputan.nextInt();
        for (i=0; i<=N; i++){
             for (j=1; j<=N-i; j++){
                 System.out.print("");
             }
             for (k=1; k<=i; k++){
                 System.out.print(k);
             }
             System.out.println();
         }
    }
}
