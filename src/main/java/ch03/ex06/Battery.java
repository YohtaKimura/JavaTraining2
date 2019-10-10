package ch03.ex06;

class Battery extends EnergySource{
    final static int MAX_VOLUME = 100;

    Battery() {
        currentVolume = MAX_VOLUME;
    }
    @Override
    boolean isEmpty() {
        return currentVolume == 0;
    }

    void chargeMax() {
        currentVolume = MAX_VOLUME;
    }

    void use(int usage) {
        if (currentVolume - usage < 0) {
            throw new IllegalArgumentException("Too use to done your task");
        }
        currentVolume -= usage;
    }
}
