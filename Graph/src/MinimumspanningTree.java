import java.util.*;
public class MinimumspanningTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int spanningTree(int n, int E, int edges[][]){
	    // Code Here.
	    ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
		for(int i=0;i<n;i++) adj.add(new ArrayList<>());
		for(int i=0;i<E;i++){
			int u=edges[i][0];
			int v=edges[i][1];
			int wt=edges[i][2];
			adj.get(u).add(new Pair(v,wt));
			adj.get(v).add(new Pair(u,wt));
		}
		boolean[] vs=new boolean[n];
		PriorityQueue<Pair> q=new  PriorityQueue<>((x,y)->x.second-y.second);
		q.add(new Pair(0,0));
		int sum=0;
		while(!q.isEmpty()){
			Pair p=q.poll();
			int node=p.first;
			int wt=p.second;
			if(vs[node]) continue;
			vs[node]=true;
			sum+=wt;
			for(Pair i:adj.get(node)){
				q.add(new Pair(i.first, i.second));
			}
		}
		return sum;
	}
}

