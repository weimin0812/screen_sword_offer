package offer.question10;

public class Solution {
    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        }

        int f = 2;
        int g = 1;
        for (int i = 2; i < target; i++) {
            int t = f;
            f = f + g;
            g = t;
        }

        return f;
    }
}
