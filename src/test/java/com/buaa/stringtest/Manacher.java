package com.buaa.stringtest;

public class Manacher {
    public String getLongestPalindaSubstring(String s) {
        String manaStr = manacher(s);
        char[] charArray = manaStr.toCharArray();
        int[] pArray = new int[charArray.length];
        int pR = -1;
        int index = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < charArray.length; i++) {
            pArray[i] = i < pR ? Math.min(pArray[2 * index - i], pR - i) : 1;
            while (pArray[i] + i < charArray.length && i - pArray[i] >= 0) {
                if (charArray[pArray[i] + i] == charArray[i - pArray[i]]) {
                    pArray[i]++;
                } else {
                    break;
                }
            }
            if (i + pArray[i] > pR) {
                pR = pArray[i];
                index = i;
            }
            max = Math.max(max, pArray[i]);
        }
        int maxIndex = -1;
        for (int i = 0; i < pArray.length; i++) {
            if (max == pArray[i]) {
                maxIndex = i;
            }
        }

        return s.substring((maxIndex - max + 1) / 2, (maxIndex - max + 1) / 2 + max - 1);


    }

    private String manacher(String s) {
        String str = "#";
        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(i) + "#";
        }
        return str;
    }

}
