package LeetCode;

public class Q38CountAndSay {
    public String countAndSay(int n) {
        //TODO
        String[] dp = new String[n];
        dp[0] = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < dp[i-1].length(); j++) {

            }
        }
        return dp[n-1];
    }
}
