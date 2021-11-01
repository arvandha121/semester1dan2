package Tugas5;
public class BinaryTreeArray {
    int[] data;
    int idxLast;
    BinaryTreeArray(){
        data = new int[10];
    }
    void data(int[] data, int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    //menambah data
    void add(int adddata, int idx){
        data[idx] = adddata;
    }
    //pencarian dari kiri, tengah, kanan
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
    //pencarian dari tengah, kiri, kanan
    void traversePreOrder(int idxStart){
        if(idxStart <= idxLast){
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
        }
    }
    //pencarian dari kiri, kanan, tengah
    void traversePostOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
            System.out.print(data[idxStart]+" ");
        }
    }
}
