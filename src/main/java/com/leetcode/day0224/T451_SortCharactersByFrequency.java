package com.leetcode.day0224;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T451_SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        List<Character>[] lists = new List[s.length() + 1];
        for (char c : map.keySet()) {
            int times = map.get(c);
            if (lists[times] == null) {
                lists[times] = new ArrayList<>();
            }
            lists[times].add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i >= 0; i--) {
            //有i个
            if (lists[i] == null) {
                continue;
            }
            for (char c : lists[i]) {
                for (int j = 1;j <= i;j++) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
