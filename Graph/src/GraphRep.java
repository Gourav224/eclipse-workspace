import java.util.*;

public class GraphRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listmethod l=new listmethod();
		l.input();
		l.print();
		l.bfs();

	}

}
class MatrixMethod{
	int V,E;
	int[][] adjc;
	Scanner sc=new Scanner(System.in);
	void adjcencyList() {
		V=sc.nextInt();
		E=sc.nextInt();
		adjc=new int[V+1][V+1];
		for(int i=0;i<E;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			adjc[u][v]=1;
			adjc[u][v]=1;
		}
	}
}
class listmethod extends MatrixMethod{
	ArrayList<ArrayList<Integer>> a = new ArrayList<>();

	void input() {
		V=sc.nextInt();
		E=sc.nextInt();
		 for(int i=0;i<=V;i++) {
			 a.add(i,new ArrayList<>());
		 }
		for(int i=0;i<E;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			a.get(u).add(v);
			a.get(v).add(u);
			
		}
	}
	void print() {
		for(int i=1;i<=V;i++) {
			System.out.print(i);
			for(Integer p:a.get(i)) {
				System.out.print("--->"+p);
			}
			System.out.println();
			}
	}
	void bfs() {
		ArrayList<Integer> bfs=dfsOfGraph(V, a);
		System.out.println("Bfs of graph");
		for(Integer I:bfs) {
			System.out.print(I+ " ");
		}
	}
	ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean[] visit=new boolean[V+1];
        q.add(1);
        visit[1]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            for(Integer it:adj.get(node)){
                if(visit[it]==false){
                    visit[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
	private void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vs,ArrayList<Integer> ls){
        vs[node]=true;
        ls.add(node);
        for(Integer it:adj.get(node)){
            if(!vs[it]){
                dfs(it,adj,vs,ls);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ls=new ArrayList<>();
        boolean[] vs=new boolean[V+1];
        dfs(1,adj,vs,ls);
        return ls;
    }
	
}