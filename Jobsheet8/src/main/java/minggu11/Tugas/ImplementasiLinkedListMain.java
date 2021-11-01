package minggu11.Tugas;
public class ImplementasiLinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList1 singLL = new SingleLinkedList1();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
        
        singLL.insertBefore(999, 100);
        singLL.print();

        System.out.println("Data pada index ke-1 = "+singLL.getData(1));
        System.out.println("Data 3 berada pada index ke-"+singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print(); singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
        
    }
}