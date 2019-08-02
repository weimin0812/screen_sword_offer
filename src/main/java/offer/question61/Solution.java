package offer.question61;

import offer.common.TreeNode;

public class Solution {
    private int index = -1;

    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }

        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    TreeNode Deserialize(String str) {
        index++;
        String[] nodes = str.split(",");
        if ("#".equals(nodes[index])) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.valueOf(nodes[index]));
        node.left = Deserialize(str);
        node.right = Deserialize(str);
        return node;
    }
}
