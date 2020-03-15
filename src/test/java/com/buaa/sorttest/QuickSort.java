package com.buaa.sorttest;

public class QuickSort extends Sort {
    @Override
    void sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);

    }

    private void quickSort(int[] nums, int i, int j) {
        if (j <= i) {
            return;
        }
        int p = partition(nums, i, j);
        quickSort(nums,i,p - 1);
        quickSort(nums,p + 1, j);
    }

    private int partition(int[] nums, int start, int end) {
        int i = start, j = end + 1;
        while (true) {
            while (++i <= end && nums[i] < nums[start]) ;
            while(--j >= start && nums[j] > nums[start]);
            if (j <= i) {
                break;
            }
            swap(nums, i, j);

        }
        swap(nums, start, j);
        return j;
    }

}
