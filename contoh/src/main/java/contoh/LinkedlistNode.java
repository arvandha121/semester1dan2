package contoh;
public class LinkedlistNode {
    
    int size;
    Node head, tail;
    
    //Digunakan untuk mengetahui linked dalam kondisi kosong.
    boolean isEmpty(){
        return size == 0;
    }
    //Untuk mencetak data seluruh node
    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
        }else {
            System.out.println("Linked list kosong");
        }
    }
    //Operasi untuk menambah node di awal elemen Linked Lists. 
    void addFirst(Node input){
        if(isEmpty()){
            head=input;
            tail=input;
        }else{
            input.next = head;
        }
    }
    //Operasi untuk menambah node di akhir elemen Linked Lists. 
    void addLast(Node input){ 
        if (isEmpty()){
            head = input;
            tail = input;
        }
        else{
            tail.next = input;
            tail = input;
        }
    }
    //insert after digunakan penambahan node setelah node yang memiliki data sama dengan key
    void insertAfter(int key,Node input){
        Node temp = head;
        do{
            if(temp.data == key) {
                input.next = temp.next;
                temp.next = input;
                System.out.println("Insert data is succeed");
            }
            temp = temp.next;
        }while (temp!=null);
    }
    //hapus node depan
    void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    //hapus node belakang
    void removeLast(){
        if(isEmpty()) System.out.println("Linked List masih Kosong!");
        else if(head==tail){
            head = tail = null;
        }
        else{
            Node current = head;
            while(current.next != tail){
            current = current.next;
        }
        current.next = null;
        tail=current;
        }
    }
    //Hapus node tertentu
    void remove(int key){
        if(isEmpty()) 
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        else{
            Node temp = head;
            while (temp != null){
                if ((temp.data == key)&&(temp == head)){
                    this.removeFirst();
                    break;
                }
                else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null) 
                    tail=temp;
                    break;
                }
                temp = temp.next;
            }
        }
    }
    //Pengaksesan data node: getData(int index)
    int gerData(int index){
        Node tmp = head;
        for (int i = 0; i < index; i++)
        tmp = tmp.next;
        return tmp.data;
    }
    //Operasi pencarian indeks data pada node : indexOf(key)
    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
            }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }
    //Method remove(int index)
    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
    
    
    
}
