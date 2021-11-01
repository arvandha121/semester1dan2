package Praktikum2;
public class graphArray {
    final int vertices;
    final int[][] twoD_Array;
    
    graphArray(int v){
        vertices = v;
        twoD_Array = new int[vertices + 1][vertices + 1];
    }
    
    void makeEdge(int to, int from, int edge){
        try{
            twoD_Array[to][from] = edge;
        }
        catch(ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
    }
    
    int getEdge(int to, int from){
        try{
            return twoD_Array[to][from];
        }
        catch(ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }
}
