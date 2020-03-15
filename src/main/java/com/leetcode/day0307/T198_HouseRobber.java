package com.leetcode.day0307;

public class T198_HouseRobber {
    public int rob(int[] nums) {
        if (nums == null ||nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length + 1];
        dp[1] = nums[0];
        for (int i = 2; i < nums.length + 1; i++) {
            //当抢第i家的时候，分两种情况：
            //1、抢劫第i-1家 dp[i - 2] + nums[i - 1]
            //2、没有抢第i-1家 dp[i - 2] + nums[i - 1]
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }
        return dp[nums.length];

    }
}
