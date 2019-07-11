package offer.question20;

import java.util.Stack;

public class Solution {
    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();


    public void push(int node) {
        dataStack.push(node);
        if (minStack.isEmpty()) {
            minStack.push(node);
        } else {
            minStack.push(node < minStack.peek() ? node : minStack.peek());
        }

    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();

    }

    public int min() {
        return minStack.peek();
    }
}
