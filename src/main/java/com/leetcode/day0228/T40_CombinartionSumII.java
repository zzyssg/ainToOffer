package com.leetcode.day0228;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T40_CombinartionSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(candidates);
        boolean[] visited = new boolean[candidates.length];
        backtracking(lists,new ArrayList<Integer>(),candidates,0,target,visited);
        return lists;
    }

    private void backtracking(List<List<Integer>> lists, ArrayList<Integer> integers,
                              int[] candidates, int start, int target,boolean[] visited
    ) {
        if (target == 0) {
            lists.add(new ArrayList<>(integers));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i != 0 && candidates[i] == candidates[i -1] && !visited[i - 1] ) {
                continue;
            }
            if (candidates[i] <= target) {
                integers.add(candidates[i]);
                visited[i] = true;
                backtracking(lists, integers, candidates,i + 1,target - candidates[i],visited);
                integers.remove(integers.size() - 1);
                visited[i] = false;
            }
        }

    }
}
