package ch02.ex01;

final class Vehicle {
    final int currentVelocity;
    final double direction;
    final String ownerName;

    Vehicle(int currentVelocity, double direction, String ownerName) {
        this.currentVelocity = currentVelocity;
        this.direction = direction;
        this.ownerName = ownerName;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public double getDirection() {
        return direction;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
