package offer.question03;

import offer.common.ListNode;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        ListNode current = listNode;
        while (current != null) {
            ret.add(0, current.val);
            current = current.next;
        }

        return ret;
    }
}
