package offer.question16;

import offer.common.ListNode;

public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        // 输入两个单调递增的链表
        // 单调不减规则。
        ListNode ret = list1.val <= list2.val ? list1 : list2;

        ret.next = Merge(list1.val <= list2.val ? list1.next : list1, list1.val <= list2.val ? list2 : list2.next);
        return ret;

    }
}
