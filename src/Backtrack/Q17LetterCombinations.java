package Backtrack;

import java.util.ArrayList;
import java.util.List;

public class Q17LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        int len = digits.length();
        if (len == 0) {
            return res;
        }
        String[] digitMap = {""," ","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        findCombinations(digits, digitMap, 0, "", res);
        return res;
    }

    private void findCombinations(String digits, String[] digitMap, int begin, String pre, List<String> res) {
        if (begin == digits.length()) {
            res.add(pre);
            return;
        }
        String nextStr = digitMap[digits.charAt(begin)];
        int len = nextStr.length();
        for (int i = 0; i < len; i++) {
            findCombinations(digits, digitMap, begin + 1, pre + nextStr.charAt(i), res);
        }
    }
}
