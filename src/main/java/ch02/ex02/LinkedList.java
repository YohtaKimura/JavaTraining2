package ch02.ex02;

final class LinkedList {
    final Object data;
    private LinkedList nextNord;

    LinkedList(Object data) {
        this.data = data;
        this.nextNord = null;
    }

    public Object getData() {
        return data;
    }

    public void add(LinkedList nextNord) {
        this.nextNord = nextNord;
    }

    public LinkedList getNextNord() {
        return nextNord;
    }
}
