package Quiz2Semester2;
public class Node {
    
    Kendaraan data;
    Node next;
    
    Node(Kendaraan dat, Node lanjut){
        this.data = dat;
        this.next = lanjut;
    }
    
    void printKendaraan(){
        System.out.println("Nama Pengguna  \t: "+data.nama);
        System.out.println("Nomer Kendaraan\t: "+data.NoKendaraan);
        System.out.println("Tipe Kendaraan \t: "+data.Tipe);
        System.out.println("Tahun Kendaraan\t: "+data.tahun);
        System.out.println("Merk Kendaraan (Matic/Manual) : "+data.Merk);
    }
    
}
