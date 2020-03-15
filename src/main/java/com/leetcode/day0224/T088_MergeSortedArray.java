package com.leetcode.day0224;

public class T088_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null || n <= 0) {
            return;
        }
        int index = m + n - 1;
        int r1 = m - 1;
        int r2 = n - 1;
        while (r1 >= 0 || r2 >= 0) {
            if (r1 < 0) {
                nums1[index--] = nums2[r2--];
            } else if (r2 < 0) {
                nums1[index--] = nums1[r1--];
            } else if (nums1[r1] >= nums2[r2]) {
                nums1[index--] = nums1[r1--];
            } else {
                nums1[index--] = nums2[r2--];
            }
        }
        return;
    }
}
