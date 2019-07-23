package offer.question40;

public class Solution {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length <= 1) {
            return;
        }

        int xorRet = 0;
        for (int i = 0; i < array.length; i++) {
            xorRet ^= array[i];
        }

        int count = 0;
        while ((xorRet & (1 << count)) == 0) {
            count++;
        }

        for (int i = 0; i < array.length; i++) {
            if ((array[i] & (1 << count)) == 0) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }
}
