package com.sort;


public class MergeSort {
    public int[] help;
    public void mergeSort(int[] nums) {
        help = new int[nums.length];
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int[] nums, int i, int j) {
        if (i >= j) {
            return;
        }
        int m = (j - i) / 2 + i;
        sort(nums, i, m);
        sort(nums, m + 1, j);
        merge(nums, i, m, j);

    }

    private void merge(int[] nums, int s, int m, int e) {
        for (int k = s; k <= e; k++) {
            help[k] = nums[k];
        }
        int i = s, j = m + 1;
        for (int k = s; k <= e; k++) {
            if (i > m) {
                nums[k] = help[j++];
            } else if (j > e) {
                nums[k] = help[i++];
            } else if (help[i] < help[j]) {
                nums[k] = help[i++];
            } else {
                nums[k] = help[j++];
            }
        }
    }
}
