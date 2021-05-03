package Jianzhi;

import java.util.PriorityQueue;

public class Q40SmallestKNums {
    public int[] getLeastNumbers(int[] arr, int k) {
        int len = arr.length;
        if (arr == null || len <k || k==0) {
            return new int[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((i1, i2) -> i2 - i1);
        for (int i = 0; i < len; i++) {
            if (queue.size() < k) {
                queue.add(arr[i]);
            } else if (arr[i] < queue.peek()) {
                queue.poll();
                queue.add(arr[i]);
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}
