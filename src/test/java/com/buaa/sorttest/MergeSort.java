package com.buaa.sorttest;

import org.omg.PortableInterceptor.INACTIVE;

public class MergeSort extends Sort {
    int[] help;
    @Override
    void sort(int[] nums) {
        help = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);

    }

    private void mergeSort(int[] nums, int i, int j) {
        if (j <= i) {
            return;
        }
        int m = (j - i) / 2 + i;
        mergeSort(nums,i,m);
        mergeSort(nums, m + 1, j);
        merge(nums, i, m, j);

    }

    private void merge(int[] nums, int start, int mid, int end) {
        for (int i = start;i <= end;i++) {
            help[i] = nums[i];
        }
        int i = start, j = mid + 1;
        for (int k = start;k <= end;k++) {
            if (i > mid) {
                nums[k] = help[j++];
            } else if (j > end) {
                nums[k] = help[i++];
            } else if (help[i] < help[j]) {
                nums[k] = help[i++];
            } else {
                nums[k] = help[j++];
            }
        }

    }


}
