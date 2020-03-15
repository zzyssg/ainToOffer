package com.leetcode.day0301;

import java.util.Arrays;

public class T416_PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = computeAarraySum(nums);
        if (sum % 2 != 0) {
            return false;
        }
        int m = nums.length;
        sum /= 2;
        boolean[][] dp = new boolean[m + 1][sum + 1];

        for (int j = 0; j <= sum; j++) {
            dp[0][j] = true;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= sum; j++) {
                int w = nums[i - 1];
                if (j >= w) {
                    dp[i][j] = dp[i - 1][j - w] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }

        }
        return dp[m][sum];
    }

    private int computeAarraySum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public boolean canPart(int[] nums) {
        int sum = computeAarraySum(nums);
        if (sum % 2 == 1) {
            return false;
        }
        sum /= 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int j = sum; j >= num; j--) {
                dp[j] = dp[j - num] || dp[j];
            }
        }
        return dp[sum];
    }
}
