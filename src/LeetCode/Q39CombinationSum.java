package LeetCode;

import java.util.*;

public class Q39CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len=candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>();
        dfs(res, path, candidates, target, len, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, Deque<Integer> path, int[] candidates, int target, int len, int depth) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (target - candidates[i] < 0) {
                break;
            }
            path.addLast(candidates[i]);
            dfs(res, path, candidates, target-candidates[i], len, i);
            path.removeLast();
        }


    }
}
