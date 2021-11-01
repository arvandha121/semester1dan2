package Tugas2;
public class LinkedList {
    
    int size;
    Node head;
    
    LinkedList(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
        
    public void remove(int data) throws Exception{
        if (data<0 || data>size) {
            throw new Exception("nilai indeks di luar batas");
        } else {
            Node current = head;
            for (int i = 0; i < data; i++) {
                current = current.next;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if(current.prev == null){
                current =current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    } 
   
    public int size(){
        return size;
    }
    
    public int get(int index){ //mencari data dg inputan index
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
