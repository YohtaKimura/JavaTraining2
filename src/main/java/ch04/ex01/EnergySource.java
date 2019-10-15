package ch04.ex01;

abstract class EnergySource implements IEnergySource{
    final static int MAX_VOLUME = 100;
    int currentVolume;

    abstract public boolean isEmpty();

    public void fillMax() {
        currentVolume = MAX_VOLUME;
    }

    public void use(int usage) {
        if (currentVolume - usage < 0) {
            throw new IllegalArgumentException("Too use to done your task");
        }
        currentVolume -= usage;
    }
}
