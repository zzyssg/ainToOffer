package com.buaa.day0213;

public class T10_2_Cover {
    public int RectCover(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int res = 0;
        int a = 1;
        int b = 2;
        for (int i = 3; i <= target; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;


    }
}
