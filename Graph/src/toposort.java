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
}