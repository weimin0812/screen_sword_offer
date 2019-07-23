package offer.question42;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (array == null || array.length <= 1) {
            return ret;
        }

        int l = 0;
        int h = array.length - 1;
        while (l < h) {
            if (array[l] + array[h] == sum) {
                ret.add(array[l]);
                ret.add(array[h]);
                return ret;
            } else if (array[l] + array[h] > sum) {
                h--;
            } else {
                l++;
            }
        }

        return ret;
    }
}
