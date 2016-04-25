/**
* Say you have an array for which the ith element is the price of a given stock on day i.
* If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
**/

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int result = 0;
        int currentMin = prices[0];
        for(int i =0;i<prices.length;i++){
            currentMin = prices[i] > currentMin ?currentMin : prices[i];
            result = result > (prices[i]-currentMin) ? result : (prices[i]-currentMin);
        }
        return result;
    }
}