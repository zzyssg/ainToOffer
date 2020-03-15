package com.leetcode.day0301;

public class T494_TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        return dfs(nums,S,0);
    }

    private int dfs(int[] nums, int Sum, int start) {
        if (start == nums.length) {
            return Sum == 0 ? 1 : 0;
        }
        return dfs(nums, Sum + nums[start], start + 1) +
                dfs(nums, Sum - nums[start], start + 1);

    }
}
