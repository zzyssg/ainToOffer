package com.buaa.sorttest;

public class ShellSort extends Sort {

    @Override
    void sort(int[] nums) {
        int h = 1;
        while (h < nums.length / 3) {
            h = h * 3 + 1;
        }
        while (h != 0) {
            for (int i = h; i < nums.length; i += h) {
                for (int j = i; j >= h && nums[j] < nums[j - h]; j -= h) {
                    swap(nums, j, j - h);
                }
            }
            h /= 3;
        }
    }

}
