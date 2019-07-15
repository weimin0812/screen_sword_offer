package offer.question26;

import offer.common.TreeNode;

import java.util.Stack;

public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode current = pRootOfTree;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        TreeNode ret = null;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            if (pre == null) {
                ret = current;
                pre = current;
            } else {
                pre.right = current;
                current.left = pre;
                pre = current;
            }

            current = current.right;
        }

        return ret;

    }
}
