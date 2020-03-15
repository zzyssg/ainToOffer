package com.leetcode.day0228;

import java.util.ArrayList;
import java.util.List;

public class T77_Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];
        backtracking(lists,new ArrayList<Integer>(),n,k,1);
        return lists;
    }

    private void backtracking(List<List<Integer>> lists, ArrayList<Integer> integers,final int n, int k,int start) {
        if (k == 0) {
            lists.add(new ArrayList<>(integers));
            return;
        }
        for (int i = start; i <= n - k + 1; i++) {
            integers.add(i);
            backtracking(lists, integers, n, k - 1, i + 1);
            integers.remove(integers.size() - 1);
        }
    }
}
