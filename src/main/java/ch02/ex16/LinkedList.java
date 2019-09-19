package ch02.ex16;

import java.lang.StringBuilder;
import java.util.Objects;

final class LinkedList {
    // List の node をラップするようにしないと全体の要素数を数えられないと思い，ラップする実装にしました．
    private int size;
    private Node first;
    private Node last;

    LinkedList() {
        this.size = 0;
    }

    public void addFirst(final Object data) {
        if (size == 0) {
            first = new Node(data);
            last = first;
        } else {
            this.first = new Node(data, this.first);
        }
        size++;
    }

    public void addLast(final Object data) {
        if (size == 0) {
            last = new Node(data);
            first = last;
        } else {
            Node node = new Node(data);
            this.last.setNext(node);
            this.last = node;
        }
        size++;
    }

    public Object getData(int index) throws Exception {
        if (index > size-1) {
            throw new Exception();
        }

        Node current = this.first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    /* 要素数を返すメソッド */
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node current = this.first;
        str.append(current.getData().toString());
        while (Objects.nonNull(current.next)) {
            current = current.getNext();
            str.append(", " + current.getData().toString());
        }
        return str.toString();
    }

    private static class Node {
        final private Object data;
        private Node next;

        Node(final Object data, final Node next) {
            this.data = data;
            this.next = next;
        }

        Node(final Object data){
            this(data, null);
        }

        Object getData() {
            return this.data;
        }

        Node getNext() {
            return this.next;
        }

        void setNext(Node node) {
            this.next = node;
        }
    }
}
