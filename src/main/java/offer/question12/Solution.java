package offer.question12;

public class Solution {
    public double Power(double base, int exponent) {
        boolean negative = exponent < 0;
        exponent = Math.abs(exponent);
        double ret = 1.0;

        while (exponent != 0) {
            if (exponent % 2 == 1) {
                ret = ret * base;
            }

            base = base * base;
            exponent = exponent / 2;
        }

        return negative ? 1.0 / ret : ret;

    }
}
