package Tugas4;
public class DoubleService {
    
    Node head;
    int size;
    
    boolean isEmpty(){
        return head == null;
    }
    
    void addFirst(mahasiswa data){
        if(isEmpty()){
            head = new Node(null, data,null);
        }else{
            Node temp = new Node(null, data, head);
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    
    void addLast(mahasiswa data){
        if(isEmpty()){
            head = new Node(null, data, null);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node nn = new Node(current, data, null);
            current.next = nn;
            size++;
        }
    }
    
    void add(mahasiswa item, int index)throws Exception{
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
    
    int size(){
        return size;
    }
    
    void print(){
        if(!isEmpty()){
            Node tmp = head;
            int a = 0;
            while(tmp != null){
                System.out.println("   |nim\t|nama\t|ipk\t|");
                System.out.println(a+". |"+tmp.data.nim+"\t|"+tmp.data.nama+"\t|"+tmp.data.ipk+"\t|");
                tmp.printmahasiswa();
                System.out.println("-----------------------------");
                tmp = tmp.next;
                a++;
            }
            size++;
            System.out.println("Sisa Antrian : "+(size-1));
            System.out.println("\nBerhasil diisi");
            size--;
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    
    void seqSearch(int nims){
        int idx = -1;
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.data.nim == nims) {
                idx = i;
            } else {
                current = current.next;
            }
        }
        if (idx != -1) {
            System.out.println("Data "+nims+" berada di node ke-"+idx);
            current.printmahasiswa();
        } else {
            System.out.println("Data yang anda cari tidak ditemukan");
        }
    }

    Node sortList(){
        int swapped;
        Node p1;
        Node p2 = null;
        if (head == null){
            return null;
        }
        do{
            swapped = 0;
            p1 = head;
            while (p1.next != p2){
                if (p1.data.ipk < p1.next.data.ipk){
                    mahasiswa t = p1.data;
                    p1.data = p1.next.data;
                    p1.next.data = t;
                    swapped = 1;
                }
                p1 = p1.next;
            }
            p2 = p1;
        }
        while (swapped != 0);
        return head; 
    }

}
