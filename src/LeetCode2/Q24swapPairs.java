package LeetCode2;

public class Q24swapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode rest = head.next.next;
        ListNode next = head.next;
        next.next = head;
        head.next = swapPairs(rest);
        return next;
    }
}
