import java.util.*;
public class toposort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*Complete the function below*/


class toposortdfs
{
    //Function to return list containing vertices in Topological order. 
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis,Stack<Integer> stk){
        vis[node]=true;
        for(int i:adj.get(node)){
            if(!vis[i])
                dfs(i,adj,vis,stk);
        }
        stk.push(node);
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer> stk=new Stack<>();
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i])
                dfs(i,adj,vis,stk);
        }
        int i=0;
        int[] res=new int[V];
        while(!stk.isEmpty()){
            res[i++]=stk.pop();
        }
        return res;
    }
    //using bfs
    static int[] topoSortBFS(int V, ArrayList<ArrayList<Integer>> adj) {
        int indegree[] = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<Integer>();
        ;
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int topo[] = new int[V];
        int i = 0;
        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            topo[i++] = node;
            // node is in your topo sort
            // so please remove it from the indegree

            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }

        return topo;
    }
}