import java.util.Scanner;
public class tugas1{
    public static void main(String args[]){
        
        char operator;
        double angka1, angka2, hasil;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan pertama: ");
        angka1 = sc.nextDouble();
        
        System.out.println("Masukkan operator (+ - * /): ");
        operator = sc.next().charAt(0);
        
        System.out.println("Masukkan bilangan kedua: ");
        angka2 = sc.nextDouble();
        
        switch(operator){
            case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
            break;
            
            case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
            break;
            
            case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + " * " + angka2 + " = " + hasil);
            break;
            
            case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil);
            break;
            
            default:
                System.out.println("Operator yang Anda masukkan salah");
            }
    }
}