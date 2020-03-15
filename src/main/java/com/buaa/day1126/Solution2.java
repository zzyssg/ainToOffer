package com.buaa.day1126;

public class Solution2 {
    public String replaceSpace(StringBuffer str) {
        String string = str.toString();
        char[] chars = string.toCharArray();
//        int count = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if (' ' == chars[i]) {
//                count++;
//            }
//        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (' ' == chars[i]) {
                sb.append("%20");
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}