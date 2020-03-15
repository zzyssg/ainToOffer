package com.leetcode.day0225;

public class T122_MaxBenefitOfStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1;i < prices.length;i++) {
            if (prices[i - 1] <= prices[i]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
