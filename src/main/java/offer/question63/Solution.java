package offer.question63;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    private int size = 0;
    private Queue<Integer> minHeap = new PriorityQueue<>();
    private Queue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));

    public void Insert(Integer num) {
        size++;
        if (size % 2 == 1) {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        } else {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
    }

    public Double GetMedian() {

        if (size % 2 == 1) {
            return maxHeap.peek() * 1.0;
        }

        return (maxHeap.peek() + minHeap.peek()) * 0.5;
    }
}
