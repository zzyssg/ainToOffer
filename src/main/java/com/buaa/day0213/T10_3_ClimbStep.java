package com.buaa.day0213;

public class T10_3_ClimbStep {
    public int JumpFloor(int target) {
        if (target <= 2) {
            return target;
        }
        int res = 0;
        int f1 = 1;
        int f2 = 2;
        for (int i = 3; i <= target; i++) {
            res = f1 + f2;
            f1 = f2;
            f2 = res;
        }
        return res;
    }
}
