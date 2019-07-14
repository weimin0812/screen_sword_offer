package offer.question25;

import offer.common.RandomListNode;

import java.util.HashMap;

public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode current = pHead;
        while (current != null) {
            map.put(current, new RandomListNode(current.label));
            current = current.next;
        }

        current = pHead;
        while (current != null) {
            map.get(current).next = map.get(current.next);
            map.get(current).random = map.get(current.random);
            current = current.next;
        }

        current = pHead;
        return map.get(current);
    }
}
