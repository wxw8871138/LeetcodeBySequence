package Jianzhi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q6ReversePrintLinkedlist {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop().val;
        }
        return res;
    }

    private void addToList(List<Integer> list, ListNode head) {

    }
}
