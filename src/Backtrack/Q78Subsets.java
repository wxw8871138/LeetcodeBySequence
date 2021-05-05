package Backtrack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Q78Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        backtrack(nums, res, path, len, 0);
        return res;
    }

    private void backtrack(int[] nums, List<List<Integer>> res, Deque<Integer> path, int len, int begin) {
        res.add(new ArrayList<>(path));
        for (int i = begin; i < len; i++) {
            path.add(nums[i]);
            backtrack(nums, res, path, len, i + 1);
            path.removeLast();
        }
    }
}
