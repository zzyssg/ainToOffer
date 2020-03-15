package com.buaa.day0221;

import java.util.ArrayList;

public class T57_2_NumbersSumIsS {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        int l = 1, h = 2;
        while (h < sum) {
            int temp = (h - l + 1) * (l + h) / 2;
            if (temp == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = l; i <= h; i++) {
                    list.add(i);
                }
                lists.add(list);
            }
            if (temp > sum) {
                l++;
            } else {
                h++;
            }
        }
        return lists;
    }
}
