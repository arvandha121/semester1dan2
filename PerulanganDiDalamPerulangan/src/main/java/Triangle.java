import java.util.*;
public class Triangle {
    public static void main(String args[]){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nilai N = \n");
        int N = sc.nextInt();
        int i = 0;
        while(i<=N){
            int j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            i++;
        }
        
    }
}
