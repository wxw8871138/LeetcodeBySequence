package LeetCode;

import java.util.HashMap;

//滑窗加Hashmap
public class Q3LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0; i < n; i++) {
            char alpha = s.charAt(i);
            if (map.containsKey(alpha)) {
                left = Math.max(map.get(alpha) + 1, left);
            }
            res = Math.max(res, i - left + 1);
            map.put(s.charAt(i), i);
        }
        return res;
    }
}
