package com.buaa.day0214;

public class T14_CutRope {

    public int cutRope(int target) {

        if (target <= 1) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        // >= 4
        int res = getMax(target);
        return res;

    }

    private int getMax(int target) {
        //因为进入到此方法中的绳的长度大于等于4 ，当 递归中出现 1,2,3时，右侧还剩余绳子
        if (target <= 3) {
            return target;
        }
        int res = 0;
        for (int i = 1; i <= target / 2; i++) {
            res = Math.max(res, getMax(i) * getMax(target - i));
        }
        return res;
    }


}
