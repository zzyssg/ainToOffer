package com.buaa.day0221;

public class T49_UglyNum {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        int[] res = new int[index];
        res[0] = 1;

        int p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < index; i++) {
            int next2 = res[p2] * 2, next3 = res[p3] * 3, next5 = res[p5] * 5;
            res[i] = Math.min(next2, Math.min(next3, next5));
            if (res[i] == next2) {
                p2++;
            }
            if (res[i] == next3) {
                p3++;
            }
            if (res[i] == next5) {
                p5++;
            }
        }
        return res[index - 1];
    }
}
