package Tugas1;
import java.util.*;
public class main {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan banyak graph :");
        int vertex = sc.nextInt();
        
        Graph graph = new Graph(vertex);
        
        for (int i = 0; i < vertex; i++) {
            System.out.println("data ke-"+i+"");
            System.out.println("Masukkan source : ");
            int source = sc.nextInt();
            System.out.println("Masukkan desctination : ");
            int desct = sc.nextInt();
            graph.addEdge(source, desct);
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
