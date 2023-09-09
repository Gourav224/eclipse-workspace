
//Buy and Sell Stock – II 
/*
 * You are given an integer array prices where prices[i] 
		is the price of a given stock on the ith day.
	On each day, you may decide to buy and/or sell the 
	stock. You can only hold at most one share of the
	stock at any time. However, you can buy it then 
	immediately sell it on the same day.
	Find and return the maximum profit you can achieve.
*/
public class dp36 {
	 public static long getMaximumProfit (int n, long[] a) {
	        // Your code goes here.
	        long[][] dp=new long[n+1][2];
	        for(int i=n-1;i>=0;i--){
	            for(int buy=1;buy>=0;buy--){
	                    
	                if(buy==1){
	                    dp[i][buy]=Math.max(dp[i+1][0]-a[i], dp[i+1][buy]);
	                }
	                else{
	                    dp[i][buy]=Math.max(dp[i+1][buy], dp[i+1][1]+a[i]);
	                }
	            }
	        }
	        return dp[0][1];
	    }
	    static long f(int i,int buy,long[] a,long[][] dp){
	        if(i==a.length){
	            return 0;
	        }
	        if(dp[i][buy]!=0){
	            return dp[i][buy];
	        }
	        if(buy==1){
	            dp[i][buy]=Math.max(f(i+1, 0, a, dp)-a[i], f(i+1, buy, a, dp));
	        }
	        else{
	            dp[i][buy]=Math.max(f(i+1, buy, a, dp), f(i+1, 1, a, dp)+a[i]);
	        }
	        return dp[i][buy];
	    }
	    public static void main(String args[]) {
	    	 int n =6;
	    	long Arr[] = {7,1,5,3,6,4};

	  	  System.out.println("The maximum profit by selling the stock is "+getMaximumProfit(n,Arr));
	  	  
	  	 
	  	}

}