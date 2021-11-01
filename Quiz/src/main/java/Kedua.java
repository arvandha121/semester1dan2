import java.util.*;
public class Kedua{
    public static void main(String[] args) {
        for(int i=1; i<6; i++){
            for(int j=1; j<6; j++){
                System.out.print("");
            }
            for (int k=0; k<=i; k++){
                System.out.println("");
                for(int l=0; l<k; l++){
                    System.out.print(k);
                }
        }
        System.out.println("");
    }
}
}