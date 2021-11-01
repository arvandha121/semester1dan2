package Praktikum;
public class Graph {
    int vertex;
    LinkedList list[];
    
    Graph(int vertex){
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }
    
    void addEdge(int source, int desctination){
        //add edge
        list[source].addFirst(desctination);
        
        //add back edge (for undirected)
        list[desctination].addFirst(source);
    }
    
    void degree(int source)throws Exception{
        //degree undirected graph
        System.out.println("degree vertex "+source+" : "+list[source].size());
        
        //degree directed graph
        //inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) {
                    ++totalIn;
                }
            }
            //outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex "+source+" : "+totalIn);
        System.out.println("Outdegree dari vertex "+source+" : "+totalOut);
        System.out.println("degree vertex "+source+" : "+(totalIn + totalOut));
    }
    
    public void removeEdge (int source, int destination) throws Exception{
        for(int i=0; i < vertex ; i++){
            if(i==destination){
                list[source].remove(destination);
            }
        }
    }
    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();    
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    void printGraph() throws Exception{
        for(int i=0;i<vertex;i++){
            if(list[i].size()>0){
                System.out.print("vertex "+ i +" terhubung dengan: ");
                for (int j=0;j < list[i].size(); j++){
                    System.out.print(list[i].get(j)+ " ");
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
}
