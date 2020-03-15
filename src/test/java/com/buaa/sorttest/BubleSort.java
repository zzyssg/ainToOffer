package com.buaa.sorttest;

public class BubleSort extends Sort{


    @Override
    void sort(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j - 1, j);
                }
            }

        }
    }

}
