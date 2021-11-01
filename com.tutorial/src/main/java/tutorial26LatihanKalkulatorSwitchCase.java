import java.util.*;
import org.apache.log4j.Logger;
public class tutorial26LatihanKalkulatorSwitchCase {
    private static final Logger logger = Logger.getLogger(tutorial26LatihanKalkulatorSwitchCase.class);
    public static void main(String args[]){
        
        float a,b;
        String operator;
        
        Scanner sc =new Scanner (System.in);
        System.out.println("nilai a = ");
        a = sc.nextFloat();
        System.out.println("nilai operator = ");
        operator = sc.next();
        System.out.println("nilai b = ");
        b = sc.nextFloat();
        
        switch(operator){
            case "+":
            //penjumlahan
            float hasil = a+b;
                System.out.println("hasil = "+hasil);
            break;
            case "-":
                //pengurangan
            hasil = a-b;
                System.out.println("hasil = "+hasil);
            break;
            case "*":
                //perkalian
            hasil = a*b;
                System.out.println("hasil = "+hasil);
            break;
            case "/":
                //pembagian
            hasil = a/b;
                System.out.println("hasil = "+hasil);
            break;
            default:
                System.out.println("operator"+operator+"tidak ditemukan");
        }
    }
}
