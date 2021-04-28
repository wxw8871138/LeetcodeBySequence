package LeetCode;

import java.util.Stack;

public class Q42TrapRain {
    public int trap(int[] height) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int current = 0; current < height.length; current++) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int h = height[stack.peek()];
                stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int distance = current - stack.peek() - 1;
                int min = Math.min(height[stack.peek()], height[current]);
                sum = sum + distance * (min - h);
            }
            stack.push(current);
        }
        return sum;
    }
}
