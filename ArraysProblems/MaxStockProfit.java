package ArraysProblems;

/*
	You are given an array of prices where prices[i] 
	is the price of a given stock on an ith day.

	You want to maximize your profit by choosing a single day to buy one stock 
	and choosing a different day in the future to sell that stock. 
	Return the maximum profit you can achieve from this transaction. 
	If you cannot achieve any profit, return 0.
*/

public class MaxStockProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,1,5,3,6,4};
		
		int maxProfit = Integer.MIN_VALUE;
		int minvalue = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < minvalue)
				minvalue = arr[i];
			maxProfit = Math.max(maxProfit, arr[i] - minvalue);
		}
		System.out.println("Max Profit : "+maxProfit);
	}

}
