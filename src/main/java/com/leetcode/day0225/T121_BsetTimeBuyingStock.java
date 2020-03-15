package com.leetcode.day0225;


public class T121_BsetTimeBuyingStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        //维持一个最小的谷值和最大的利润
        int minPrice = prices[0];
        int maxPro = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else
                maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        Integer n = maxPro;
        n.equals(2);
        return maxPro;
    }
}
