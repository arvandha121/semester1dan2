package minggu11.Tugas3;
public class SingleLinkedList {
    Node head; //pss awal linked list
    Node tail; //pss akhir linked list
 
    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi dari linked list :");
            while (tmp != null) { 
                System.out.println(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
 
    void addFirst(String input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head; //head ditaruh setelah inputan 
            head = ndInput; // head diubah mjd inputan
        }
    }
 
    void insertAt(int index, String input){
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
    
    void peek(){
        System.out.println("Data yang berada pada posisi teratas adalah "+head.data);
    }

    void clear(){
        head = tail = null;
        System.out.println("Linked List telah dikosongkan");
    }
    
}
  
