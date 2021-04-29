package LeetCode;

public class Q72MinDistance {
    //动态规划，用dp[i][j]表示word1[1-i]到word2[1-j]需要的次数
    //dp[i-1][j]到dp[i][j]因为少了一个，所以直接添加一个，dp[i][j] = dp[i - 1][j] + 1
    //dp[i][j-1]到dp[i][j]同理
    //dp[i-1][j-1]到dp[i][j]不需要插入和删除，只用看当前字符是否相等，不相等修改+1,相等不动。
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        if (n == 0 || m == 0) {
            return n + m;
        }
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < m + 1; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int left = dp[i - 1][j] + 1;
                int down = dp[i][j - 1] + 1;
                int left_down = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    left_down++;
                }
                dp[i][j] = Math.min(left, Math.min(down, left_down));
            }
        }
        return dp[n][m];
    }
}
