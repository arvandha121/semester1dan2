package Tugas4;
import java.util.*;
public class main {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Masukkan banyak graph :");
        int vertex = sc.nextInt();
        
        Graph<Integer> graph = new Graph<Integer>(vertex);
        
        for (int i = 0; i < vertex; i++) {
            System.out.println("data ke-"+i+"");
            System.out.println("Masukkan source : ");
            String source = sc1.nextLine();
            System.out.println("Masukkan Index source : ");
            int index1 = sc.nextInt();
            System.out.println("Masukkan desctination : ");
            String desct = sc1.nextLine();
            System.out.println("Masukkan index desctination : ");
            int index2 = sc.nextInt();
            graph.addEdge(index1, index2, source, desct);
        }
        graph.printGraph();
        graph.degree(2);
        
        System.out.println("Masukkan source remove : ");
        int sr = sc.nextInt();
        System.out.println("Masukkan desctination remove : ");
        int dr = sc.nextInt();
        graph.removeEdge(sr, dr);
        graph.printGraph();
    }
}
