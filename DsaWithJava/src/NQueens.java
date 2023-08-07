import java.util.*;
public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Sol1 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        dfs(0,board,ans,n);
        return ans;
    }
    void dfs(int col,char[][] board,List<List<String>> ans,int n){
        if(col==n){
            ans.add(construct(board,n));
            return ;
        }
        for(int i=0;i<n;i++){
            if(valid(i,col,board,n)){
                board[i][col]='Q';
                dfs(col+1,board,ans,n);
                board[i][col]='.';
            }
        }
    }
    boolean valid(int row,int col,char[][] board,int n){
        int i=row;
        int j=col;
        while(j>=0 && i>=0){
            if(board[i--][j--]=='Q') return false;
        }
        i=row;
        j=col;
        while(j>=0){
            if(board[i][j--]=='Q') return false;
        }
        i=row;
        j=col;
        while(j>=0 && i<n){
            if(board[i++][j--]=='Q') return false;
        }
        return true;
    }
    List<String> construct(char[][] board,int n){
        List<String> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=new String(board[i]);
            ans.add(s);
        }
        return ans;
    }
}
//using hashing
class Sol2{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = 0;
        ArrayList < ArrayList < Integer >> res = new ArrayList < > ();
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];
        solve(0, board, res, leftRow, lowerDiagonal, upperDiagonal,n);
        return res;
    }
    static void solve(int col,int[][] board,ArrayList < ArrayList < Integer >> res,int[] leftrow,int[] ld,int[] ud,int n ){
        if(col==n){
            res.add(construct(board,n));
            return ;
        }
        for(int i=0;i<n;i++){
            if(leftrow[i]==0 && ld[i+col]==0 && ud[n-1+col-i]==0){
                leftrow[i]=1;
                ld[i+col]=1;
                ud[n-1+col-i]=1;
                board[i][col]=1;
                solve(col+1, board, res, leftrow, ld, ud,n);
                leftrow[i]=0;
                ld[i+col]=0;
                ud[n-1+col-i]=0;
                board[i][col]=0;
                
            }
        }
        
    }
    static ArrayList<Integer> construct(int[][] board,int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[j][i]==1){
                    ans.add(j+1);
                    break;
                }
            }
        }
        return ans;
    }
}