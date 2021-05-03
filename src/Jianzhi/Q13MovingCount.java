package Jianzhi;

import java.util.Arrays;

public class Q13MovingCount {
    int m;
    int n;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        int[][] matrix = new int[m][n];
        int res = dfs(0, 0, k, matrix);
        Arrays.stream(matrix).forEach(array-> System.out.println(Arrays.toString(array)));
        return res;
    }

    private int dfs(int row, int col, int k, int[][] matrix) {
        if (!isInMatrix(row, col)) {
            return 0;
        }
        if (isBiggerThanK(row, col, k)) {
            return 0;
        }
        if (matrix[row][col] != 0) {
            return 0;
        }
        matrix[row][col] = 1;
        return 1 +
                dfs(row + 1, col, k, matrix) +
                dfs(row - 1, col, k, matrix) +
                dfs(row, col + 1, k, matrix) +
                dfs(row, col - 1, k, matrix);
    }

    private boolean isBiggerThanK(int row, int col, int k) {
        int sum = 0;
        while (row != 0) {
            sum = sum + row % 10;
            row = row / 10;
        }
        while (col != 0) {
            sum = sum + col % 10;
            col = col / 10;
        }
        return sum > k;
    }

    private boolean isInMatrix(int row, int col) {
        if (row >= 0 && row <= m - 1 && col >= 0 && col <= n - 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Q13MovingCount f = new Q13MovingCount();
        System.out.println(f.movingCount(7,2,3));
    }
}
