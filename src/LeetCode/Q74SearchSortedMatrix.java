package LeetCode;

public class Q74SearchSortedMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length-1;
        int n = 0;
        while (m >= 0 && n <= matrix[0].length-1) {
            if (matrix[m][n] == target) {
                return true;
            } else if (matrix[m][n] > target) {
                m--;
            } else {
                n++;
            }
        }
        return false;
    }
}
