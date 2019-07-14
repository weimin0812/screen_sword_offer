package offer.question23;

public class Solution {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verifySquenceOfBST(sequence, 0, sequence.length - 1);
    }

    private boolean verifySquenceOfBST(int[] sequence, int l, int h) {
        if (l >= h) {
            return true;
        }
        int rootValue = sequence[h];
        int breakIndex = l;
        for (; breakIndex < h; breakIndex++) {
            if (sequence[breakIndex] > rootValue) {
                break;
            }
        }

        int index = breakIndex;
        for (; breakIndex < h; breakIndex++) {
            if (sequence[breakIndex] < rootValue) {
                return false;
            }
        }


        return verifySquenceOfBST(sequence, l, index - 1) && verifySquenceOfBST(sequence, index, h - 1);

    }
}
