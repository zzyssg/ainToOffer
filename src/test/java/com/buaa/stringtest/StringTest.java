package com.buaa.stringtest;

import java.util.LinkedList;
import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        int num = list.get(0);
        System.out.println(num);
        String s = "aamdasaafdssdfsdas";
        Manacher manacher = new Manacher();
        String str = manacher.getLongestPalindaSubstring(s);
        System.out.println(str);

    }
}
