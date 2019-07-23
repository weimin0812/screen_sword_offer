package offer.question41;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        FindContinuousSequence(3);
    }

    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (sum < 2) {
            return ret;
        }

        int l = 1;
        int h = 2;
        while (h < sum) {
            int t = (l + h) * (h - l + 1) / 2;
            if (t == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = l; i <= h; i++) {
                    list.add(i);
                }
                ret.add(list);
                l++;
                h++;
            } else if (t > sum) {
                l++;
            } else {
                h++;
            }
        }

        return ret;

    }
}
