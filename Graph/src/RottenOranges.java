import java.util.*;

public class RottenOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[][]={ {2,1,1} , {1,1,0} , {0,1,1} };
	        int rotting = orangesRotting(arr);
	        System.out.println("Minimum Number of Minutes Required "+rotting);

	}
	 public static int orangesRotting(int[][] grid) {
	        int n=grid.length;
	        int m=grid[0].length;
	        int count=0;
	        Queue<val> q=new LinkedList<>();
	        int[][] vis=new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                if(grid[i][j]==2){
	                    q.add(new val(i,j,0));
	                    vis[i][j]=2;
	                }
	                else{
	                    vis[i][j]=0;
	                }
	                if(grid[i][j]==1){
	                    count++;
	                }
	            }
	        }
	        int[] dr={1,0,-1,0};
	        int[] dc={0,1,0,-1};
	        int time=0;
	        while(!q.isEmpty()){
	            int row=q.peek().row;
	            int col=q.peek().col;
	            int tm=q.peek().time;
	            q.poll();
	            time=Math.max(time,tm);
	            for(int i=0;i<4;i++){
	                int nrow=row+dr[i];
	                int ncol=col+dc[i];
	                if(nrow>-1 && ncol<m && nrow<n && ncol>-1 && grid[nrow][ncol]==1 && vis[nrow][ncol]!=2){
	                    vis[nrow][ncol]=2;
	                    q.add(new val(nrow,ncol,tm+1));
	                    count--;
	                }
	            }
	        }
	        if(count==0){
	            return time;
	        }
	        return -1;
	    }
}
class val{
    int row;
    int col;
    int time;
    val(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}