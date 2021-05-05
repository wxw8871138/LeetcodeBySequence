package Backtrack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Q39CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        backtrack(candidates, target, res, path, len, 0);
        return res;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> res, Deque<Integer> path, int len, int begin) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < len; i++) {
            path.addLast(candidates[i]);
            backtrack(candidates, candidates[i] - target, res, path, len, begin);
            path.removeLast();
        }
    }

}
