package com.leetcode.day0302;

public class T168_ExcelSheet {
    public String convertToTitle(int n) {
        if (n == 0) {
            return "";
        }
        int temp = n % 26;
        return convertToTitle(n / 26) + (char) (temp + 'A');
    }
}
