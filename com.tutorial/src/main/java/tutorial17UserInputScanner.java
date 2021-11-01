import java.util.Scanner;

public class tutorial17UserInputScanner {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        //Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar
        int panjang, lebar, luas;
        System.out.println("MENGHITUNG LUAS");
        System.out.println("panjang\t\t= ");
        panjang = sc.nextInt();
        System.out.println("lebar\t\t= ");
        lebar = sc.nextInt();
        
        luas = (int)(panjang + lebar);
        System.out.println("luas\t\t= "+luas);
         
    }
}
