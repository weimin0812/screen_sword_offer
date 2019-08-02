package offer.question59;

import offer.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    // 即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (pRoot == null) {
            return ret;
        }

        TreeNode current = pRoot;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(current);
        int level = 0;
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                current = queue.poll();
                if (level % 2 == 1) {
                    list.add(current.val);
                } else {
                    list.add(0, current.val);
                }
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            ret.add(list);
        }

        return ret;
    }
}
