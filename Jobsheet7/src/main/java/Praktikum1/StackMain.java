package Praktikum1;
import java.util.*;
public class StackMain {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        stk.push(15);
        stk.push(27);
        stk.push(13);
        stk.print();
        
        stk.push(11);
        stk.push(34);
        stk.pop();
        stk.peek();
        System.out.println("Stack yang akan ditambahkan adalah 50 dan 100");
        stk.push(50);
        stk.push(100);
        stk.peek();
        stk.print();
        stk.clear();
    }
    
}
