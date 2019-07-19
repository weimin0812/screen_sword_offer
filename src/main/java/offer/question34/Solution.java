package offer.question34;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        int[] count = new int[256];
        for (char c : str.toCharArray()) {
            count[c]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
    }
}
