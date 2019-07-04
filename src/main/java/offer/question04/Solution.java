package offer.question04;

import offer.common.TreeNode;

public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || pre.length == 0 || in == null || in.length == 0 || pre.length != in.length) {
            return null;
        }

        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);

    }

    private TreeNode reConstructBinaryTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        //pre --> root left right
        //in --> left root right
        int rootValue = pre[preStart];
        int rootIndex = inStart;
        for (; rootIndex <= inEnd; rootIndex++) {
            if (in[rootIndex] == rootValue) {
                break;
            }
        }

        TreeNode node = new TreeNode(rootValue);
        int leftLength = rootIndex - inStart;
        node.left = reConstructBinaryTree(pre, preStart + 1, preStart + leftLength, in, inStart, rootIndex - 1);
        node.right = reConstructBinaryTree(pre, preStart + leftLength + 1, preEnd, in, rootIndex + 1, inEnd);
        return node;
    }

}
