package com.buaa.day0211;

public class T05_Space {

    public String replaceSpace(StringBuffer str) {
       //快慢指针
        int count = 0;
        int p = str.length() - 1;
        for (int i = 0; i <= p; i++) {
            if (str.charAt(i) == ' ') {
                str.append(' ');
                str.append(' ');
            }
        }
        int q = str.length() - 1;
        while (p >= 0 && p < q) {
            if (str.charAt(p) == ' ') {
                str.setCharAt(q--,'0');
                str.setCharAt(q--,'2');
                str.setCharAt(q--,'%');
                p--;
            } else {
                str.setCharAt(q,str.charAt(p));
                p--;
                q--;
            }
        }
        return str.toString();
    }
}
