package com.buaa.day0221;

import java.util.*;

public class T41_2_FirstNotDuplicate {

    private int[] chnum = new int[128];
    private Queue<Character> que = new LinkedList<>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        chnum[ch]++;
        que.offer(ch);
        while (!que.isEmpty() && chnum[que.peek()] > 1) {
            que.poll();
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        return que.isEmpty() ? '#' : que.peek();
    }

}
