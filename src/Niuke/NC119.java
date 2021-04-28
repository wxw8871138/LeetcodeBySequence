package Niuke;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class NC119 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        //最小的K个数就用大小为k的大根堆
        //遍历中，只要该元素比堆顶大，就弹出堆顶，压入该元素
        ArrayList<Integer> res = new ArrayList<>();
        int len = input.length;
        if (len < k || k == 0) {
            return res;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((i1, i2) -> i2 - i1);
        for (int i = 0; i < input.length; i++) {
            if (queue.size() < k) {
                queue.add(input[i]);
            } else if (queue.peek() > input[i]) {
                queue.poll();
                queue.add(input[i]);
            }
        }
        res = new ArrayList<>(queue);
        return res;
    }
}
