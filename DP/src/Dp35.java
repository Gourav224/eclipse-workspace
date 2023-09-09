//Buy and Sell Stock – I
/*	
 * You are given an array prices where prices[i] is the 
	price of a given stock on the ith day.
	You want to maximize your profit by choosing a single day
	to buy one stock and choosing a different day in the future
	to sell that stock.
	Return the maximum profit you can achieve from this 
	transaction. If you cannot achieve any profit, return 0.
*/

public class Dp35 {

	static int maximumProfit(int []Arr){
	    // Write your code here.
		int maxProfit = 0;
		int mini = Arr[0];
		
		for(int i=1;i<Arr.length;i++){
	        int curProfit = Arr[i] - mini;
	        maxProfit = Math.max(maxProfit,curProfit);
	        mini = Math.min(mini,Arr[i]);
	        }
		return maxProfit;
	}

	public static void main(String args[]) {

	  int[] Arr  ={7,1,5,3,6,4};

	  System.out.println("The maximum profit by selling the stock is "+
	  maximumProfit(Arr));
	}

}
