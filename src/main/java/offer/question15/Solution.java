package offer.question15;

import offer.common.ListNode;

public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode current = head;
        ListNode pre = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        return pre;
    }
}
