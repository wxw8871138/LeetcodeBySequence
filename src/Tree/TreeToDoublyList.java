package Tree;

public class TreeToDoublyList {
    //二叉搜索树的遍历顺序是中序遍历，所以使用中序遍历的dfs。在dfs中：
    //1. 当 pre 为空时： 代表正在访问链表头节点，记为 head ；
    //2. 当 pre 不为空时： 修改双向节点引用，即 pre.right = cur ， cur.left = pre ；
    //3. 保存 cur ： 更新 pre = cur ，即节点 cur 是后继节点的 pre ；
    //dfs结束后，head指向头节点，pre指向尾节点，使其双向引用，最后返回head
    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void dfs(Node curr) {
        if (curr == null) return;
        dfs(curr.left);
        if (pre != null) {
            pre.right = curr;
        } else {
            head = curr;
        }
        curr.left = pre;
        pre = curr;
        dfs(curr.right);
    }

}
