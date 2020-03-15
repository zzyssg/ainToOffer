package com.buaa.day0221;

public class T53_NumberTimes {
    public int GetNumberOfK(int[] array, int k) {
        int index = getIndex(array, 0, array.length, k);
        int count = 0;
        for (int i = index; i < array.length; i++) {
            if (array[index] == k) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    private int getIndex(int[] array, int l, int h, int k) {
        while (l <= h) {
            int m = (h - l) / 2 + l;
            if (array[m] >= k) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
