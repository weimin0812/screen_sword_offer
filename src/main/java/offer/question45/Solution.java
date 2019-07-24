package offer.question45;

public class Solution {
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length != 5) {
            return false;
        }

        int[] count = new int[14];
        int first = 13;
        int last = 1;
        for (int num : numbers) {
            if (num < 0 || num > 13) {
                return false;
            }

            count[num]++;
            if (num == 0) {
                if (count[num] > 4) {
                    return false;
                }
            } else {
                first = Math.min(first, num);
                last = Math.max(last, num);
                if (count[num] > 1) {
                    return false;
                }
            }
        }

        return last - first <= 4;

    }
}
