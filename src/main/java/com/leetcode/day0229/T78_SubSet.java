package com.leetcode.day0229;

import java.util.ArrayList;
import java.util.List;

public class T78_SubSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return lists;
        }
        for (int i = 0;i <= nums.length;i++){
            backtracking(lists, new ArrayList<Integer>(), 0,nums,i );
        }
        return lists;

    }

    private void backtracking(List<List<Integer>> lists, ArrayList<Integer> integers, int start, int[] nums, int k) {
        if (k == 0) {
            lists.add(new ArrayList<>(integers));
            return;
        }
        if (start >=  nums.length) {
            return;
        }
        for (int i = start;i < nums.length;i++) {
            integers.add(nums[i]);
            backtracking(lists,integers,i + 1,nums,k - 1);
            integers.remove(integers.size() - 1);
        }
    }
}
