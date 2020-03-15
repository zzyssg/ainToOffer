package com.leetcode.day0309;

public class T64 {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length,n = grid[0].length;
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0) {
                    dp[j] = dp[j - 1];
                } else if (i != 0 && j == 0) {
                    dp[j] = dp[j];
                } else if (i != 0 && j != 0) {
                    dp[j] = Math.min(dp[j - 1], dp[j]);
                } else {
                    dp[j] = 0;
                }
                dp[j] = dp[j] + grid[i][j];
            }
        }
        return dp[n - 1];
    }
}
