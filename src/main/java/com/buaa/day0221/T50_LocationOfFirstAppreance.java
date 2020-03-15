package com.buaa.day0221;

public class T50_LocationOfFirstAppreance {
    public int FirstNotRepeatingChar(String str) {
        int[] charCount = new int[str.length()];
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                index = i;
                return index;
            }
        }
        return index;
    }
}
