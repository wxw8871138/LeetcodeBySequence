package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q30FindSubstring {
    //暴力法，以子串总长度为滑窗长度，从左至右滑动，判断每个滑窗中子串的个数是否相符
    //每个滑窗判断子串的时候可以用Hashmap存每个子串的数量，这样就只用比子串个数，不用比顺序了
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
