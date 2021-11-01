package Minggu5;

public class Faktorial {
    
    public int nilai;
    
    public int faktorialBF(int n){
        int fakto = 1;
        int i = 1;
        while(i<=n){
            fakto = fakto * i;
            i++;
        }
//        for (int i = 1; i <= n; i++) {
//            fakto = fakto * i;
//        }
        return fakto;
    }
    
    int faktorialDC(int n){
        if(n==1){
            return 1;
        }
        else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
    
    static void sisaWaktuBF(){
        long x = 0;
        x = System.currentTimeMillis();
        System.out.println("Current Time in Milliseconds (x) = "+System.currentTimeMillis());
        
        long y = 0;
        y = System.currentTimeMillis();
        System.out.println("Current Time in Milliseconds (y) = "+System.currentTimeMillis());
        long sisaWaktu = y-x;
        
        System.out.println("Sisa Waktu Brute Force = "+sisaWaktu);
    }
    
    static void sisaWaktuDC(){
        long a = 0;
        a = System.currentTimeMillis();
        System.out.println("Current Time in Milliseconds (a) = "+System.currentTimeMillis());
        
        long b = 0;
        b = System.currentTimeMillis();
        System.out.println("Current Time in Milliseconds (b) = "+System.currentTimeMillis());
        long sisa = b-a;
        System.out.println("Sisa Waktu Divide Conquer = "+sisa);
    }
    
}
