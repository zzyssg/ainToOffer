package com.leetcode.day0309;

public class T62 {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0) {
                    dp[j] = dp[j - 1];
                } else if (i != 0 && j == 0) {
                    dp[j] = dp[j];
                } else if (i != 0 && j != 0) {
                    dp[j] = dp[j - 1] + dp[j];
                } else {
                    dp[j] = 1;
                }
            }
        }
        return dp[n - 1];
    }
}
