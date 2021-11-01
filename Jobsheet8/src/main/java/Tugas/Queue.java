package Tugas;
public class Queue {
    
    int max, front, rear, size;
    Mahasiswa[] antrian;
    
    public Queue(int n){
        max =n;
        Create();
    }
    
    public void Create(){
        antrian= new Mahasiswa[max];
        size=0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean IsFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }

    }
    
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan: "+ antrian[front].nim+" "+antrian[front].nama
            +" "+antrian[front].absen+" "+antrian[front].ipk);
        }else{
            System.out.println("Queue masih kosong ");
        }
    }
    
    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i=front;
            while(i != rear){
                System.out.println(antrian[i].nim+" "+antrian[i].nama+" "+antrian[i].absen
                +" "+antrian[i].ipk);
                i = (i+1)%max;
            }
            System.out.println(antrian[i]+" ");
            System.out.println("Jumlah elemen = "+ size);
        }
    }
    
    public void clear(){
        if(!IsEmpty()){
            front=rear=-1;
            size=0;
            System.out.println("Queue berhasil dikosongkan");
        }else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void Enqueue(Mahasiswa data){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if(IsEmpty()){
                front=rear=0;
            }else{
                if(rear==max-1){
                    rear=0;
                }else{
                rear++;
            }
        }
        antrian[rear]=data;
        size++;
        }
    }
    
    public Mahasiswa Dequeue(){
        Mahasiswa data = new Mahasiswa(" "," ",0,0);
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            data=antrian[front];
            size--;
            if(IsEmpty()){
                front=rear=-1;
            }else{
                if(front==max-1){
                    front=0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
    
    public void peekPosition(String nim) {
        if (!IsEmpty()) {
            int x = 0;
            for (int i = 0; i < size; i++) {
                String z = antrian[i].nim;
                if (z.equals(nim)) {
                    System.out.println("Mahasiswa dengan NIM " + nim + "berada posisi indeks ke- " + i);
                    x++;
                }
            }
            if (x == 0) {
                System.out.println("Mahasiswa dengan NIM " + nim + "tidak ditemukan ");
            } else {
                System.out.println("Queue masih kosong");
            }
        }
    }
    
    void peekAt(int position){
        if(!IsEmpty()){
            for (int i = front; i < max; i++) {
                if(i == position){
                    System.out.println("Data pada index "+i+" yaitu : "+antrian[i]);
                }
            }
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen belakang: "+ antrian[rear].nim+" "+antrian[rear].nama
            +" "+antrian[rear].absen+" "+antrian[rear].ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    public void printMahasiswa(int posisi){
        if (!IsEmpty()) {
            for (int i = front; i < max; i++) {
                if (i==posisi) {
                    System.out.println("Mahasiswa yang berada pada antrian ke-"+i+" adalah :");
                    System.out.println(antrian[i].nim+" "+antrian[i].nama+" "+antrian[i].absen+" "+antrian[i].ipk);
                }
            }
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    
}
