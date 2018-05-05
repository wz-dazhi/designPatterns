package com.wz.dp.iterator;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.iterator
 * @className: Node
 * @description:
 * @author: wangzhi
 * @createDate: 2018/5/5 15:54
 **/
public class Node {
    private Object data;
    private Node next;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(Object data, Node next) {

        this.data = data;
        this.next = next;
    }
}
