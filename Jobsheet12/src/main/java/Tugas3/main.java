package Tugas3;
import java.util.*;
public class main {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int count = 0,to, from, pilih;
        boolean jenis;
        int ulang = 0;
        do{
            System.out.println("=================");
            System.out.println("  Pilih graph");
            System.out.println("=================");
            System.out.println("1. Directed");
            System.out.println("2. Undirected");
            System.out.println("0. Keluar!");
            System.out.println("-----------------");
            System.out.println("Pilih : ");
            pilih = sc.nextInt();
            if(pilih == 1){
                System.out.println("-----------------");
                System.out.println("Menggunakan Directed");
                jenis = true;
                System.out.println("");
                Graph graph = new Graph(6,jenis);
                System.out.println("Masukan jumlah inputan lintasan :");
                int jumlah = sc.nextInt();
                System.out.println("---------------------------------");
                System.out.println("Masukan edges :");
                while (count < jumlah){
                    System.out.println("data ke-"+count+" : ");
                    to = sc.nextInt();
                    from = sc.nextInt();
                    graph.addEdge(to, from);
                    count++;
                }
                System.out.println("");
                graph.printGraph();
                graph.degree(2);
                System.out.println("Masukkan source remove : ");
                int sr = sc.nextInt();
                System.out.println("Masukkan desctination remove : ");
                int dr = sc.nextInt();
                graph.removeEdge(sr, dr);
                graph.printGraph();
            } else if(pilih == 2){
                System.out.println("-----------------");
                System.out.println("Menggunakan Undirected");
                jenis = false;
                System.out.println("");
                Graph graph = new Graph(6,jenis);
                System.out.println("Masukan jumlah inputan lintasan :");
                int jumlah = sc.nextInt();
                System.out.println("---------------------------------");
                System.out.println("Masukan edges :");
                while (count <= jumlah){
                    to = sc.nextInt();
                    from = sc.nextInt();
                    graph.addEdge(to, from);
                    count++;
                }
                System.out.println("");
                graph.printGraph();
                graph.degree(2);
                System.out.println("Masukkan source remove : ");
                int sr = sc.nextInt();
                System.out.println("Masukkan desctination remove : ");
                int dr = sc.nextInt();
                graph.removeEdge(sr, dr);
                graph.printGraph();
            }else{
                System.out.println("Anda telah keluar!");
                break;
            }
        }while(ulang != 0 || ulang < 3);
//        
//        System.out.println("");
//        Graph graph = new Graph(6,jenis);
//        System.out.println("Masukan jumlah inputan lintasan :");
//        int jumlah = sc.nextInt();
//        System.out.println("---------------------------------");
//        System.out.println("Masukan edges :");
//        while (count <= jumlah){
//            to = sc.nextInt();
//            from = sc.nextInt();
//            graph.addEdge(to, from);
//            count++;
//        }
//        System.out.println("");
//        graph.printGraph();
//        graph.degree(2);
//        System.out.println("Masukkan source remove : ");
//        int sr = sc.nextInt();
//        System.out.println("Masukkan desctination remove : ");
//        int dr = sc.nextInt();
//        graph.removeEdge(sr, dr);
//        graph.printGraph();
//        graph.removeEdge(1, 2);
//        graph.printGraph();
    
    }
}
