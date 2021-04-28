package Niuke;

import java.util.HashMap;

public class NC41MaxNonRepeatSubArray {
    //其实是一个滑窗，用hashMap记录每个元素出现的下标，如果遇到重复的就看重复的是否在滑窗内
    //如果在滑窗内就arr[i]++
    //否则不变，继续遍历
    public int maxLength (int[] arr) {
        int len =arr.length;
        int res = 0;
        int start = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(arr[i])) {
                start = Math.max(start, map.get(arr[i])+1);
            }
            res = Math.max(res, i - start + 1);
            map.put(arr[i], i);
        }
        return res;
    }
}
