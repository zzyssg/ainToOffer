package com.leetcode.day0228;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T39_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(lists, new ArrayList<>(), candidates,0 ,target);
        return lists;

    }

    private void backtracking(List<List<Integer>> lists, ArrayList<Integer> integers, final int[] candidates,int start,int target) {
        if (target == 0) {
            lists.add(new ArrayList<>(integers));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {

                integers.add(candidates[i]);
                backtracking(lists, integers, candidates, i, target - candidates[i]);

                integers.remove(integers.size() - 1);
            }
        }

    }
}
