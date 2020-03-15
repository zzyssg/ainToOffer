package com.leetcode.day0228;

import java.util.LinkedList;
import java.util.List;

public class T17_LetterCombinations {
    private String[] keys = {"", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        if (digits == null || digits.length() == 0) {
            return list;
        }
        backtracking(list, new StringBuilder(),digits);
        return list;

    }

    private void backtracking(List<String> list, StringBuilder sb,String digits) {
        if (sb.length() == digits.length()) {
            list.add(sb.toString());
            return;
        }
        //加上下一个
        int index = sb.length();
        String str = keys[digits.charAt(index) - '0'];
        for (char c : str.toCharArray()) {
            backtracking(list,sb.append(c),digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
