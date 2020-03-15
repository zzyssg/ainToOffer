package com.sort;

public class QuickSort {
    public void sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int i, int j) {
        if (i >= j) {
            return;
        }
        int p = partition(nums, i, j);
        quickSort(nums, i, p - 1);
        quickSort(nums, p + 1, j);
    }

    private int partition(int[] nums, int start, int end) {
        int l = start, h = end + 1;
        while (true) {
            while (nums[++l] < nums[start] && l != end) {
            }
            while (nums[--h] > nums[start] && h != start)  {
            }
            if (l >= h) {
                break;
            }
            swap(nums, l, h);
        }
        swap(nums,start,h);
        return h;

    }

    private void swap(int[] nums, int start, int end) {
        int t = nums[start];
        nums[start] = nums[end];
        nums[end] = t;
    }
}
