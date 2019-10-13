package ch03.ex09;

class Garage implements Cloneable {
    Vehicle storedVehicle[];

    @Override
    public Garage clone() throws CloneNotSupportedException {
        Garage clone = (Garage) super.clone();

    }
}
