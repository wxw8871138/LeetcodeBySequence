package LeetCode2;

import java.util.HashMap;
import java.util.Map;

public class Q146LRUCache {
    class DLinkedList{
        int key;
        int value;
        DLinkedList pre;
        DLinkedList next;

        public DLinkedList() {
        }

        public DLinkedList(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, DLinkedList> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DLinkedList head;
    private DLinkedList tail;

    public Q146LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new DLinkedList();
        tail = new DLinkedList();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        DLinkedList node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedList node = cache.get(key);
        if (node == null) {
            DLinkedList newNode = new DLinkedList(key,value);
            cache.put(key, newNode);
            addToHead(newNode);
            size++;
            if (size > capacity) {
                DLinkedList tail = removeTail();
                cache.remove(tail.key);
                size--;
            }
        } else {
            moveToHead(node);
            node.value = value;
        }
    }

    private DLinkedList removeTail() {
        DLinkedList node = tail.pre;
        node.pre.next = node.next;
        node.next.pre = node.pre;
        return node;
    }

    private void moveToHead(DLinkedList node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
        addToHead(node);
    }

    private void addToHead(DLinkedList node) {
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }
}
