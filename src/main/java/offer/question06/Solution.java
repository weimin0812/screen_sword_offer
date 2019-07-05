package offer.question06;

public class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int l = 0;
        int h = array.length - 1;

        while (l < h) {
            int m = l + (h - l) / 2;
            if (array[m] < array[h]) {
                h = m;
            } else if (array[m] > array[h]) {
                l = m + 1;
            } else {
                l++;
                h++;
            }
        }

        return array[l];

    }
}
