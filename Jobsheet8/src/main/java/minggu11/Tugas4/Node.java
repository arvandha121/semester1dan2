package minggu11.Tugas4;
public class Node {
    
    Nasabah data;
    Node next;
    
    public Node(Nasabah data, Node berikutnya) {
        this.data = data;
        this.next = berikutnya;
    }
 
    void printNasabah(){ 
        System.out.println("Nama \t\t:"+data.nama);
        System.out.println("Alamat \t\t:"+data.alamat);
        System.out.println("No Rekening \t:"+data.nomor);
    }
}
