package offer.question24;

import offer.common.TreeNode;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }

        findPath(root, target, ret, new ArrayList<Integer>());
        return ret;
    }

    private void findPath(TreeNode root, int target, ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        target -= root.val;
        list.add(root.val);
        if (target == 0 && root.left == null && root.right == null) {
            ret.add(new ArrayList<>(list));
        }

        findPath(root.left, target, ret, list);
        findPath(root.right, target, ret, list);
        list.remove(list.size() - 1);
    }
}
