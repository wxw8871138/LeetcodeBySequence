package LeetCode2;

import java.util.PriorityQueue;

public class Q23mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode pre = new ListNode(0);
        ListNode dummy = pre;
        PriorityQueue<ListNode> queue = new PriorityQueue<>((l1, l2) -> l1.val - l2.val);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                queue.add(lists[i]);
            }
        }
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            pre.next = node;
            pre = pre.next;
            if (node.next != null) {
                queue.add(node.next);
            }
        }
        return dummy.next;
    }
}
