package com.arrays;

public class Test13 {
	public static int buySellStocks(int prices[]) {
		int buyPrices=Integer.MAX_VALUE;
		int maxProfit=0;
		for(int i=0;i<prices.length;i++) {
		if(buyPrices<prices[i]) {
			int profit=prices[i]-buyPrices;
			maxProfit=Math.max(maxProfit, profit);
		}else {
			buyPrices=prices[i];
		}
		}
		return maxProfit;
	}
	
	
	public static void main(String[]args) {
		int prices[]= {4,2,1,6,3,2,5};
		System.out.println(buySellStocks(prices));
		
	}

}
