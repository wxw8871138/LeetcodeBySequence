package LeetCode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q56mergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        int[][] res = new int[intervals.length][2];
        int index = -1;
        for (int i=0; i < intervals.length; i++) {
            if (index == -1 || intervals[i][0] > res[index][1]) {
                index++;
                res[index] = intervals[i];
            } else {
                res[index][1] = Math.max(res[index][1], intervals[i][1]);
            }
        }
        return Arrays.copyOf(res, index + 1);
    }
}
