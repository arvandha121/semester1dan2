import java.util.Scanner;
public class tutorial27WhileLoop {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int a = 0;
        boolean kondisi = true;
        
        System.out.println("AWAL PROGRAM");
        
        while(kondisi){
            System.out.println("While loop ke"+a);
            if(a == 10){
                kondisi = false;
            }
            a++;
        }
        System.out.println("AKHIR PROGRAM");
    }
}
