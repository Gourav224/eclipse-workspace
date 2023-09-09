//Buy and Sell Stock – III 
class Dp37{
	public static int maxProfit(int []a) {
        // Write your code here.
        int n=a.length;
        int[][] dp=new int[2][3];
        int[][] cur=new int[2][3];
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<2;buy++){
                for(int cap=1;cap<3;cap++){
                    if(buy==1){
                        cur[buy][cap]=Math.max(dp[0][cap]-a[i], dp[buy][cap]);
                    }
                    else{
                        cur[buy][cap]=Math.max(dp[buy][cap], dp[1][cap-1]+a[i]);
                    }
                }
            }
            dp=cur;
        }
        return dp[1][2];
    }
    static int f(int i,int buy,int cap,int[] a,int[][][] dp){
        if(i==a.length || cap==0){
            return 0;
        }
        if(dp[i][buy][cap]!=0){
            return dp[i][buy][cap];
        }
        if(buy==1){
            dp[i][buy][cap]=Math.max(f(i+1, 0, cap,a, dp)-a[i], f(i+1, buy,cap, a, dp));
        }
        else{
            dp[i][buy][cap]=Math.max(f(i+1, buy, cap,a, dp), f(i+1, 1,cap-1, a, dp)+a[i]);
        }
        return dp[i][buy][cap];
    }
    public static void main(String[] args) {
		int a[]= {3,3,5,0,0,3,1,4};
		System.out.print("The maximum profit by selling the stock is "+maxProfit(a));
	}

}
