package minggu11.Tugas3;
import java.util.*;
public class SLLMain {
    
    static void data(){
        Scanner sc = new Scanner(System.in);
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst("Bahasa");
        list.addFirst("Android");
        list.addFirst("Komputer");
        list.addFirst("Basis Data");
        list.addFirst("Matematika");
        list.addFirst("Algoritma");
        list.addFirst("Statistika");
        
        list.print();
        
        System.out.println("Menampilkan data teratas : ");
        list.peek();
        System.out.println("");
        
        System.out.println("Menambah data dari index tertentu");
        System.out.println("tambah : ");
        String tambah = sc.nextLine();
        System.out.println("index : ");
        int index = sc.nextInt();
        list.insertAt(index, tambah);
        list.print();
        
        System.out.println("Menghapus semua data");
        list.clear();
        
    }
    
    public static void main(String[] args) {
        data();
    }
}
