package offer.question13;

public class Solution {
    // 奇数位于数组的前半部分，所有的偶数位于数组的后半部分
    public void reOrderArray(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            boolean sorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
                    sorted = false;
                    swap(array, j, j + 1);
                }
            }

            if (sorted) {
                break;
            }
        }

    }

    private void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
