package LeetCode;

public class Q28StrStr {
    //实现index of()
    public int strStr(String haystack, String needle) {
        if (needle.length()==0){
            return 0;
        }
        int len = haystack.length();
        for (int i = 0; i < len; i++) {
            if (haystack.substring(i, len).startsWith(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "a".substring(0,1);
        System.out.println(str);
    }
}
