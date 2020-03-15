package com.leetcode.day0229;

import java.util.ArrayList;
import java.util.List;

public class T216_CombinationIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> lists = new ArrayList<>();
        backtracking(lists, new ArrayList<Integer>(),1,k,n);
        return lists;

    }

    private void backtracking(List<List<Integer>> lists, ArrayList<Integer> integers, int start, int k, int sum) {
        if (0 == k || sum == 0) {
            if (0 == k && sum == 0) {
                lists.add(new ArrayList<>(integers));
                return;
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            //if (i <= sum) {
                integers.add(i);
                backtracking(lists,integers,i+1,k - 1,sum - i);
                integers.remove(integers.size() - 1);
//            }
        }

    }
}
