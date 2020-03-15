package com.leetcode.day0225;

public class T75_SortColors {
    public void sortColors(int[] nums) {
        int p0 = -1, p1 = 0, p2 = nums.length;
        //p1代表p1前面的数均为1，p2表示其后面的数均为2
        while (p1 < p2) {
            if (nums[p1] == 0) {
                swap(nums, ++p0, p1++);
            } else if (nums[p1] == 2) {
                swap(nums, --p2, p1);
            } else {
                p1++;
            }
        }


    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
