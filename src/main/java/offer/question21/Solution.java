package offer.question21;

import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || pushA.length == 0 || popA == null || popA.length == 0 || pushA.length != popA.length) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && popA[index] == stack.peek()) {
                index++;
                stack.pop();
            }
        }

        return stack.isEmpty();

    }

}
