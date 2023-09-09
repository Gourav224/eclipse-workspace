
//Buy and Sell Stock – IV 
/*
 * We are given an array Arr[] of length n. It represents the price of a stock on ‘n’ days. The following guidelines need to be followed:

We can buy and sell the stock any number of times.
In order to sell the stock, we need to first buy it on the same or any previous day.
We can’t buy a stock again after buying it once. In other words, we first buy a stock and then sell it. After selling we can buy and sell again. But we can’t sell before buying and can’t buy before selling any previously bought stock.
We can do at-most K transactions.*/
public class Dp38 {
	static int maximumProfit(int[] a, int n, int k)
    {
        int[][] dp=new int[2][k+1];
        int[][] cur=new int[2][k+1];
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<2;buy++){
                for(int cap=1;cap<=k;cap++){
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
        return dp[1][k];
   
    }
	public static void main(String[] args) {
		int[] a= {3,3,5,0,0,3,1,4};
		System.out.println(maximumProfit(a, a.length, 2));
	}
}
