package com.leetcode.day0227;

public class T34_SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int first = banarySearch(nums, target);
        int last = banarySearch(nums, target + 1) - 1;
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{first, last};


    }

    private int banarySearch(int[] nums, int target) {
        //target的左边界
        int l = 0, h = nums.length;
        while (l < h) {
            int mid = (h - l) / 2 + l;
            if (nums[mid] >= target) {
                h = mid;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }
}
