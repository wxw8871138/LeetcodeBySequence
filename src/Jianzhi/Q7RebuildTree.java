package Jianzhi;

import java.util.HashMap;

public class Q7RebuildTree {
    int[] preorder;
    HashMap<Integer,Integer> inorderMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }

    private TreeNode recur(int preIdx, int inLeftIdx, int inRightIdx) {
        if (inLeftIdx > inRightIdx) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIdx]);
        int inRootIdx = inorderMap.get(preorder[preIdx]);
        root.left = recur(preIdx + 1, inLeftIdx, inRootIdx - 1);
        root.right = recur(preIdx + 1 + inRootIdx - inLeftIdx, inRootIdx + 1, inRightIdx);
        return root;
    }
}
