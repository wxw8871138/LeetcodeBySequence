package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Q17MobileKeyboardCombination {
    //可以用回溯，也能用队列
    String[] letter_map = {
            " ","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };

    //队列解法
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits==null||digits.length()==0){
            return res;
        }

        res.add("");
        for (int i = 0; i < digits.length(); i++) {
            String letters = letter_map[digits.charAt(i)-'0'];
            int size = res.size();
            for (int j = 0; j < size; j++) {
                String tmp = res.remove(0);
                for (int k = 0; k < letters.length(); k++) {
                    res.add(tmp + letters.charAt(k));
                }
            }
        }
        return res;
    }

    //回溯
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations2(String digits) {
        if (digits == null || digits.length() == 0) {
            return res;
        }
        backTrack(digits, new StringBuilder(), 0);
        return res;
    }

    private void backTrack(String str, StringBuilder letter, int index) {
        if (index == str.length()) {
            res.add(letter.toString());
            return;
        }
        char c = str.charAt(index);
        int pos = c - '0';
        String mapString = letter_map[pos];
        for (int i = 0; i < mapString.length(); i++) {
            letter.append(mapString.charAt(i));
            backTrack(str, letter, index + 1);
            letter.deleteCharAt(letter.length()-1);
        }
    }
}
