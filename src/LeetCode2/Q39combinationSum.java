package LeetCode2;

import java.util.ArrayList;
import java.util.List;

public class Q39combinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;
        List<Integer> path = new ArrayList<>();
        backTrack(res, path, 0, target, candidates);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> path, int index, int target, int[] candidates) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
    }
}
