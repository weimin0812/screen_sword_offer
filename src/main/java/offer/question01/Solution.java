package offer.question01;

public class Solution {
    // 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
    public boolean Find(int target, int[][] array) {
        if (array == null) {
            return false;
        }

        int r = 0;
        int c = array[0].length - 1;
        while (r <= array.length - 1 && c >= 0) {
            if (array[r][c] == target) {
                return true;
            } else if (array[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return false;
    }
}
