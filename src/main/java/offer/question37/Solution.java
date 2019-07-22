package offer.question37;

public class Solution {
    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int firstIndex = findFirstIndex(array, k);
        int lastIndex = findLastIndex(array, k);
        return lastIndex - firstIndex + 1;

    }

    private int findLastIndex(int[] array, int k) {
        int l = 0;
        int h = array.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (array[m] == k) {
                if (m == array.length - 1 || array[m + 1] != k) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (array[m] > k) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -2;
    }

    private int findFirstIndex(int[] array, int k) {
        int l = 0;
        int h = array.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (array[m] == k) {
                if (m == 0 || array[m - 1] != k) {
                    return m;
                } else {
                    h = m - 1;
                }
            } else if (array[m] > k) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1;
    }
}
