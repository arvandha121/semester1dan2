package minggu11.Tugas2;
public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst('A');
        singLL.print();
        singLL.addLast('B');
        singLL.print();
        singLL.insertAt(2, 'E');
        singLL.print();
        singLL.insertAfter('B','C');
        singLL.print();
        singLL.insertBefore('E', 'D');
        singLL.print();
    }
}
