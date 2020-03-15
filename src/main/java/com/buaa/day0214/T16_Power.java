package com.buaa.day0214;

public class T16_Power {
    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        boolean isPos = true;
        if (exponent < 0) {
            isPos = false;
            exponent = -exponent;
        }
        double res  = Power(base * base, exponent / 2);
        if (exponent % 2 == 1) {
            res =  res * base;
        }
        return isPos ? res : (1.0 / res);

    }

}
