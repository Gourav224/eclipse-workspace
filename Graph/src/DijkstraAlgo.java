import java.util.*;

public class DijkstraAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Dijkstrashortestpath{
	static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int[] dis = new int[V];
        Arrays.fill(dis, Integer.MAX_VALUE);
        
        PriorityQueue<Pairnode> q = new PriorityQueue<>((x, y) -> x.distance - y.distance);
        q.add(new Pairnode(S, 0));
        dis[S] = 0;
        
        while (!q.isEmpty()) {
            int currentDistance = q.peek().distance;
            int node = q.peek().node;
            q.remove();
            
            for (int i = 0; i < adj.get(node).size(); i++) {
                int edgeweight = adj.get(node).get(i).get(1);
                int adjnode = adj.get(node).get(i).get(0);
                
                if (edgeweight + currentDistance < dis[adjnode]) {
                    dis[adjnode] = edgeweight + currentDistance;
                    q.add(new Pairnode(adjnode, dis[adjnode]));
                }
            }
        }
        
        return dis;
    }
}

class Pairnode {
    int node;
    int distance;
    
    public Pairnode(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}
//when adjlist not given
class Dijkstrashortestpath1{

	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here
		ArrayList<ArrayList<Pairnode>> adj=new ArrayList<>();
		for(int i=0;i<N;i++){
		    adj.add(new ArrayList<>());
		}
		for(int i=0;i<M;i++){
		    adj.get(edges[i][0]).add(new Pairnode(edges[i][1],edges[i][2]));
		}
		int[] dis=new int[N];
		for(int i=0;i<N;i++){
		    dis[i]=Integer.MAX_VALUE;
		}
		PriorityQueue<Pairnode> q=new PriorityQueue<>((x,y)->x.distance-y.distance);
		dis[0]=0;
		q.add(new Pairnode(0,0));
		while(!q.isEmpty()){
		    int node=q.peek().node;
		    int distance=q.peek().distance;
		    q.remove();
		    for(Pairnode i:adj.get(node)){
		        int edgew=i.distance;
		        int adjnode=i.node;
		        if(edgew+distance<dis[adjnode]){
		            q.add(new Pairnode(adjnode,edgew+distance));
		            dis[adjnode]=edgew+distance;
		        }
		    }
		}
		for(int i=0;i<N;i++){
		    if(dis[i]==Integer.MAX_VALUE){
		        dis[i]=-1;
		    }
		}
		return dis;
	}
}
//print shortest path in graph
class Solution {
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {
        // code here
        ArrayList<ArrayList<Pairnode>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new  ArrayList<>());
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(new Pairnode(edges[i][1],edges[i][2]));
            adj.get(edges[i][1]).add(new Pairnode(edges[i][0],edges[i][2]));
        }
        int[] dis=new int[n+1];
        int[] par=new int[n+1];
        for(int i=0;i<=n;i++){
            dis[i]=(int)1e8;
            par[i]=i;
        }
        PriorityQueue<Pairnode> q=new PriorityQueue<>((x,y)->x.distance-y.distance);
        q.add(new Pairnode(1,0));
        dis[1]=0;
        while(!q.isEmpty()){
        	Pairnode p=q.poll();
            int node=p.node;
            int dist=p.distance;
            for(Pairnode i:adj.get(node)){
                int ed=i.node;
                int wt=i.distance;
                if(dist+wt<dis[ed]){
                    dis[ed]=dist+wt;
                    q.add(new Pairnode(ed,dis[ed]));
                    par[ed]=node;
                }
            }
        }
        
        List<Integer> ans=new ArrayList<>();
        if(dis[n]==1e8){
            ans.add(-1);
            return ans;
        }
        int node=n;
        while(par[node]!=node){
            ans.add(node);
            node=par[node];
        }
        ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}

