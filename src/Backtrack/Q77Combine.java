package Backtrack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Q77Combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (n == 0 || k == 0 || k > n) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        backtrack(res, path, n, k, 1);
        return res;
    }

    private void backtrack(List<List<Integer>> res, Deque<Integer> path, int n, int k, int begin) {
        if (path.size()==k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <= n; i++) {
            path.addLast(i);
            backtrack(res, path, n, k, i + 1);
            path.removeLast();
        }
    }
}
