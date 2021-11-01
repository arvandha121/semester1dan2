package Quiz2Semester2;
public class NodeService {
        
    Node head; //pss awal linked list
    Node tail; //pss akhir linked list
    boolean isEmpty(){
        return head == null;
    }
    
    void addFirst(Kendaraan input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head; //head ditaruh setelah inputan 
            head = ndInput; // head diubah mjd inputan
        }
    }
 
    void addLast(Kendaraan input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput; //inputan ditaruh setelah tail
            tail = ndInput; //tail dipindah ke inputan
        }
    }
    
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List masih,kosong tidak dapat dihapus!");
        } else if(head == tail){
            head = tail = null;
        } else {
            System.out.println("yang selesai mengantri SPBU ");
            head.printKendaraan();
            head = head.next;
        }
    }
    
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked List masih,kosong tidak dapat dihapus!");
        } else if(head == tail){
            head = tail = null;
        } else {
            System.out.println("yang selesai mengantri SPBU ");
            tail.printKendaraan();
            tail = tail.next;
        }
    }

    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            int a = 0;
            while (tmp != null) { 
                System.out.println("---------------");
                System.out.println("indeks ke-"+a);
                System.out.println("---------------");
                System.out.println(tmp.data+"\t");
                tmp.printKendaraan();
                tmp = tmp.next;
                a++;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    
    void peek(){
        Node tmp = head;
        tmp.printKendaraan();
        System.out.println("Data yang berada pada posisi teratas adalah "+head.data);
    }
    
    void getData(int index){
        Node tmp = head;
        for(int i = 1;i < index;i++){
            tmp = tmp.next;
        } 
        tmp.printKendaraan();
    }
    
}
