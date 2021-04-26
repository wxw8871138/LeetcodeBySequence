package LeetCode;

import java.util.Stack;

public class Q32LongestValidParentheses {
    //通过栈保存每个符号的下标，如果遇到匹配的就弹出一对，当前下标-弹出后顶的下标就是最长。
    public int longestValidParentheses(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            }
            else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                }else {
                    res = Math.max(res,i-stack.peek());
                }
            }
        }
        return res;
    }

}
