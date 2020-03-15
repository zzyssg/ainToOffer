package com.buaa.day0218;

import java.util.Arrays;

public class T39_MoreThanHalf {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null) {
            return 0;
        }
        int res = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            count = res == array[i] ? count + 1 : count - 1;
            if (count == 0) {
                res = array[i];
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < array.length;i++) {
            if (array[i] == res) {
                count++;
            }
        }
        return count > array.length / 2 ? res : 0;

    }
}
