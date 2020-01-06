package ch14.ex05;

final class AddingStore implements Runnable{
    private static int currentValue;
    private boolean islocked = false;
    synchronized void operate(final int value) {
        while (islocked) {
            // Infinite loop.
        }
        islocked = true;
        synchronizedAdd(value);
        islocked = false;
    }

    private void synchronizedAdd(int value) {
        currentValue += value;
        System.out.println(currentValue);
    }

    public void print() {
        System.out.println(currentValue);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            operate(1);
        }
    }
}
