package ch14.ex03;

final class AddingStore implements Runnable{
    private int currentValue;
    void operate(final int value) {
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
