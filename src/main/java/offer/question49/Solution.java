package offer.question49;

public class Solution {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int ret = 0;
        boolean negative = false;
        int index = 0;
        if (!Character.isDigit(str.charAt(0))) {
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                index = 1;
                if (str.charAt(0) == '-') {
                    negative = true;
                }
            } else {
                return 0;
            }
        }

        for (; index < str.length(); index++) {
            if (!Character.isDigit(str.charAt(index))) {
                return 0;
            }

            ret = ret * 10 + (str.charAt(index) - '0');
        }

        return negative ? -ret : ret;

    }

}
