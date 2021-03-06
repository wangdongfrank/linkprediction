package teamwork.linkpred_matrix;

public class MatrixGraph {
	Edge [][] adjMatrix; // adjacency matrix
        int n;                  // number of nodes

    public MatrixGraph(int n) {
        this.n = n;
        this.adjMatrix = new Edge[n][n];
         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                adjMatrix[i][j] = null;
            }
        }
    }
    
    public void addEdge(int from, int to){
        adjMatrix[from][to] = new Edge(); 
        adjMatrix[to][from] = new Edge();
    }
    
    public void addEdge(int from, int to, double [] features){
        adjMatrix[from][to] = new Edge(features);
    }   
    
    public double sumWeights(int index){
        double sum = 0;
        for(int i = 0; i < n; i++){
                if(adjMatrix[i][index] != null)
                    sum += adjMatrix[i][index].weight;
        }
        return sum;
    }
        

}
