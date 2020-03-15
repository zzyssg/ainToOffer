package com.buaa.day0215;

public class T19_PatternStr {
    public boolean match(char[] str, char[] pattern)
    {

        return match(str, 0, pattern, 0);
    }

    private boolean match(char[] str, int i, char[] pattern, int j) {
        if (i == str.length && j == pattern.length) { // 同时到达
            return true;
        } else if (j == pattern.length && i < str.length) {
            return false;
        }
        boolean next = (j < pattern.length - 1 && pattern[j + 1] == '*');
        if (next) {
            if (i < str.length && (str[i] == pattern[j] || pattern[j] == '.')) {
                return match(str, i + 1, pattern, j) || match(str, i, pattern, j + 2)
                        || match(str, i + 1, pattern, j + 2);
            } else {
                return match(str, i , pattern, j + 2);
            }
        } else {
            //不是'*'
            if (str[i] == pattern[j] || pattern[j] == '.') {
                return match(str, i + 1, pattern, j + 1);
            } else {
                return false;
            }
        }

    }


}
