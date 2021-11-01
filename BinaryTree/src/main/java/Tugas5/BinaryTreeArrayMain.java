package Tugas5;
import java.util.*;
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("data ke ["+(i+1)+"] : ");
            data[i] = sc.nextInt();
        }
        System.out.println("===========================");
        for (int i = 0; i < 10; i++) {
            System.out.println("data : "+data[i]);
        }
        System.out.println("Cari index : ");
        int idx = sc.nextInt();
        while(idx < data.length-1){
            idx = idx + 1;
            System.out.println("add data : ");
            int adddata = sc.nextInt();
            bta.data(data, idx);
            break;
        }
        bta.data(data, idx);
        System.out.println("--------------------------");
        System.out.println("TraversPreOrder : ");
        int trapre = sc.nextInt();
        bta.traversePreOrder(trapre);
        System.out.println("TraversPostOrder");
        int trapost = sc.nextInt();
        bta.traversePostOrder(trapost);
    }
}
