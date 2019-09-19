package ch02.ex06;

import ch02.ex05.Vehicle;

final class LinkedList {

    public static void main(String[] arg) {
        LinkedList head = LinkedList.makeVehicleList();
    }

     public static LinkedList makeVehicleList() {
        final Vehicle hondaCar = new Vehicle(20, 30, "honda");
        final Vehicle matsudaCar = new Vehicle(30, 40, "matsuda");
        final LinkedList head = new LinkedList(hondaCar);
        final LinkedList next = new LinkedList(matsudaCar);
        head.add(next);
        return head;
    }

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
}
