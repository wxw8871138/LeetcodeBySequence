package LeetCode;

public class Q14LongestCommonPrefix {
    //让第一个字符串=res，然后依次和另外的字符串比较，当有不等的时候更新res，如果res=""，直接返回。
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < res.length() && j < strs[i].length(); j++) {
                if (res.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            res = res.substring(0, j);
            if (res.equals("")) return res;
        }
        return res;
    }
}
