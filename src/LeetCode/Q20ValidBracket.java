package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q20ValidBracket {
    //用栈的思想，可以把匹配的对放在map里
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<Character,Character>(){{
            put('{','}'); put('[',']'); put('(',')');
        }};

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character alpha = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(alpha);
            }
            else if (alpha.equals(map.get(stack.peek()))){
                stack.pop();
            }else {
                stack.push(alpha);
            }
        }
        return stack.isEmpty();
    }
}
