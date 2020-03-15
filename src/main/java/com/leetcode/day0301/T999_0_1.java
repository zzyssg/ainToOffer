package com.leetcode.day0301;

public class T999_0_1 {
    public int backpack(int W,int[] weights,int[] values) {
        int N = weights.length;
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 1; i <= N; i++) {
            int w = weights[i];
            int v = values[i];
            for (int j = 1; j <= W ; j++) {
                if (w > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    //此件物品重量较小
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w] + v);
                }

            }
        }
        return dp[N][W];
    }
    public int backpackII(int W,int[] weights,int[] values) {
        int N = weights.length;
        int[] dp = new int[W + 1];
        for (int i = 1; i <= N; i++) {
            int w = weights[i];
            int v = values[i];
            for (int j = W; j >= 1; j--) {
                if (j >= w) {
                    dp[j] = Math.max(dp[j - w] + v, dp[j]);
                }
            }
        }
        return dp[W];
    }
}
