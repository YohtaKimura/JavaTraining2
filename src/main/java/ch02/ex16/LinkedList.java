package ch02.ex16;

import java.util.Objects;

final class LinkedList {
    // List 内要素数を返すことを考えると List の node をラップするようにした方がメソッドの設計が楽かと思い，ラップする実装にしました．
    private int size;
    private Node first;

    LinkedList() {
        this.size = 0;
    }

    public void addFirst(final Object data) {
        if (Objects.isNull(first)) {
            first = new Node(data);
        } else {
            this.first = new Node(data, this.first);
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
        return this.first.getData().toString();
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
    }
}
