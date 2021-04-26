package Tree;

public class IsSymmetric {
    //因为要对比左右两棵子树，所以递归参数为root1,root2
    //终止条件：1. 当左右同时递归至Null说明左右是相等，返回true
    //2. 当左右某个先至Null或者左右值不相等说明左右不相等，返回false
    //递归根节点的左右子树。
    public boolean isSymmetric(TreeNode root) {
        return recur(root, root);
    }

    private boolean recur(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        return recur(root1.left,root2.right) && recur(root1.right,root2.left);
    }
}
