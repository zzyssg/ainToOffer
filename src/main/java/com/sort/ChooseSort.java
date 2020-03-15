package com.sort;

public class ChooseSort {
    public void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j] < nums[min]) {
                    swap(nums, i, j);
                }
            }

        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;


    }
}
