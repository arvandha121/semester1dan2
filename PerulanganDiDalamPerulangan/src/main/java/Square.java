import java.util.*;
public class Square {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int N;
        
        System.out.println("Masukkan nilai N = ");
        N = sc.nextInt();
        
        for(int iOuter=1; iOuter<=N; iOuter++){
            for(int i=1; i<=N ;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}