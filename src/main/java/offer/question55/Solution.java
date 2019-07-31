package offer.question55;

import offer.common.ListNode;

public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;

    }
}
