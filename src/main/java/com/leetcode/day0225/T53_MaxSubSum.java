package com.leetcode.day0225;

public class T53_MaxSubSum {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int preSum = nums[0];
        int curSum = preSum;
        for (int i = 1;i < nums.length;i++) {
            preSum = preSum > 0 ? preSum + nums[i] : nums[i];
            curSum = Math.max(curSum, preSum);
        }
        return curSum;

    }
}
