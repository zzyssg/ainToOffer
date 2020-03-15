package com.leetcode.day0307;

public class T213_HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        if (len == 1) return nums[0];
        return Math.max(rob(nums, 0, len - 2), rob(nums, 1, len - 1));
    }

    private int rob(int[] nums, int i, int j) {
        int pre2 = 0, pre1 = 0;
        for (int k = i; k <= j; k++) {
            int cur = Math.max(pre1, pre2 + nums[k]);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
}
