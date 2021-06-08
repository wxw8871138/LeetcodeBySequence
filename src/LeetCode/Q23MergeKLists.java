package LeetCode;

import java.util.PriorityQueue;

public class Q23MergeKLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //使用priorityQueue, 通过初始化后的priorityQueue是否为空来进行特判
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode pre = new ListNode();
        ListNode head = pre;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((n1, n2) -> n1.val - n2.val);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) pq.add(lists[i]);
        }
        if (pq.isEmpty()) return null;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            head.next = node;
            if (node.next != null) pq.add(node.next);
            head = head.next;
        }
        return pre.next;
    }
}
