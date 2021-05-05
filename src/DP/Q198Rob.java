package DP;

public class Q198Rob {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len+1];
        dp[1] = nums[0];
        for (int i = 2; i < len + 1; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i-1]);
        }
        return dp[len];
    }
}
