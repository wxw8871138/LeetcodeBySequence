package LeetCode;

import java.util.Arrays;

public class Q57InsertIntervals {
    //分三段判断。
    //1.在插入区间左边的，直接加入结果集。
    //2.在插入区间的，获得并集后加入结果集。
    //3.在插入区间右边的，直接加入结果集。
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length+1][2];
        int idx = 0;
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            res[idx++] = intervals[i++];
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        res[idx++] = newInterval;
        while (i < intervals.length) {
            res[idx++] = intervals[i++];
        }
        return Arrays.copyOf(res,idx);
    }

    public static void main(String[] args) {
        int[][] intervals={{1, 3}, {6, 9}};
        int[] newInterval = {2,5};
        insert(intervals,newInterval);
    }
}
