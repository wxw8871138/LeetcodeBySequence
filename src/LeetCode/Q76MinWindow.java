package LeetCode;

public class Q76MinWindow {
    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "";
        }
        int[] need = new int[128];
        int[] have = new int[128];

        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        int left = 0;
        int right = 0;
        int min = s.length() + 1;
        int count = 0;
        int start = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            if (need[r] == 0) {
                right++;
                continue;
            }
            if (have[r] < need[r]) {
                count++;
            }
            have[r]++;
            right++;
            while (count == t.length()) {
                if (right - left < min) {
                    min = right-left;
                    start = left;
                }
                char l = s.charAt(left);
                if (need[l] == 0) {
                    left++;
                    continue;
                }
                if (have[l] == need[l]) {
                    count--;
                }
                have[l] --;
                left++;
            }
        }
        if (min == s.length() + 1) {
            return "";
        }
        return s.substring(start, start + min);
    }
}
