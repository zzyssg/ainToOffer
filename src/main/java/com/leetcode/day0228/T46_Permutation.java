package com.leetcode.day0228;

import java.util.ArrayList;
import java.util.List;

public class T46_Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return lists;
        }
        boolean[] visited = new boolean[nums.length];
        backtracking(lists, new ArrayList<Integer>(), visited, nums);
        return lists;

    }

    private void backtracking(List<List<Integer>> lists, List<Integer> list, boolean[] visited, int[] nums) {
        if (list.size() == visited.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int nexti = 0; nexti < visited.length; nexti++) {
            if (visited[nexti]) {
                continue;
            }
            visited[nexti] = true;
            list.add(nums[nexti]);
            backtracking(lists, list, visited, nums);
            list.remove(list.size() - 1);
            visited[nexti] = false;
        }

    }
}
