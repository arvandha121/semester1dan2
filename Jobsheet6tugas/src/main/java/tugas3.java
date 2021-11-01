import java.util.*;
public class tugas3 {
    public static void main(String Args[]){
        
        Scanner sc = new Scanner(System.in);
        int batas_angka, urutan1,i,a,b;
        int x,y = 0,total;
        batas_angka = 12;
        urutan1 = 0;
        a = 0;
        b = 1;
        
        System.out.println("====== Deret Fibonanci ======");
        for(i=1;i<=batas_angka ;i++){
            System.out.print(urutan1+ " " );
            urutan1 = a+b;
            b=a;
            a=urutan1;
        } 
        System.out.print("\n");;
        for(total=1,x=1,i=1,i=1;i<=11;i++){
            total = x+y;
            x = y;
            y = total;
            System.out.printf("Sum of : %d + %d = %d\n",x,y,total);
        }
    }
}
