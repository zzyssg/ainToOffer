package com.buaa.day0213;

public class T11_MinNum {
    public int minNumberInRotateArray(int [] array) {
        int h = array.length - 1;
        int l = 0;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (array[m] == array[h] && array[m] == array[l]) {
                for (int i = l; i < h; i++) {
                    if (array[i] > array[i + 1]) {
                        return array[i + 1];
                    }
                }
            } else if (array[m] <= array[h]) {

                h = m;
            } else {
                l = m + 1;
            }
        }
        return array[l];
    }
}
