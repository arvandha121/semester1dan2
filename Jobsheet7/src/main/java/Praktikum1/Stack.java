package Praktikum1;
public class Stack {
    
    int size, top, data[];
    
    public Stack(int size){
        this.size = size;
        data = new int[size];
        top = -1;
    }
    
    boolean IsEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    
    boolean IsFull(){
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }
    
    void push(int dt){
        if(!IsFull()){
            top++;
            data[top] = dt;
        }else{
            System.out.println("Isi stack penuh");
        }
    }
    
    void pop(){
        if(!IsEmpty()){
            int x = data[top];
            top--;
            System.out.println("Data yang keluar: "+x);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    
    void peek(){
        System.out.println("Elemen teratas: "+data[top]);
    }
    
    void print(){
        System.out.println("Isi Stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]+" ");
        }
        System.out.println("");
    }
    
    void clear(){
        if(!IsEmpty()){
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
