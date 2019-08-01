package offer.question57;

import offer.common.TreeLinkNode;

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode current = pNode;
        if (current == null) {
            return null;
        }

        if (current.right != null) {
            current = current.right;
            while (current != null && current.left != null) {
                current = current.left;
            }

            return current;
        }

        while (current != null && current.next != null && current.next.left != current) {
            current = current.next;
        }

        return current.next;
    }
}
