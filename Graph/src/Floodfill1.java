public class Floodfill1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class FloodfillAlgo1 {
    private static void dfs(int[][] image,int[][] ans,int sr,int sc,int color,int p,int[] dr,int dc[]){
        ans[sr][sc]=p;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int row=sr+dr[i];
            int col=sc+dc[i];
            if(row<n && row>-1 && col>-1&& col<m&& image[row][col]==color && ans[row][col]!=p){
                dfs(image,ans,row,col,color,p,dr,dc);
            }
        }
    }
    public static int[][] floodFill(int[][] image, int n, int m, int x, int y, int p) {
        // Write your code here.
        int dr[]={0,1,-1,0};
        int dc[]={1,0,0,-1};
        int[][] ans=image;
        int color=image[x][y];
        dfs(image,ans,x,y,color,p,dr,dc);
        return ans;
    }
}