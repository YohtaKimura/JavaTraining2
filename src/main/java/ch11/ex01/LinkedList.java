package ch11.ex01;
import ch02.ex05.Vehicle;

final class LinkedList<E> {
    public static void main(String[] arg) {
        final Vehicle hondaCar = new Vehicle(20, 30, "honda");
        final Vehicle matsudaCar = new Vehicle(30, 40, "matsuda");
        final LinkedList head = new LinkedList(hondaCar);
        final LinkedList next = new LinkedList(matsudaCar);
        head.add(next);
    }

    final E data;
    private LinkedList nextNode;

    LinkedList(final E data) {
        this.data = data;
        this.nextNode = null;
    }

    public Object getData() {
        return data;
    }

    public void add(LinkedList nextNord) {
        this.nextNode = nextNord;
    }

    public LinkedList getNextNode() {
        return nextNode;
    }
}
