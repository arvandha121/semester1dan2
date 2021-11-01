import java.util.*;
public class tutorial24TenaryOperator {
    public static void main(String Args[]){
        
        //Ternary Operator
        //Variabel x = ekspresi ? statement_true : statement_false
        
        int input, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        input = sc.nextInt();
        System.out.println(input);
        
        //cariabel x = ekkspresi ? statement_true : statement_false
        
        x = (input == 10) ? (input*input) : (input/2);
        System.out.println("hasilnya "+x);
        
        if (input==10){
            x = input*input;
        }else{
            x = input/2;
        }
        System.out.println("hasil "+x);
    }
}
