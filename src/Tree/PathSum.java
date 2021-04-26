package Tree;

import java.util.LinkedList;
import java.util.List;

public class PathSum {
    //回溯算法
    //每遍历一个节点，将其加入path,并用target减去当前节点，如果target变为0并且左右子树为空，则此条路径满足条件，加入Res
    //返回上一层之前removeLast实现回溯
    LinkedList<Integer> path = new LinkedList<>();
    LinkedList<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root,sum);
        return res;
    }

    private void dfs(TreeNode root, int target) {
        if (root==null) return;
        path.add(root.val);
        target = target-root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(path));
        }
        dfs(root.left, target);
        dfs(root.right, target);
        path.removeLast();
    }
}
