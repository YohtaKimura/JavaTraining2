package ch04.ex01;

class Battery extends EnergySource{
    final static int MAX_VOLUME = 100;

    Battery() {
        currentVolume = MAX_VOLUME;
    }
    @Override
    public boolean isEmpty() {
        return currentVolume == 0;
    }

    void chargeMax() {
        currentVolume = MAX_VOLUME;
    }

    public void use(int usage) {
        if (currentVolume - usage < 0) {
            throw new IllegalArgumentException("Too use to done your task");
        }
        currentVolume -= usage;
    }
}
