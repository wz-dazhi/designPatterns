package com.wz.dp.iterator;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.iterator
 * @className: LinkedList
 * @description:
 * @author: wangzhi
 * @createDate: 2018/5/5 15:54
 **/
public class LinkedList implements Collection {
    /**
     * 头
     */
    private Node head = null;
    /**
     * 尾
     */
    private Node tail;
    private int index = 0;

    @Override
    public void add(Object o) {
        Node node = new Node(o, null);
        // 如果head为空,说明添加的是第一个节点
        if (head == null) {
            head = node;
            tail = node;
        }
        // head不为空的时候,就往尾部添加节点
        tail.setNext(node);
        tail = node;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {
        private int currentIndex = 0;

        @Override
        public Object next() {
            Object o = head.getData();
            head = head.getNext();
            currentIndex++;
            return o;
        }

        @Override
        public boolean hasNext() {
            if (currentIndex >= index) return false;
            else return true;
        }
    }
}
