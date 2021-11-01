package Tugas;
public class Stack{
    
    char data[];
    int size;
    int top;
    
    Stack(int size){
        this.size = size;
        data = new char[size];
        top = -1;
    }
    
    boolean IsFull(){
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }
    
    void push(char dt){
        for (int i = 0; i < 10; i++) {
            
        }
        if(!IsFull()){
            top++;
            data[top] = dt;
        }else{
            System.out.println("Isi stack penuh");
        }
    }
    
    
    void print(){
        System.out.println("Hasil : ");
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i]+"");
        }
        System.out.println("");
    }
    
}
