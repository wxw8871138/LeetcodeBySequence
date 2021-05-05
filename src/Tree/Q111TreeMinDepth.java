package Tree;

public class Q111TreeMinDepth {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if (root.left == null || root.right == null) {
            return leftDepth + rightDepth + 1;
        } else {
            return Math.min(leftDepth, rightDepth) + 1;
        }
    }
}
