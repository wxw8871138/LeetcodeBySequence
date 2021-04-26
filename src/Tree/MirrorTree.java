package Tree;

public class MirrorTree {
    //很巧妙! 从下到上递归，左子树==mirrorTree(右子树)，返回根节点，当根节点==Null终止递归。
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = mirrorTree(root.right);
        TreeNode right = mirrorTree(root.left);
        root.left = left;
        root.right = right;
        return root;
    }
}
