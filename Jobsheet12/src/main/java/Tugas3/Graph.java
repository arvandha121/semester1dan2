package Tugas3;
public class Graph {
    int vertex;
    boolean graphType;
    LinkedList list[];

    public Graph(int vertex, boolean graphType){
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for(int i=0;i < vertex ; i++){
            list[i] = new LinkedList();
        }
    }
    public void addEdge(int source, int destination){
        if(graphType(graphType)){
            //add edge
            list[source].addFirst(destination);
        }else{
            //add back edge (for undirected)
            list[source].addFirst(destination);
            list[destination].addFirst(source);
        }
    }
    public void degree(int source) throws Exception{
        if(graphType(graphType)){
            //degree undirected graph
            System.out.println("degree vertex"+source+" : "+list[source].size());

            //degree directed graph
                //inDegree
            int k,totalIn = 0, totalOut = 0;
            for(int i=0;i < vertex;i++){
            for(int j=0;j < list[i].size();j++){
                if(list[i].get(j)==source)
                    ++totalIn;    
            }
            for(k=0;k< list[source].size();k++){
                list[source].get(k);
            }
            totalOut = k;
            }
            System.out.println("Indegree dari vertex "+source+" : "+totalIn);
            System.out.println("Outdegree dari vertex "+source+" : "+totalOut);
            System.out.println("degree vertex "+source+" : "+(totalIn+totalOut));
    } else {
        System.out.println("degree vertex "+source+" : "+list[source].size());
        }
    }
    public void removeEdge (int source, int destination) throws Exception{
        for(int i=0; i < list[source].size() ; i++){
            if(destination==list[source].get(i)){
                list[source].remove(i);
            }
        }
    }
    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();    
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph() throws Exception{
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
    boolean graphType(boolean pilih){
        return pilih;
    }
}
