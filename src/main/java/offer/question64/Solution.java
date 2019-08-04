package offer.question64;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (num == null || num.length == 0 || size < 1 || size > num.length) {
            return ret;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            int beginIndex = i - size + 1;
            while (!queue.isEmpty() && beginIndex > queue.peekFirst()) {
                queue.pollFirst();
            }

            while (!queue.isEmpty() && num[queue.peekLast()] < num[i]) {
                queue.pollLast();
            }

            queue.add(i);
            if (beginIndex >= 0) {
                ret.add(num[queue.peekFirst()]);
            }
        }

        return ret;

    }
}
