package Tugas2;
public class Graph {
    int vertex, jenis;
    LinkedList list[];

    public Graph(int vertex, int jenis) {
        this.vertex = vertex;
        this.jenis = jenis;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }   
    }
    public boolean graphType(){
        //data boolean dari graphType di return jenis = 1 maka akan dianggap true dengan if
        //dan jika bukan jenis = 1, maka akan memilih else
        return jenis == 1;
    }
    
    public void addEdge(int source, int destination){
        if (graphType()) {
            //add edge
            list[source].addFirst(destination);
        } else {
            //add edge (for undirected)
            list[source].addFirst(destination);
        
            //add back edge (for undirected)
            list[destination].addFirst(source);
        }
    }
    
    public void degree(int source) throws Exception{
        if (graphType()) {
            //degree directed graph
            //in degree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j)==source) {
                        ++totalIn;
                    }
                }
                //outdegree
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari vertex "+source+" : "+totalIn);
            System.out.println("Outdegree dari vertex "+source+" : "+totalOut);
            System.out.println("degree vertex "+source+" : "+(totalIn+totalOut));
        } else {
            //degree undirected graph
            System.out.println("degree vertex "+source+" : "+list[source].size());
        }      
    }
    //digunakan untuk removeEdge dengan menggunakan source<to> until desctination <from>
    public void removeEdge(int source, int destination) throws Exception{
        if (graphType()) {
            for (int i = 0; i < vertex; i++) {
                if (i==destination) {
                    list[source].remove(destination);
                }
            }
        } else {
            for (int i = 0; i < vertex; i++) {
                if (i==destination) {
                    list[source].remove(destination);
                    list[destination].remove(source);
                }
            }
        }        
    }    
    //digunakan untuk menampilkan semua data dengan method printGraph()
    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size()>0) {
                System.out.print("Vertex "+i+" terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j)+" ");
                }
                System.out.println("");
            } 
    
        }
    }
}
