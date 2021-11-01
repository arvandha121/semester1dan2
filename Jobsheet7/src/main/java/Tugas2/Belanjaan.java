package Tugas2;
public class Belanjaan {
    
    int size;
    int top;
    StrukBelanjaan data[];
    
    Belanjaan(int size) {
        this.size = size;
        data = new StrukBelanjaan[size];
        top = -1;
    }
    
    public boolean IsEmpty(){
        if (top == -1) {
            return true;
        } else {
            return  false;
        }
    }
    
    public boolean IsFull(){
        if (top == size-1) {
            return true;
        } else {
            return  false;
        }
    }
    
    public void push(StrukBelanjaan sb){
        if (!IsFull()) {
            top++;
            data[top] = sb;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    
    public void pop(){
        if (!IsEmpty()) {
            StrukBelanjaan x = data[top];
            top--;
            System.out.println("Data yang keluar: "+x.idStruk+" "+x.Tanggal+" "+x.namaBarang+" "+x.jmlh+" "+x.total);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas: "+data[top].idStruk+" "+data[top].Tanggal+" "+data[top].namaBarang+" "+data[top].jmlh+" "+data[top].total);
    }
    
    public void print(){
        System.out.println("Isi stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println("id struk     tanggal          nama barang      total     harga");
            System.out.println(data[i].idStruk+"         "+data[i].Tanggal+"       "+data[i].namaBarang+"            "+data[i].jmlh+"         "+data[i].total);
        }
        System.out.println();
    }
    
    public void clear(){
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack telah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
    
}
