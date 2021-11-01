import java.util.*;
public class tutorial25LatihanKalkulator {
    public static void main(String args[]){
        
        //a operator b
        Scanner sc = new Scanner(System.in);
        float a,b,hasil;
        char operator;
        
        System.out.println("nilai a = ");
        a = sc.nextFloat();
        System.out.println("operator = ");
        operator = sc.next().charAt(0);
        System.out.println("nilai b = ");
        b = sc.nextFloat();
        
        System.out.println("input user: "+a+" "+operator+" "+b);
        
        //operator tersedia + - * /
        
        if(operator == '+'){
            //penjumlahan
            hasil = a+b;
            System.out.println("hasil : "+hasil);
        }else if (operator == '-'){
            //pengurangan
            hasil = a-b;
            System.out.println("hasil : "+hasil);
        }else if (operator == '*'){
            //perkalian
            hasil = a*b;
            System.out.println("hasil : "+hasil);
        }else if (operator == '/'){
            //pembagian
            if(b == 0){
                System.out.println("pembagian nol menghasilkan tak hingga");
            }else{
            hasil = a/b;
                System.out.println("hasil : "+hasil);
            }
            
        }else{
            //operator tidak ditemukan
            System.out.println("oeprator tidak ditemukan");
        }
            
        
    }
}
