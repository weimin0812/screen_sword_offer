package offer.question56;

import offer.common.ListNode;

public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }

        boolean duplicate = false;
        while (pHead != null && pHead.next != null && pHead.val == pHead.next.val) {
            duplicate = true;
            pHead = pHead.next;
        }

        if (duplicate) {
            return deleteDuplication(pHead.next);
        }

        pHead.next = deleteDuplication(pHead.next);
        return pHead;

    }
}
