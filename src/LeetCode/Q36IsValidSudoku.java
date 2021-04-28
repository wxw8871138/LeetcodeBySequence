package LeetCode;

import java.util.HashMap;

public class Q36IsValidSudoku {
    //用三个二维数分别表示行，列，3*3正方形中各数字是否出现，
    //比如row[2][3]=1表示第二排3出现了一次。
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][10];
        int[][] col = new int[9][10];
        int[][] box = new int[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int curNum = board[i][j] - '0';
                int[] boxNum = box[j / 3 + (i / 3) * 3];
                if (row[i][curNum] == 1 || col[j][curNum] == 1 || boxNum[curNum] == 1) {
                    return false;
                }
                row[i][curNum] = 1;
                col[j][curNum] = 1;
                boxNum[curNum] = 1;
            }
        }
        return true;
    }
}
