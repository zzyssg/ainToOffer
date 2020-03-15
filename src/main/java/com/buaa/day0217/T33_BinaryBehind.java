package com.buaa.day0217;

public class T33_BinaryBehind {
    public boolean VerifySquenceOfBST(int [] sequence) {
        //从某处开始成立
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return isBinaryFindTree(sequence, 0, sequence.length - 1);
    }

    private boolean isBinaryFindTree(int[] sequence, int start, int end) {
        if (start >=  end) {
            return true;
        }
        int root = sequence[end];
        int left = start;
        while (left < end && sequence[left] < root) {
            left++;
        }
        int right = left;
        for (int i = right;i < end;i++) {
            if (sequence[i] < root) {
                return false;
            }
        }
        return isBinaryFindTree(sequence, start, left - 1) && isBinaryFindTree(sequence, left, end - 1);
    }
}
