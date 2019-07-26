package offer.question51;

public class Solution {
    public int[] multiply(int[] A) {
        if (A == null || A.length == 0) {
            return null;
        }
        int[] B = new int[A.length];
        int[] left = new int[A.length];
        int[] right = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                left[i] = 1;
            } else {
                left[i] = A[i - 1] * left[i - 1];
            }
        }

        for (int i = A.length - 1; i >= 0; i--) {
            if (i == (A.length - 1)) {
                right[i] = 1;
            } else {
                right[i] = A[i + 1] * right[i + 1];
            }
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = left[i] * right[i];
        }

        return B;
    }
}
