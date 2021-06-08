package LeetCode2;

import java.util.HashMap;
import java.util.Stack;

public class Q20isbracketValid {
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character alpha = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(alpha);
            }
            else if (alpha.equals(map.get(stack.peek()))) {
                stack.pop();
            }else {
                stack.push(alpha);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        isValid("([)]");
    }
}
