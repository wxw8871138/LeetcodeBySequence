package LeetCode;

public class Q61RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return null;
        }
        int len = 1;
        ListNode cur = head;
        while (cur.next != null) {
            len++;
            cur = cur.next;
        }
        cur.next = head;
        int dis = k % len;
        if (dis == 0) {
            return head;
        }
        for (int i = 0; i < len - dis; i++) {
            head = head.next;
        }
        ListNode next = head.next;
        head.next = null;
        return next;
    }
}
