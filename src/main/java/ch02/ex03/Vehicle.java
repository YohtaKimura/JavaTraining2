package ch02.ex03;

final class Vehicle {
    private static int VEHICLE_ID = 0;

    final int carId;
    final int currentVelocity;
    final double direction;
    final String ownerName;

    Vehicle(int currentVelocity, double direction, String ownerName) {
        this.carId = Vehicle.getVehicleId();
        this.currentVelocity = currentVelocity;
        this.direction = direction;
        this.ownerName = ownerName;
        Vehicle.VEHICLE_ID = Vehicle.getVehicleId() + 1;
    }

    public static void initVehicleId(){
        Vehicle.VEHICLE_ID = 0;
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

    public static int getVehicleId() {
        return VEHICLE_ID;
    }
}
