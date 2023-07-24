/*
 * Best Time to Buy and Sell Stock - LeetCode 121
You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example:

Input: prices = [7, 1, 5, 3, 6, 4] 
Output: 5 
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BestTimeToBuyAndSellStockI{

      public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        
        for(int i=0; i<prices.length; i++){
            min = Math.min(min,prices[i]);
            int profit = prices[i]-min;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;

        // two pointer approach
        // int buy=0,sell=1,maxProfit=0;
        // while(sell < prices.length){
        //     if(prices[buy] < prices[sell]){
        //         int profit = prices[sell]-prices[buy];
        //         maxProfit = Math.max(maxProfit, profit);
        //     }
        //     else
        //         buy=sell;
        //     sell++;
        // }
        // return maxProfit;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        System.out.println(maxProfit(arr));
         
    }
}