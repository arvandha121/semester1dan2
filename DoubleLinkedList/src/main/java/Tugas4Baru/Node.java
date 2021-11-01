package Tugas4Baru;
public class Node {
    int nim;
    String nama;
    double ipk;
    Node prev, next;
    Node(Node prev, int nim, String nama, double ipk, Node next) throws Exception{
        this.prev = prev;
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.next = next;
    }

    Node(Object object, int nim, String nama, double ipk, Object object0) {
        
    }
}
