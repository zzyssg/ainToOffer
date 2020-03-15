package com.sort;

public class ShellSort {
    public void shellSort(int[] nums) {
        int h = 1;
        while (h < nums.length / 3) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < nums.length; i++) {
                for (int j = i; j >= h && nums[j] < nums[j - h]; j -= h) {
                    swap(nums, j - h, j);
                }
            }
            h /= 3;

        }

    }

    private void swap(int[] nums, int j, int i) {
        int t = nums[j];
        nums[j] = nums[i];
        nums[i] = t;
    }
}
