package LeetCode;

public class Q73SetZerosInMatrix {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean col0Has0 = false;
        boolean row0Has0 = false;
        //第一列有0的话标识变量 col0has0变为true
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                col0Has0 = true;
                break;
            }
        }
        //第一排有0的话标识变量 row0Has0变为true
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                row0Has0 = true;
                break;
            }
        }
        //用第一排和第一列记录该排该列是否需要置0
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        //根据第一排和第一列的记录置0
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        //置0第一列
        if (col0Has0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        //置0第一排
        if (row0Has0) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}
