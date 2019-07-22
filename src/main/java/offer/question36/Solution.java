package offer.question36;

import offer.common.ListNode;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;
        while (current1 != current2) {
            current1 = current1 == null ? pHead2 : current1.next;
            current2 = current2 == null ? pHead1 : current2.next;
        }

        return current1;
    }
}
