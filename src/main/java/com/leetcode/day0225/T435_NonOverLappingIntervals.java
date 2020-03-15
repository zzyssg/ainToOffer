package com.leetcode.day0225;

import java.util.Arrays;
import java.util.Comparator;

public class T435_NonOverLappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        //找到不重复的最多数目，然后总的数组减去此数
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[o1.length - 1] - o2[o2.length - 1];
            }
        });
        int count = 1;
        int end = intervals[0][intervals[0].length - 1];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][intervals[i].length - 1];
            count++;
        }
        return intervals.length - count;
    }
}
