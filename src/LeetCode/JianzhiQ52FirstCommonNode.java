package LeetCode;

public class JianzhiQ52FirstCommonNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        //a = a != null ? a.next : headB 而不是 a = a.next != null ? a.next : headB
        //是因为走到最后还会走到null这个点，然后再去B头。如果A和B同时走到null，说明没有公共节点。
        while (a != b) {
            a = a != null ? a.next : headB;
            b = b != null ? b.next : headA;
        }
        return a;
    }
}
