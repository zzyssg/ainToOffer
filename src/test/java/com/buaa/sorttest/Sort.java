package com.buaa.sorttest;

public abstract class Sort {
    abstract void sort(int[] nums);

    void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
