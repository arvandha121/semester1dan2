package Tugas1;
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        bt.rek(6);
        bt.rek(4);
        bt.rek(8);
        bt.rek(3);
        bt.rek(5);
        bt.rek(7);
        bt.rek(9);
        bt.rek(10);
        bt.rek(15);
        
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("Find : "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}
