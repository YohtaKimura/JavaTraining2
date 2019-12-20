package ch14.ex03;

class MultiThreadSaverOfResult {
    private AddingStore addingStore;
    private Thread thread1;
    private Thread thread2;
    private Thread thread3;
    MultiThreadSaverOfResult() {
        addingStore = new AddingStore();
        thread1 = new Thread(addingStore);
        thread2 = new Thread(addingStore);
        thread3 = new Thread(addingStore);
    }

    void start() {
        thread1.start();
        thread2.start();
        thread3.start();
    }

    void print() {
        addingStore.print();
    }
}
