package offer.question30;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int ret = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (sum < 0) {
                sum = 0;
            }

            sum += array[i];
            ret = Math.max(sum, ret);
        }

        return ret;

    }
}
