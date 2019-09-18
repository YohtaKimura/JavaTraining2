package ch02.ex06;

import ch02.ex05.Vehicle;

final class LinkedList {

    public static void main(String[] arg) {
        final Vehicle hondaCar = new Vehicle(1,20, 30, "honda");
        final Vehicle matsudaCar = new Vehicle(1, 30, 40, "matsuda");
        final LinkedList head = new LinkedList(hondaCar);
        final LinkedList next = new LinkedList(matsudaCar);
        head.add(next);
    }

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
