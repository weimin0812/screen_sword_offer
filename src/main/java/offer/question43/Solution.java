package offer.question43;

public class Solution {
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0 || n <= 0) {
            return str;
        }

        n %= str.length();
        return str.substring(n) + str.substring(0, n);

    }
}
