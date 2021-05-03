package Jianzhi;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q41MedianFinder {
    Queue<Integer> A,B;

    public Q41MedianFinder() {
        A = new PriorityQueue<>();
        B = new PriorityQueue<>((i1, i2) -> i2 - i1);
    }

    public void addNum(int num) {
        if (A.size() != B.size()) {
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
    }
}
