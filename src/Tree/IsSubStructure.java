package Tree;

public class IsSubStructure {

    //双递归
    //第一层递归:判断当前层是否相等，A左B左是否相等，A右B右是否相等，全部相等直接返回true，否则递归判断A.left和B，A.right和B
    //第二层递归：判断两根节点是否相等：
    //1. 当节点 BB 为空：说明树 BB 已匹配完成（越过叶子节点），因此返回 true ；
    //2. 当节点 AA 为空：说明已经越过树 AA 叶子节点，即匹配失败，返回 false ；
    //3. 当节点 AA 和 BB 的值不同：说明匹配失败，返回 false ；

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        if (A.val == B.val && recur(A.left, B.left) && recur(A.right, B.right)) {
            return true;
        }
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean recur(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            return recur(root1.left,root2.left) && recur(root1.right,root2.right);
        }else {
            return false;
        }
    }

}
