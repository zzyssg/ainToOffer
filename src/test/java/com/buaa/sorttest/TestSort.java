package com.buaa.sorttest;

public class TestSort {
    public static void main(String[] args) {
        Sort sort = new ShellSort();
        int[] nums = {4,7,1,0,8,0,3};
        sort.sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
