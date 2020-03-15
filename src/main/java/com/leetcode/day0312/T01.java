package com.leetcode.day0312;

import java.util.HashMap;
import java.util.Map;

public class T01 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            int left = target - nums[i];
            if (map.containsKey(left)) {
                return new int[]{map.get(left), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

}
