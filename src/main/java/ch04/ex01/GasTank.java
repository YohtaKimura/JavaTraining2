package ch04.ex01;

class GasTank extends EnergySource {
    final static int MAX_VOLUME = 100;

    GasTank() {
        currentVolume = 0;
    }

    @Override
    public boolean isEmpty() {
        return currentVolume == 0;
    }

    public void use(int usage) {
        if (currentVolume - usage < 0) {
            throw new IllegalArgumentException("Too use to done your task");
        }
        currentVolume -= usage;
    }
}
