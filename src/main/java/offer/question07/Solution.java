package offer.question07;

public class Solution {
    public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int f = 1;
        int g = 0;
        for (int i = 1; i < n; i++) {
            int t = f;
            f = f + g;
            g = t;
        }

        return f;
    }
}
