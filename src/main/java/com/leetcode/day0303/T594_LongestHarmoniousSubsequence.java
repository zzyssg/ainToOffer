package com.leetcode.day0303;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class T594_LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int longest = 0;
        for (Integer key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                longest = Math.max(map.get(key) + map.get(key + 1), longest);
            }
        }
        return longest;

    }
}
