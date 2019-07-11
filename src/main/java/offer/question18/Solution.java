package offer.question18;

import offer.common.TreeNode;

public class Solution {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;

        Mirror(root.left);
        Mirror(root.right);

    }
}
