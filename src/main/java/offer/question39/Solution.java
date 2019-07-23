package offer.question39;

import offer.common.TreeNode;

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return getDepth(root) != -1;
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = getDepth(root.left);
        if (left == -1) {
            return -1;
        }

        int right = getDepth(root.right);
        if (right == -1) {
            return -1;
        }

        return Math.abs(right - left) > 1 ? -1 : Math.max(right, left) + 1;
    }
}
