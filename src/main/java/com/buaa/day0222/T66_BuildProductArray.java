package com.buaa.day0222;

import java.util.Arrays;

public class T66_BuildProductArray {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0, product = 1; i < A.length; product *= A[i++]) {
            B[i] = product;
        }
        for (int i = A.length - 1, product = 1; i >= 0; product *= A[i--]) {
            B[i] *= product;
        }
        return B;
    }

}
