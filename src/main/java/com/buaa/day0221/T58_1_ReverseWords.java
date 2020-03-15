package com.buaa.day0221;

public class T58_1_ReverseWords {
    public String ReverseSentence(String str) {
        int len = str.length();
        char[] chars = str.toCharArray();
        int i = 0,j = 0;

        while (j <= len) {
            if (j == len || chars[j] == ' ') {
                reverse(chars, i, j - 1);
                i = j + 1;
            }
            j++;
        }
        //调整整个
        reverse(chars, 0, len - 1);
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
