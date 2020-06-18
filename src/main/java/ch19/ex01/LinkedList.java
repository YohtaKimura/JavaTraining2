package ch19.ex01;

import java.util.Objects;

/**
 * Provides an element of linked list.
 */
public final class LinkedList {
    /** Size of this list */
    private int size;
    /** First element */
    private Node first;
    /** last element */
    private Node last;

    /**
	 * Initialize element.
	 */
    LinkedList() {
        this.size = 0;
    }

    /**
	 * Add element on first node.
	 *
	 * @param data data
	 */
    public void addFirst(final Object data) {
        if (size == 0) {
            first = new Node(data);
            last = first;
        } else {
            this.first = new Node(data, this.first);
        }
        size++;
    }

    /**
	 * Add element on last node.
	 *
	 * @param data data
	 */
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

    /**
	 * Get object from node.
	 *
	 * @param index index
	 * @throws Exception if index is invalid
     * @return data
	 */
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

    /**
	 * Get size of list.
     *
     * @return size
	 */
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
