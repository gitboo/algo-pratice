package leetcode.N010_MinStack;

import java.util.*;
import java.lang.*;

class MinStack {

    private Stack<Integer> stack;
    Integer min = null;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min == null) {
            min = x;
        }
        min = Math.min(x, min);
    }

    public void pop() {
        int peek = stack.pop();

        if (min == peek) {
            min = Integer.MAX_VALUE;
            stack.forEach(
                    e -> {
                        min = Math.min(min, e);
                    }
            );
        }
    }
    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;

    }
}


