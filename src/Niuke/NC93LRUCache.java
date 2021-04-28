package Niuke;

import java.util.HashMap;

public class NC93LRUCache {
    class DListNode{
        DListNode pre;
        DListNode next;
        int val;
        int key;

        public DListNode() {
        }

        public DListNode(int val, int key) {
            this.val = val;
            this.key = key;
        }
    }
    HashMap<Integer,DListNode> hashMap;
    DListNode head;
    DListNode tail;
    int size;
    int capacity;
    public NC93LRUCache(int capacity) {
        this.size=0;
        this.capacity = capacity;
        hashMap = new HashMap<>();
        head = new DListNode();
        tail = new DListNode();
        head.next = tail;
        tail.pre = head;

    }

    public int get(int key) {
        if (hashMap.containsKey(key)) {
            DListNode node = hashMap.get(key);
            MoveToHead(node);
            return node.val;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        DListNode node = hashMap.get(key);
        if (node == null) {
            node = new DListNode();
            node.key = key;
            hashMap.put(key,node);
            size++;
        }else {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        node.val = value;
        removeNode(node);
        MoveToHead(node);
        if (size > capacity) {
            DListNode removedNode = removeTail();
            hashMap.remove(removedNode.key);
            size--;
        }
    }

    private DListNode removeTail() {
        DListNode removedNode = tail.pre;
        removeNode(removedNode);
        return removedNode;
    }

    private void MoveToHead(DListNode node) {
        node.next = head.next;
        node.next.pre = node;
        head.next = node;
        node.pre = head;
    }

    private void removeNode(DListNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
}
