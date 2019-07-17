package offer.question29;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (input == null || input.length == 0 || k <= 0 || k > input.length) {
            return ret;
        }

        int index = partition(input, 0, input.length - 1);
        while (index != k - 1) {
            if (index < k - 1) {
                index = partition(input, index + 1, input.length - 1);
            } else {
                index = partition(input, 0, index - 1);
            }
        }

        for (int i = 0; i < k; i++) {
            ret.add(input[i]);
        }

        return ret;
    }

    private int partition(int[] input, int l, int h) {
        int pivot = input[l];
        while (l < h) {
            while (l < h && input[h] >= pivot) {
                h--;
            }

            input[l] = input[h];

            while (l < h && input[l] <= pivot) {
                l++;
            }

            input[h] = input[l];
        }

        input[l] = pivot;
        return l;
    }
}
