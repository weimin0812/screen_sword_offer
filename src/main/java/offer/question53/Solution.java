package offer.question53;

public class Solution {
    public boolean isNumeric(char[] str) {
        if (str == null) {
            return false;
        }

        String num = new String(str).toLowerCase();
        int eIndex = num.indexOf('e');
        if (eIndex < 0) {
            return isNumeric(num, false);
        } else {
            return isNumeric(num.substring(0, eIndex), false) && isNumeric(num.substring(eIndex + 1), true);
        }

    }

    private boolean isNumeric(String num, boolean isInt) {
        if (num == null || num.isEmpty()) {
            return false;
        }

        int index = 0;
        if (!Character.isDigit(num.charAt(0))) {
            if (num.charAt(0) == '+' || num.charAt(0) == '-') {
                index = 1;
            } else {
                return false;
            }
        }

        int dot = 0;
        for (; index < num.length(); index++) {
            if (!Character.isDigit(num.charAt(index))) {
                if (isInt) {
                    return false;
                } else {
                    if (num.charAt(index) == '.') {
                        dot++;
                        if (dot != 1) {
                            return false;
                        }

                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
