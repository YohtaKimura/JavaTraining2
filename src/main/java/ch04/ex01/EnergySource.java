package ch04.ex01;

abstract class EnergySource {
    final static int MAX_VOLUME = 100;
    int currentVolume;

    abstract boolean isEmpty();

    void fillMax() {
        currentVolume = MAX_VOLUME;
    }

    void use(int usage) {
        if (currentVolume - usage < 0) {
            throw new IllegalArgumentException("Too use to done your task");
        }
        currentVolume -= usage;
    }
}
