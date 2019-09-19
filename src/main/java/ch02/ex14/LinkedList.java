package ch02.ex14;

import ch02.ex10.Vehicle;

final class LinkedList {
    public static LinkedList makeVehicleList() {
        final Vehicle hondaCar = new Vehicle(20, 30, "honda");
        final Vehicle matsudaCar = new Vehicle(30, 40, "matsuda");
        final LinkedList head = new LinkedList(hondaCar);
        final LinkedList next = new LinkedList(matsudaCar);
        head.add(next);
        return head;
    }

    // 内部の data は不変であるべきだと思います．nextNode はリストの繋ぎ変えを考えると可変であるべきだと思います．
    final Object data;
    private LinkedList nextNode;

    LinkedList(Object data) {
        this.data = data;
        this.nextNode = null;
    }

    public Object getData() {
        return data;
    }

    public void add(LinkedList nextNode) {
        this.nextNode = nextNode;
    }

    public LinkedList getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedList node) {
        this.nextNode = node;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
