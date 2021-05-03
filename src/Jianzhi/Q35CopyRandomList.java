package Jianzhi;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Q35CopyRandomList {
    //HashMap储存新老对应node法，时间O（N），空间O（N）
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            Node newNode = map.get(curr);
            newNode.next = map.get(curr.next);
            newNode.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }

    //拼接链表再拆分
    public Node copyRandomList2(Node head) {
        if (head == null) {
            return null;
        }

        Node cur = head;
        while (cur != null) {
            Node newNode = new Node(cur.val);
            newNode.next = cur.next;
            cur.next = newNode;
            cur = newNode.next;
        }

        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                //中心思想！
                cur.next.random = cur.random.next;
            }
            //注意是next.next
            cur = cur.next.next;
        }

        cur = head.next;
        Node pre = head;
        Node res = head.next;
        while (cur.next != null) {
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;
        return res;
    }
}
