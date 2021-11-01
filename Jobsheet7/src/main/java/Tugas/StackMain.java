package Tugas;
import java.util.*;
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Stack stk = new Stack(24);
//        System.out.println("Masukkan kalimat : Politeknik Negeri Malang");
//        
//        stk.push('P');stk.push('o');stk.push('l');stk.push('i');stk.push('t');
//        stk.push('e');stk.push('k');stk.push('n');stk.push('i');
//        stk.push('k');stk.push(' ');stk.push('N');stk.push('e');stk.push('g');
//        stk.push('e');stk.push('r');stk.push('i');stk.push(' ');stk.push('M');
//        stk.push('a');stk.push('l');stk.push('a');stk.push('n');stk.push('g');
//        
//        stk.print();

        Stack temp;
        String kalimat;
        char c;
        char pilih;
        do{
            System.out.println("Masukkan Kalimat : ");
            kalimat = sc.nextLine();
            
            int total = kalimat.length();
            temp = new Stack(total);
            
            for (int i = 0; i < total; i++) {
                c = kalimat.charAt(i);
                temp.push(c);
            }
            
            temp.print();
            System.out.println("Apakah anda ingin mengulang? : ");
            pilih = sc.next().charAt(0);
        }
        while(pilih == 'Y' || pilih == 'y');
    }
}
