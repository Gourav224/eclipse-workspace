import java.util.*;
public class Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//by using BFS
class detectcycle1 {
    // Function to detect cycle in an undirected graph.
    boolean bfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vs){
        vs[node]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(node,-1));
        while(!q.isEmpty()){
            node=q.peek().first;
            int par=q.peek().second;
            q.remove();
            for(int a:adj.get(node)){
                if(!vs[a]){
                    q.add(new Pair(a,node));
                    vs[a]=true;
                }
                else if(par!=a){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vs=new boolean[V];
        for(int i=0;i<V;i++){
            if(vs[i]==false){
                if(bfs(i,adj,vs)){
                    return true;
                }
            }
        }
        return false;
    }
}class Pair {
    int first;
    int second; 
    public Pair(int first, int second) {
        this.first = first; 
        this.second = second; 
    }
}
// using dfs
class detectcycle2 {
    private static boolean dfs(int node,int parent,ArrayList<ArrayList<Integer>> adj,boolean[] vs){
        vs[node]=true;
        for(int a:adj.get(node)){
            if(!vs[a]){
                if(dfs(a, node, adj, vs)){
                    return true;
                }
            }
            else if(a!=parent){
                return true;
            }
        }
        return false;
    }
    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] vs=new boolean[n+1];
        for (int node = 1; node <= n; node++) {
            if (!vs[node] && dfs(node, -1, adj, vs)) {
                return "Yes";
            }
        }
        return "No";
        
    }
    
}
//Detect cycle in a directed graph  using dfs

class Detect_cycle {
    
	 private boolean cyclic(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis,boolean[] dfsvs){
	    vis[node]=true;
	    dfsvs[node]=true;
	    for(int i:adj.get(node)){
	      if(!vis[i]){
	        if(cyclic(i, adj, vis, dfsvs))return true;
	      }
	      else if(dfsvs[i]){
	        return true;
	      }
	    }
	    dfsvs[node]=false;
	    return false;
	  }
	    // Function to detect cycle in a directed graph.
	    public boolean isCyclic(int n, ArrayList<ArrayList<Integer>> adj) {
	        // code here
	        boolean[] vis=new boolean[n];
	        boolean[] dfsvs=new boolean[n];
	        for(int i=0;i<n;i++){
	          if(!vis[i]){
	            if(cyclic(i, adj, vis, dfsvs)){
	              return true;
	            }
	          }
	        }
	        return false;
	    }
	}