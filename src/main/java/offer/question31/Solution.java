package offer.question31;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n < 1) {
            return 0;
        }

        int ret = 0;
        int digit = 1;
        while (digit <= n) {
            int post = n % digit;
            int middle = (n / digit) % 10;
            int pre = n / (digit * 10);
            if (middle == 0) {
                ret += pre * digit;
            } else if (middle == 1) {
                ret += (pre * digit + post + 1);
            } else {
                ret += (pre + 1) * digit;
            }
            digit *= 10;
        }

        return ret;

    }

}
