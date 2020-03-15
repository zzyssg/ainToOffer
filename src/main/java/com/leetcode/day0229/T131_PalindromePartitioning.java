package com.leetcode.day0229;

import java.util.ArrayList;
import java.util.List;

public class T131_PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> lists = new ArrayList<>();
        List<String> list = new ArrayList<>();
        backtracking(s, lists, list);
        return lists;


    }

    private void backtracking(String s, List<List<String>> lists, List<String> list) {
        if (s.length() == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isHunWen(s,0,i)) {
                list.add(s.substring(0, i + 1));
                backtracking(s.substring(i +1),lists,list);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isHunWen(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start--) != s.charAt(end--) ) {
                return false;
            }
        }
        return true;
    }


}
