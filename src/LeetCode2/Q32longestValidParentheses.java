package LeetCode2;

import java.util.Stack;

public class Q32longestValidParentheses {
    public int longestValidParentheses(String s) {
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
                res++;
            }
        }
        return res;
    }
}
