package offer.question48;

public class Solution {
    public int Add(int num1, int num2) {
        int sum = num1 ^ num2;
        int carry = (num1 & num2) << 1;
        while (carry != 0) {
            int t = sum;
            sum = sum ^ carry;
            carry = (t & carry) << 1;
        }

        return sum;

    }
}
