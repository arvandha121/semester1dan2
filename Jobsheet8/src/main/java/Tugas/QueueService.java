package Tugas;
public class QueueService {
    
    int max, size, front, rear;
    int[] Q;
    
    QueueService(int n){
        max = n;
        Create();
    }
    
    void Create(){
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }
    
    boolean IsEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    
    boolean IsFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }
    
    void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan : "+Q[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while(i != rear){
                System.out.print(Q[i]+" ");
                i = (i+1) % max;
            }
            System.out.println(Q[i]+" ");
            System.out.println("Jumlah elemen = "+size);
        }
    }
    
    void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    void Enqueue(int data){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if(rear == max-1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }
    
    int Dequeue(){
        int data = 0;
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            data = Q[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if(front == max-1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
    
    void peekPosition(int position){
        if (!IsEmpty()) {
            for (int i = front; i < max; i++) {
                if (Q[i]==position) {
                    System.out.println("Data "+position+" berada pada index ke-"+i); 
                }
            }
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    void peekAt(int index){
        if(!IsEmpty()){
            for (int i = front; i < max; i++) {
                if(i == index){
                    System.out.println("Data pada index "+i+" yaitu : "+Q[i]);
                }
            }
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
}
