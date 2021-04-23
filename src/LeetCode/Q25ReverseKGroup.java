package LeetCode;


public class Q25ReverseKGroup {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //可以递归，也可以从前到后分段翻转
    //分段翻转，翻转前先切分段，通过循环k次的方法找到每段的end,保存end.next后断开end和next,对每段进行翻转。
    //每段通过preNode,currNode,nextNode来进行翻转，并且返回翻转后的最后一个node.
    //每段翻转结束后通过上一段的pre和下一个节点next进行连接。
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0,head);
        ListNode pre = dummy;
        ListNode end = dummy;
        while (end.next != null) {
            for (int i = 0; i < k&&end!=null; i++) {
                end = end.next;
            }
            if (end == null) break;
            ListNode next = end.next;
            end.next = null;
            ListNode start = pre.next;
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = start;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preNode = null;
        ListNode currNode = head;
        ListNode nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        return preNode;
    }
}
