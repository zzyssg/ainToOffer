package com.leetcode.day0228;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T47_PermutationII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return lists;
        }
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        backtracking(lists,new ArrayList<>(),visited,nums);
        return lists;

    }

    private void backtracking(List<List<Integer>> lists, ArrayList<Integer> integers, boolean[] visited, int[] nums) {
        if (integers.size() == nums.length) {
            lists.add(new ArrayList<>(integers));
            return;
        }
        for (int i = 0;i < nums.length;i++) {
            if (i != 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }
            if (visited[i] == true) {
                continue;
            }
            visited[i] = true;
            integers.add(nums[i]);
            backtracking(lists, integers, visited, nums);
            visited[i] = false;
            integers.remove(integers.size() - 1);
        }
    }
}
