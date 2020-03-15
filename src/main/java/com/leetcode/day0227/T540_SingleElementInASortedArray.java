package com.leetcode.day0227;

public class T540_SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = (h - l) / 2 + l;
            m = (m % 2 == 0) ? m : (m - 1);
            if (nums[m] == nums[m + 1]) {
                l = m + 2;
            } else {
                h = m;
            }
        }
        return nums[l];
    }
}
