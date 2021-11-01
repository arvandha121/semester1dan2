package minggu11.Tugas2;
public class SingleLinkedList {
    
    Node head; //pss awal linked list
    Node tail; //pss akhir linked list
 
    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi dari linked list :\t");
            while (tmp != null) { 
                System.out.print(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
 
    void addFirst(char input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head; //head ditaruh setelah inputan 
            head = ndInput; // head diubah mjd inputan
        }
    }
 
    void addLast(char input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput; //inputan ditaruh setelah tail
            tail = ndInput; //tail dipindah ke inputan
        }
    }
 
    void insertAfter(char key, char input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do { 
            if (temp.data == key) {
                ndInput.next = temp.next; //data setelah key ditaruh setelah inputan
                temp.next = ndInput; //inputan ditaruh setelah key
                if (ndInput.next==null) { //kondisi jika diinput after tail
                    tail= ndInput;
                    break;
                }
            }
            temp = temp.next;
        }
        while (temp!=null);
    } 
    void insertBefore(char key, char input){
        Node ndInput = new Node(input, null);
        Node prev = null;
        Node curr = head;
        while (curr!=null) { 
            if (curr.data == key) {
                if (curr == head) {
                    ndInput.next = head;
                    head = ndInput;
                }else{
                    prev.next = ndInput;
                    ndInput.next = curr;
                }
            return;
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
    }
 
    void insertAt(int index, char input){
        if(index <0){
            System.out.println("Index salah");
        }else if(index==0){
            addFirst(input);
        } else {
            Node temp = head; //traverse dimulai dari head
            
            for (int i = 0; i < index-1; i++) { //mencari next dari input, karena itu index -1
                temp = temp.next; //mengubah temp supaya berjalan }
                temp.next = new Node(input, temp.next);
                if (temp.next.next==null) { 
                    tail = temp.next; 
                }
            }
        }
   }

    
}
