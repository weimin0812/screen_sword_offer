package offer.question46;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n <= 0 || m <= 0) {
            return -1;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }

        int count = 0;
        while (queue.size() != 1) {
            int t = queue.poll();
            count++;
            if (count == m) {
                count = 0;
            } else {
                queue.offer(t);
            }
        }

        return queue.peek();

    }
}
