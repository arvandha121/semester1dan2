package minggu11.Tugas4;
import java.util.*;
public class SingleLinkedList {
    
    Node head; //pss awal linked list
    Node tail; //pss akhir linked list
 
    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) { 
                System.out.println(tmp.data+"\t");
                tmp.printNasabah();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
 
    void addFirst(Nasabah input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head; //head ditaruh setelah inputan 
            head = ndInput; // head diubah mjd inputan
        }
    }
 
    void addLast(Nasabah input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput; //inputan ditaruh setelah tail
            tail = ndInput; //tail dipindah ke inputan
        }
    }

    void peek(){
        Node tmp = head;
        tmp.printNasabah();
        System.out.println("Data yang berada pada posisi teratas adalah "+head.data);
    }

    void clear(){
        head = tail = null;
        System.out.println("Linked List telah dikosongkan");
    }

    Nasabah getData(int index){
        Node tmp = head;
        for (int i = -1; i < index; i++) {
            System.out.println("indeks ke-"+(i+1));
            tmp.printNasabah();
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
}
