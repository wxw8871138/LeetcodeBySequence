package LeetCode2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17letterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        Map<Character, String> map = new HashMap<Character,String>(){
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
        backtrack(res, map, digits, 0, new StringBuilder());
        return res;
    }

    private void backtrack(List<String> res, Map<Character, String> map, String digits, int index, StringBuilder stringBuilder) {
        if (index == digits.length()) {
            res.add(stringBuilder.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = map.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                stringBuilder.append(letters.charAt(i));
                backtrack(res, map, digits, index + 1, stringBuilder);
                stringBuilder.deleteCharAt(index);
            }
        }
    }
}
