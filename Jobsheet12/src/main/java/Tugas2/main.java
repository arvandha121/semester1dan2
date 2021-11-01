package Tugas2;
import java.util.*;
public class main {
    static void menu(){
        System.out.println("==========================");
        System.out.println("     ~~pilih menu~~");
        System.out.println("==========================");
        System.out.println("1. directed");
        System.out.println("2. undirected");
        System.out.println("--------------------------");
        System.out.println("pilih : ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Lintasan : ");
        int lintasan = 
        Graph graph = new Graph(lintasan);
        menu();
        System.out.println("Masukkan Jumlah Vertex : ");
        
    }
}
