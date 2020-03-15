package com.buaa.day0221;

public class T58_2_LeftReverWords {
    public String LeftRotateString(String str,int n) {
        //分别将 0 - n-1 和 n - str.len 翻转 ,然后将整组翻转
        if (str == null || str.length() < n) {
            return "";
        }
        char[] chars = str.toCharArray();
        reverse(chars, 0, n - 1);
        reverse(chars,n,str.length() - 1);
        reverse(chars, 0, str.length() - 1);
        return new String(chars);

    }

    private void reverse(char[] chars, int i, int j) {
        while (i < j) {
            swap(chars, i++, j--);
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
