package ch14.ex02;

import java.util.ArrayDeque;
import java.util.Queue;

class PrintQueue {
    private final Queue printQueue = new ArrayDeque();

    void add(final PrintJob job) {
        printQueue.add(job);
    }

    PrintJob remove() {
        return (PrintJob) printQueue.remove();
    }
}
