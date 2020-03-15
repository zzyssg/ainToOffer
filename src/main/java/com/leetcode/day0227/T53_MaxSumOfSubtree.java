package com.leetcode.day0227;

public class T53_MaxSumOfSubtree {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];
        int res = curSum;
        for (int i = 1; i < nums.length; i++) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            res = Math.max(curSum,res);

        }
        return res;

    }
}
