package com.leetcode.day0309;

public class T91 {
    public int numDecodings(String s) {
        return recursion(s, 0);

    }

    private int recursion(String s, int index) {
        if (s.length() == index) {
            return 1;
        }
        if (s.charAt(index) == '0') {
            return 0;
        }
        int res1 = recursion(s, index + 1);
        int res2 = 0;
        if (s.length() > index + 1) {
//            int num = Integer.valueOf(s.substring(index, index + 2));超出时间限制
            int one = (s.charAt(index) - '0') * 10;
            int two = (s.charAt(index + 1) - '0');
            int num = one + two;
            if (num <= 26) {
                res2 = recursion(s, index + 2);
            }
        }
        return res1 + res2;
    }
    private int getDp(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= s.length(); i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1];
            }
            if (s.charAt(i - 2) == '0') {
                continue;
            }
            int two = Integer.valueOf(s.substring(i - 2, i));
            if (two <=  26) {
                dp[i] = dp[i] + dp[i - 2];
            }
        }
        return dp[s.length()];
    }

}
