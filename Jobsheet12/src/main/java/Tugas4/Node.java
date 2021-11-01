package Tugas4;

public class Node{
    String data;
    Node prev;
    Node next;

    public Node(Node prev, String nilai, Node next){
        this.prev = prev;
        this.data = nilai;
        this.next = next;
    }
}
