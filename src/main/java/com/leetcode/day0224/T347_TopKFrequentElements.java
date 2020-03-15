package com.leetcode.day0224;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class T347_TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        List<Integer>[] lists = new List[nums.length + 1];
        for (int num : map.keySet()) {
            int time = map.get(num);
            if (lists[time] == null) {
                lists[time] = new LinkedList<>();
            }
            lists[time].add(num);
        }
        List<Integer> res = new LinkedList<>();
        for (int i = lists.length - 1; i >= 0 && res.size() < k; i--) {
            if (lists[i] == null) {
                continue;
            }
            if (k - res.size() >= lists[i].size()) {
                res.addAll(lists[i]);
            } else {
                res.addAll(lists[i].subList(0, k - res.size()));
            }

        }
        return res;
    }

}
