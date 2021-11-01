package Tugas;
public class NodeService {
    Node head;
    int size;
    
    NodeService(){
        head = null;
        size = 0;
    }
    
    boolean isEmpty(){
        return head == null;
    }
    
    void addFirst(int item){
        if(isEmpty()){
            head = new Node(null, item, null);
        }else{
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    void addLast(int item){
        if(isEmpty()){
            addFirst(item);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    
    void add(int item, int index)throws Exception{
        if(isEmpty()){
            addFirst(item);
        }else if(index < 0 || index > size){
            throw new Exception("Nilai index diluar batas");
        }else{
            Node current = head;
            int i = 0;
            while(i<index){
                current = current.next;
                i++;
            }if(current.prev == null){
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    void print(){
        if(!isEmpty()){
            Node tmp = head;
            int a = 0;
            while(tmp != null){
                System.out.println("data ke-"+a+" : "+tmp.data);
                tmp = tmp.next;
                a++;
            }
            System.out.println("\nBerhasil diisi");
        }else{
            System.out.println("Linked List Kosong");
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
    
    void remove(int index)throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks diluar batas");
        }else if(index == 0){
            removeFirst();
        }else{
            Node current = head;
            int i = 0;
            while(i<index){
                current = current.next;
                i++;
            }if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }
    
    public void searchNode(int value) {  
        int i = 0;  
        boolean a = false;  
        //Node current will point to head  
        Node current = head;  
  
        //Checks whether the list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Compare value to be searched with each node in the list  
            if(current.data == value) {  
                a = true;  
                break;  
            }  
            current = current.next;  
            i++;  
        }if(a){ 
             System.out.println("Node pada list muncul pada indeks : " + i);  
        }else { 
             System.out.println("Node tidak tersedia di list"); 
        } 
    }  
    
    public void sortList(){
        Node current = null, index = null;  
        int temp;  
        //mengecek dimana data tersebut isEmpty
        if(head == null) {  
            return;  
        }  
        else {
            //Current menjadi point dari head
            for(current = head; current.next != null; current = current.next) {  
                //Index menjadi point dari node next ke current  
                for(index = current.next; index != null; index = index.next) {  
                    //If current's data kurang dari indexs data, akan menjadi desc  
                    if(current.data < index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                }  
            }  
        }  
    }
   
}
