package LeetCode;

public class Q63UniquePathsWithObstacles {
    //第一排和第一列如果遇到障碍，那后面的点都应该是不能到达的
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowLen = obstacleGrid.length;
        int colLen = obstacleGrid[0].length;
        int[][] dp = new int[rowLen][colLen];
        for (int i = 0; i < rowLen; i++) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0]=1;
            }else {
                break;
            }
        }
        for (int i = 0; i < colLen; i++) {
            if (obstacleGrid[0][i] == 0) {
                dp[0][i] = 1;
            } else {
                break;
            }
        }
        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[rowLen - 1][colLen - 1];
    }
}
