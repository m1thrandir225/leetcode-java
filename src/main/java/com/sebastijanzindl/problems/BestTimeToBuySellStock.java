package com.sebastijanzindl.problems;

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int left = 0, sell = 1, max_profit = 0;

        while(sell < prices.length) {
            if (prices[left] < prices[sell]) {
                int profit = prices[sell] - prices[left];
                max_profit = Math.max(max_profit, profit);
            } else {
                left = sell;
            }
            sell++;
        }
        return max_profit;

    }
}
