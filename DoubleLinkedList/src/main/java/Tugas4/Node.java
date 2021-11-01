package Tugas4;
public class Node {
    mahasiswa data;
    Node prev, next;
    Node(Node prev, mahasiswa data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    void printmahasiswa(){
        System.out.println("nim \t: "+data.nim);
        System.out.println("nama\t: "+data.nama);
        System.out.println("ipk \t: "+data.ipk);
    }
}
