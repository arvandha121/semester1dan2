package Praktikum3;
import java.util.*;
public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("==================================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================================");
        System.out.println("Data awal dari linked list adalah : "+dll.getFirst());
        System.out.println("Data akhir dari linked list adalah : "+dll.getLast());
        System.out.println("Data indeks ke-1 pada linked list adalah : "+dll.get(1));
    }
}
