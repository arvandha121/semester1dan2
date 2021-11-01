import java.util.Scanner;
import org.apache.log4j.Logger;
public class Programhitung {
    private static final Logger logger = Logger.getLogger(Programhitung.class);
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n,x;
        int i;
        
        System.out.print("masukkan nilai: ");
        System.out.println("");
        n = sc.nextInt();
        
        for (i=1; i<=n ;i++){
            x=(i*6)-3;
            System.out.printf("%d ",x);
        }
        
    }
}
