package com.leetcode.day0304;

public class T283_MoveZero {
    public void moveZeroes(int[] nums) {
        int indx = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[indx++] = num;
            }
        }
        for (int i = indx; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
