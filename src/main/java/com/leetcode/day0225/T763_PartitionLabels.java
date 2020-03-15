package com.leetcode.day0225;

import java.util.LinkedList;
import java.util.List;

public class T763_PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        int[] cIndex = new int[26];
        //得到每一个字符出现的最后位置
        for (int i = 0; i < S.length(); i++) {
            cIndex[S.charAt(i) - 'a'] = i;
        }
        //每个区间的头尾
        int anchor = 0, j = 0;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            //更新区间的结尾
            j = Math.max(j,cIndex[S.charAt(i) - 'a']);
            if (i == j) {
                list.add(j - anchor + 1);
                anchor = i + 1;
            }

        }
        return list;
    }
}
