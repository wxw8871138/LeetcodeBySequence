package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q30FindSubstring {
    public List<Integer> findSubstring(String s, String[] words) {
        //TODO
        List<Integer> res = new ArrayList<>();
        int wordNum =words.length;
        if (wordNum == 0) {
            return res;
        }
        int wordLen = words[0].length();
        HashMap<String,Integer> allWords = new HashMap<>();
        for (String w : words) {
            allWords.put(w,allWords.getOrDefault(w,0)+1);
        }
        for (int i = 0; i < s.length() - wordNum * wordLen + 1; i++) {
            HashMap<String, Integer> hasWords = new HashMap<>();
            int num=0;
            while (num < wordNum) {

            }
        }
        return res;
    }
}
