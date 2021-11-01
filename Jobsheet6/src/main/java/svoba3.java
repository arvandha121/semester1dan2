import java.util.Scanner;

public class svoba3 {
    public static void main(String args[]){
        
        int p,l,luas;
        Scanner input = new Scanner (System.in);
        System.out.println("PROGRAM MENGHITUNG LUAS PERSEGI PANJANG\n");
        do{
            
            System.out.println("Panjang [0=selesai]: ");
            p = input.nextInt();
            System.out.println("Lebar [0=selesai]: ");
            l=input.nextInt();
            luas = p*l;
            System.out.printf("Luas = %d x %d = %d\n\n",p,l,luas);
            
        }while((p!=0)&&(1!=0));
        System.out.println("==============================selesai=========================");
        
        
    }
}
