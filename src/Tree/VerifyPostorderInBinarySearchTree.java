package Tree;

public class VerifyPostorderInBinarySearchTree {
    //后续遍历的根节点是最后一个元素，所以比最后一个元素小的是左子树，比最后一个大的是右子树，找到分隔点后通过和根节点比较验证左右子树
    //递归验证左右子树
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    public boolean recur(int[] postorder, int begin, int end) {
        //结束条件
        if (end <= begin) {
            return true;
        }
        //end为根节点，找左右子树的分界
        int i = begin;
        //找边界，并同时判断了左子树都小于根节点
        for (; i < end; i++) {
            if (postorder[i]>postorder[end]) break;
        }
        //判断右子树是否有小于根的
        for (int j = i+1; j < end; j++) {
            if (postorder[j]<postorder[end]) return false;
        }
        return recur(postorder,begin,i-1) && recur(postorder,i,end-1);
    }
}
