package LeetCode;

public class Q58LengthOfLastWord {
    //指针从后向前遍历，
    //如果尾部有0，跳过。记此下标为End
    //如果跳过0后出界，返回0
    //如果跳过0后遇到字符，标记指针最后停的下标为start。
    //返回end-start
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) {
            return 0;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end-start;
    }
}
