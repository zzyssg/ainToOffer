package com.leetcode.day0227;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T127_WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> que = new LinkedList<>();
        boolean[] visited = new boolean[wordList.size()];
        int level = 0;
        que.offer(beginWord);
        while (!que.isEmpty()) {
            int size = que.size();
            level++;
            //level ?
            while (size-- > 0) {
                String str = que.poll();
                for (int i = 0;!visited[i] && i < wordList.size() - 1; i++) {
                    String s = wordList.get(i);
                    //只有一处不同
                    if (str.equals(endWord)) {
                        return level;
                    }
                    if (oneDifferent(str, s)) {
                        visited[i] = true;
                        que.offer(str);
                    }
                }
            }
        }
        return -1;

    }

    private boolean oneDifferent(String str1, String str2) {
        //str1和str2的对位不一样的个数
        int count = 0;
        for (int i = 0;i < str1.length();i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
        }
        return count == 1;

    }
}
