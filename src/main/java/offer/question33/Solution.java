package offer.question33;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }

        int[] ugly = new int[index];
        ugly[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;

        for (int i = 1; i < index; i++) {
            ugly[i] = Math.min(2 * ugly[index2], Math.min(3 * ugly[index3], 5 * ugly[index5]));
            if (ugly[i] == 2 * ugly[index2]) {
                index2++;
            }
            if (ugly[i] == 3 * ugly[index3]) {
                index3++;
            }
            if (ugly[i] == 5 * ugly[index5]) {
                index5++;
            }
        }

        return ugly[index - 1];
    }
}
