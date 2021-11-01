import java.util.*;
public class tutorial31LatihanFibonanci {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        //menghitung nilai deret fibonacci ke-n
        int fn,fn1,fn2,n;
        
        System.out.println("mengambil nilai fibonacci ke-n: ");
        n = sc.nextInt();
        
        fn2 =0;
        fn1=1;
        fn = 1;
        
        for(int i=1; i<=n ;i++){
            System.out.println("nilai ke - "+i+" adalah "+fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            
        }
        
    }
}
