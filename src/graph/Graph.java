package graph;

public class Graph {
private int numv;
private int[][] matrix;
	public Graph(int v) {
		numv=v;
		matrix=new int[numv+1][numv+1];
	}
	public void addEdge(int u,int v,int cost) {
		matrix[u][v]=cost;
		matrix[v][u]=cost;
	}
	public int removeEdge(int u,int v) {
		int t=matrix[u][v];
		matrix[u][v]=matrix[v][u]=0;
		return t;
	}
	public int numEdge() {
		int c=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++)
				if(matrix[i][j]!=0)
					c++;
		}
		return c/2;
			
	}
	public boolean containsEdge(int u,int v) {
		return matrix[u][v]!=0;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
