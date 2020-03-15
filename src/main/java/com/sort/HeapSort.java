package com.sort;

public class HeapSort {
    public void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            heapInsert(nums, i);  //堆的格式插入
        }
        for (int i = nums.length - 1; i > 0 ; i--) {
            swap(nums, 0, i);
            heapify(nums, 0, i);

        }

    }

    private void heapify(int[] nums, int i, int j) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        while (left < j) {
            if (nums[left] > nums[i]) {
                largest = left;
            }
            if (right < j && nums[right] > nums[largest]) {
                largest = right;
            }
            if (i != largest) {
                swap(nums, i, largest);
            } else {
                break;
            }
            i = largest;
            left = 2 * i + 1;
            right = 2 * i + 2;

        }


    }

    private void heapInsert(int[] nums, int i) {
        int parent = 0;
        while (i != 0) {
            parent = (i - 1) / 2;
            if (nums[parent] < nums[i]) {
                swap(nums, i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }


    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
