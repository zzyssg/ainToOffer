package com.leetcode.day0229;

import java.util.Arrays;

public class T343_IntegerBreak {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1);
//        dp[2] = 1; // 和为2 时产生的最大积
        for (int i = 2; i <= n ; i++) {
            //和为 i时
            for (int j = 1; j <= i - 1 ; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];

    }
}
