package com.buaa.day0218;

import java.util.ArrayList;
import java.util.Arrays;

public class T38_SortString {
    ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) {
            return list;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        backtracking(chars, new boolean[chars.length], new StringBuilder());
        return list;
    }


    private void backtracking(char[] chars, boolean[] used, StringBuilder sb) {
        if (sb.length() == chars.length) {
            list.add(sb.toString());
        }
        for (int i = 0; i < chars.length; i++) {
            //每个字母做一次头部
            if (used[i]) {
                continue;
            }
            if (i != 0 && chars[i] == chars[i - 1] && !used[i - 1]) {
                continue;
            }
            sb.append(chars[i]);
            used[i] = true;
            backtracking(chars, used, sb);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false;
        }
    }
}
