package offer.question56;

import offer.common.ListNode;

public class Solution2 {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode ret = new ListNode(1);
        ret.next = pHead;
        ListNode current = pHead;
        ListNode fake = ret;
        while (current != null) {
            if (current.next != null && current.next.val == current.val) {
                while (current != null && current.next != null && current.val == current.next.val) {
                    current = current.next;
                }

                fake.next = current.next;
                current = current.next;

            } else {
                current = current.next;
                fake = fake.next;
            }
        }

        return ret.next;

    }
}
