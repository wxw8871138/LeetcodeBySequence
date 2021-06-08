package LeetCode2;

public class Q28strStr {
    public int strStr(String haystack, String needle) {
        if (needle.equals("") || needle == null) {
            return 0;
        }
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength > haystackLength) {
            return -1;
        }
        for (int i = 0; i < haystackLength; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                for (; j < needleLength; j++) {
                    if (i + j >= haystackLength) {
                        break;
                    }
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == needleLength) {
                    return i;
                }
            }
        }
        return -1;
    }
}
