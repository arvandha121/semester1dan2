package Tugas2;
public class DoubleService {
    
    Node head;
    int size;
    
    DoubleService(){
        head = null;
        size = 0;
    }
    
    boolean isEmpty(){
        return head == null;
    }
    
    void addFirst(String item){
        if(isEmpty()){
            head = new Node(null, item, null);
        }else{
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    void addLast(String item){
        if(isEmpty()){
            addFirst(item);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode1 = new Node(current, item, null);
            current.next = newNode1;
            size++;
        }
    }
    
    void removeFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, Tidak dapat dihapus");
        }else if(size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    void removeLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Nilai Index diluar batas");
        }else if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    void peek(){
        Node tmp = head;
        System.out.println("Data yang berada pada posisi teratas adalah "+head.data);
    }
    
    void print(){
        if(!isEmpty()){
            Node tmp = head;
            int a = 0;
            while(tmp != null){
                System.out.println((a+1)+". "+tmp.data);
                tmp = tmp.next;
                a++;
            }
            size++;
            System.out.println("\nBerhasil diisi");
        }else{
            System.out.println("Linked List Kosong");
        }
    }    
}
