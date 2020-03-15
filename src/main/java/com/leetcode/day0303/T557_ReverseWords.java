package com.leetcode.day0303;

public class T557_ReverseWords {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append(new StringBuilder(strs[i]).reverse()).append(" ");
        }
        return sb.toString().trim();

    }


    public static void main(String[] args) {
        T557_ReverseWords s = new T557_ReverseWords();
        String str = "   Lets take leetecode conetst";
        String res = s.reverseWords(str);
        System.out.println(res);
    }
}
