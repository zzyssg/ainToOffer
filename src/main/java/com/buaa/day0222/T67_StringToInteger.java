package com.buaa.day0222;



public class T67_StringToInteger {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        char[] chars = str.toCharArray();
        boolean isNegative = false;
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && (c == '-' || c == '+')) {
                isNegative = c == '-' ? true : false;
                continue;
            }
            if (c < '0' || c > '9') {
                return 0;
            }
            if (isNegative) {
                //负数边界
                if (Integer.MIN_VALUE / 10 > -res) {
                    return 0;
                }
                if (Integer.MIN_VALUE + res * 10 > ('0' - c)) {
                    return 0;
                }

            } else {
                //正数边界
                if(Integer.MAX_VALUE / 10 < res){
                    return 0;
                }
                if (Integer.MAX_VALUE - res * 10 < (c - '0')) {
                    return 0;
                }

            }

            res = res * 10 + (c - '0');

        }
        return isNegative ? -res : res;
    }
}
