package offer.question62;

import offer.common.TreeNode;

import java.util.Stack;

public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k < 1) {
            return null;
        }

        TreeNode current = pRoot;
        Stack<TreeNode> stack = new Stack<>();
        int index = 0;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            index++;
            current = stack.pop();
            if (index == k) {
                return current;
            }

            current = current.right;
        }

        return null;
    }
}
