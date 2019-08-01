package offer.question58;

import offer.common.TreeNode;

public class Solution {
    boolean isSymmetrical(TreeNode pRoot) {
        TreeNode current = pRoot;
        if (current == null) {
            return true;
        }

        return isSymmetrical(current.left, current.right);
    }

    private boolean isSymmetrical(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }

        return left.val == right.val && isSymmetrical(left.left, right.right) && isSymmetrical(left.right, right.left);
    }

}
