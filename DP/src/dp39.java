//Buy and Sell Stocks With Cooldown
public class dp39 {
	static int stockProfit(int[] Arr)
	{  
	    
	    int n = Arr.length;
	    int dp[][]=new int[n+2][2];
	    
	    for(int ind = n-1; ind>=0; ind--){
	        for(int buy=0; buy<=1; buy++){
	            int profit=0;
	            
	            if(buy==0){// We can buy the stock
	                profit = Math.max(0+dp[ind+1][0], -Arr[ind] + dp[ind+1][1]);
	            }
	    
	            if(buy==1){// We can sell the stock
	                profit = Math.max(0+dp[ind+1][1], Arr[ind] + dp[ind+2][0]);
	            }
	            
	            dp[ind][buy] = profit;
	        }
	    }
	    
	    return dp[0][0];

	}

	public static void main(String args[]) {

	  int prices[]= {4,9,0,4,10};
	                                 
	  System.out.println("The maximum profit that can be generated is "+
	  stockProfit(prices));
	}
}
