package Tugas2;
public class Node {
    String data;
    Node prev, next;

    Node(Node prev, String data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
