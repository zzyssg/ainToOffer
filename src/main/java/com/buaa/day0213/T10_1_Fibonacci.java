package com.buaa.day0213;

public class T10_1_Fibonacci {
    public int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] =dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
