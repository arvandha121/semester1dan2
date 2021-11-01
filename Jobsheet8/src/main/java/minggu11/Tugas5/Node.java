package minggu11.Tugas5;
public class Node {
    
    Nasabah data;
    Node next;
    
    Node(Nasabah dat, Node lanjut){
        this.data = dat;
        this.next = lanjut;
    }
    
    void printNasabah(){
        System.out.println("Nama \t\t:"+data.nama);
        System.out.println("Alamat \t\t:"+data.alamat);
        System.out.println("No Rekening \t:"+data.nomor);
    }
    
}
