package org.javaDSA.leetCode.DynamicProgramming;

public class MaxProfit {
    public static int maxProfit(int[] prices){
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }
    // Using recursion
    public static int maxProfitRecursion(int[] prices){
//        return maxProfitRecursionHelper(prices, 0, Integer.MAX_VALUE, 0);
        return maxProfitMemo( prices, 0, Integer.MAX_VALUE, 0, new Integer[prices.length][prices.length + 1]);
    }
    private static int maxProfitRecursionHelper(int[] prices, int index, int minPrice, int maxProfit) {
        if(index >= prices.length){
            return maxProfit;
        }
        if(prices[index] < minPrice){
            minPrice = prices[index];
        }else {
            maxProfit = Math.max(maxProfit, prices[index] -minPrice);
        }
        return maxProfitRecursionHelper(prices, index + 1, minPrice, maxProfit);
    }
    // Using recursion with memoization
    public static int maxProfitMemo(int[] prices, int index, int minPrice, int maxProfit, Integer[][] memo) {
        if (index >= prices.length) {
            return maxProfit;
        }
        if (memo[index][minPrice] != null) {
            return memo[index][minPrice];
        }
        if (prices[index] < minPrice) {
            minPrice = prices[index];
        } else {
            maxProfit = Math.max(maxProfit, prices[index] - minPrice);
        }
        memo[index][minPrice] = maxProfitMemo(prices, index + 1, minPrice, maxProfit, memo);
        return memo[index][minPrice];
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfitRecursion(prices)); // Output: 5
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices2)); // Output: 0
    }
}
