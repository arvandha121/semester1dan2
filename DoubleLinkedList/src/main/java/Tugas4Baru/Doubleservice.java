package Tugas4Baru;
public class Doubleservice {
    
    Node head;
    int size;
    
    Doubleservice(){
        head = null;
        size = 0;
    }
    
    boolean isEmpty(){
        return head == null;
    }
    
    void addFirst(int nim, String nama, double ipk)throws Exception{
        if(isEmpty()){
            head = new Node(null, nim, nama, ipk, null);
        }else{
            Node newNode = new Node(null, nim, nama, ipk, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    void addLast(int nim, String nama, double ipk)throws Exception{
        if(isEmpty()){
            addFirst(nim, nama, ipk);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, nim, nama, ipk, null);
            current.next = newNode;
            size++;
        }
    }
    
    void add(int nim, String nama, double ipk, int index)throws Exception{
        if(isEmpty()){
            addFirst(nim,nama,ipk);
        }else if(index < 0 || index > size){
            throw new Exception("Nilai index diluar batas");
        }else{
            Node current = head;
            int i = 0;
            while(i<index){
                current = current.next;
                i++;
            }if(current.prev == null){
                Node newNode = new Node(null, nim,nama,ipk, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(current.prev, nim,nama,ipk, current);
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
            System.out.println("Data telah terhapus");
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
                System.out.println("Data indeks ke-"+a+" : ");
                System.out.println("nim \t: "+tmp.nim);
                System.out.println("nama\t: "+tmp.nama);
                System.out.println("ipk \t: "+tmp.ipk);
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
    
    public void seqSearch(int nimdata){
        int idx = -1;
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.nim == nimdata) {
                idx = i;
            } else {
                current = current.next;
            }
        }
        if (idx != -1) {
            System.out.println("Data "+nimdata+" indeks ke-"+idx);
            System.out.println("NIM: "+current.nim); 
            System.out.println("Nama: "+current.nama);
            System.out.println("IPK: "+current.ipk);
        } else {
            System.out.println("Data yang anda cari tidak ditemukan");
        }
    }
    
    //bubblesort
    public void sortList() {  
        Node current = null, index = null;  
        double temp;  
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
                    if(current.ipk < index.ipk) {  
                        temp = current.ipk;  
                        current.ipk = index.ipk;  
                        index.ipk = temp;
                    }
                }  
            }  
        }  
    }
    
}
