import java.util.*;

public class Dic {
	public static void main(String[] args) {
		
	}

}
class AlienLanguage {
    public static char[] getAlienLanguage(int n, String[] dict) {
        // Write your code here.
        int K=Integer.MAX_VALUE;;
        for(String s:dict){
            K=Math.min(K, s.length());
        }
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<K;i++) adj.add(new ArrayList<>());
        for(int i=1;i<dict.length;i++){
            String s1=dict[i-1];
            String s2=dict[i];
            for(int j=0;j<Math.min(s1.length(),s2.length());j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                    break;
                }
            }
        }
        char[] ans=new char[K];
        List<Integer> topo=topoSortBFS(K,adj);
        int l=0;
        for(int i:topo){
            ans[l++]=(char)(i+(int)('a'));
        }
        return ans;
    }
    private static List<Integer> topoSortBFS(int V, ArrayList<ArrayList<Integer>> adj) {
        int indegree[] = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            topo.add( node);
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

