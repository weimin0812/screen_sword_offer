package offer.question19;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (matrix == null) {
            return ret;
        }

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ret.add(matrix[top][i]);
            }

            for (int i = top + 1; i <= bottom; i++) {
                ret.add(matrix[i][right]);
            }

            if (bottom != top) {
                for (int i = right - 1; i >= left; i--) {
                    ret.add(matrix[bottom][i]);
                }
            }

            if (left != right) {
                for (int i = bottom - 1; i > top; i--) {
                    ret.add(matrix[i][left]);
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }

        return ret;
    }


}
