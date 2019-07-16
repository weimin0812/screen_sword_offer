package offer.question27;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> ret = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return ret;
        }
        permutation(str.toCharArray(), 0, ret);
        Collections.sort(ret);
        return ret;

    }

    private void permutation(char[] array, int l, ArrayList<String> ret) {
        if (l == array.length) {
            String s = new String(array);
            if (!ret.contains(s)) {
                ret.add(s);
            }
            return;
        }

        for (int i = l; i < array.length; i++) {
            swap(array, l, i);
            permutation(array, l + 1, ret);
            swap(array, l, i);
        }

    }

    private void swap(char[] array, int i, int j) {
        char c = array[i];
        array[i] = array[j];
        array[j] = c;
    }
}
