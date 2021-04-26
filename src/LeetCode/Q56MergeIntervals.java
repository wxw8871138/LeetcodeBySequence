package LeetCode;

import java.util.Arrays;

public class Q56MergeIntervals {
    //先按区间的最小值排序，排序之后其实一共只有两种情况，要么两个区间不交叉，那么就放入新的int[][]中，如果交叉，就更新右边为较大的值。
    //注意起始idx设为-1更方便起始时直接放入第一段数。
    public int[][] merge(int[][] intervals) {
        //先按照区间起始排序
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        //遍历区间
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            //如果不交叉，直接new然后放入res.
            if (idx == -1 || interval[0] > res[idx][1]) {
                res[++idx] = interval;
            } else {
                //如果交叉，直接更新右边的值为较大值。
                res[idx][1] = Math.max(res[idx][1],interval[1]);
            }
        }
        return Arrays.copyOf(res,idx+1);
    }
}
