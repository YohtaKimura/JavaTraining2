package ch14.ex04;

final class AddingStore implements Runnable{
    private static int currentValue;
    synchronized static void operate(final int value) {
        synchronized (Integer.valueOf(value)) {
            currentValue += value;
            System.out.println(currentValue);
        }
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
