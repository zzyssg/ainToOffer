package com.leetcode.day0228;

import java.util.ArrayList;
import java.util.List;

public class T93_RestoreIpAddress {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return list;
        }
        backtracking(0, list, new StringBuilder(), s);
        return list;

    }

    private void backtracking(int k, List<String> list, StringBuilder sb, String s) {
        if (k == 4 || s.length() == 0) {
            if (k == 4 && s.length() == 0) {
                list.add(sb.toString());
            }
            return;
        }
        for (int i = 0; i < s.length() && i <= 2; i++) {
            if (i != 0 && s.charAt(0) == '0') {
                break;
            }
            String part = s.substring(0, i+1);
            if (Integer.valueOf(part) <= 255) {

                if (sb.length() != 0) {
                    part = "." + part;
                }
                sb.append(part);
                backtracking(k + 1, list, sb, s.substring(i + 1));
                sb.delete(sb.length() - part.length(), sb.length());

            }
        }
    }

}
