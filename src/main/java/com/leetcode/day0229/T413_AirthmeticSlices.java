package com.leetcode.day0229;

public class T413_AirthmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int[] dp = new int[A.length];//以i结尾的自增子区间的个数
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        int count = 0;
        for (int num : dp) {
            count += num;
        }
        return count;

    }
}
