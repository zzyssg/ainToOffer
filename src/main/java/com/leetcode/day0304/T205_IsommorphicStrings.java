package com.leetcode.day0304;

import java.util.HashMap;
import java.util.Map;

public class T205_IsommorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i), ct = t.charAt(i);
            if (!mapS.containsKey(cs)) {
                mapS.put(cs, i);
            }
            if (!mapT.containsKey(ct)) {
                mapT.put(ct, i);
            }
            if (mapS.get(cs) != mapT.get(ct)) {
                return false;
            }
        }
        return true;
    }
}
