package offer.question35;

public class Solution {
    public int InversePairs(int[] array) {
        if (array == null || array.length <= 1) {
            return 0;
        }

        return mergeSort(array, 0, array.length - 1);
    }

    private int mergeSort(int[] array, int l, int h) {
        if (l < h) {
            int m = l + (h - l) / 2;
            int leftCount = mergeSort(array, l, m);
            int rightCount = mergeSort(array, m + 1, h);
            int count = merge(array, l, m, h);

            return (leftCount + rightCount + count) % 1000000007;

        }

        return 0;
    }

    private int merge(int[] array, int l, int m, int h) {
        int[] t = new int[array.length];
        for (int i = l; i <= h; i++) {
            t[i] = array[i];
        }

        int leftIndex = l;
        int rightIndex = m + 1;
        int count = 0;
        for (int index = l; index <= h; index++) {
            if (leftIndex > m) {
                array[index] = t[rightIndex++];
            } else if (rightIndex > h) {
                array[index] = t[leftIndex++];
            } else if (t[leftIndex] <= t[rightIndex]) {
                array[index] = t[leftIndex++];
            } else {
                count += (m - leftIndex + 1);
                count %= 1000000007;
                array[index] = t[rightIndex++];
            }
        }

        return count;
    }
}
