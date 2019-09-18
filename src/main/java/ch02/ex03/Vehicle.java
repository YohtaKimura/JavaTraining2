package ch02.ex03;

final class Vehicle {
    final static int VEHCLE_ID = 0;

    final int carId;
    final int currentVelocity;
    final double direction;
    final String ownerName;

    Vehicle(int carId, int currentVelocity, double direction, String ownerName) {
        this.carId = carId;
        this.currentVelocity = currentVelocity;
        this.direction = direction;
        this.ownerName = ownerName;
    }

    public int getCarId() {
        return carId;
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

    public static int getVehcleId() {
        return VEHCLE_ID;
    }
}
