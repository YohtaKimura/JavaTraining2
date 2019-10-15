package ch04.ex01;

public interface IEnergySource {
    abstract boolean isEmpty();

    abstract void fillMax();

    abstract void use(int usage) throws IllegalArgumentException;
}
