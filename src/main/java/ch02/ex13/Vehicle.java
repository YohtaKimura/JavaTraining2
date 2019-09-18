package ch02.ex13;

import java.io.PrintStream;

final public class Vehicle {

    public static void print(PrintStream out, String str) {
        out.println(str);
    }

    final static int VEHCLE_ID = 0;

    final private int carId;
    private int currentVelocity;
    private double direction;
    final private String ownerName;

    public Vehicle() {
        this(0, 0, 0, "");
    }

    public Vehicle(String ownerName) {
        this(0, 0, 0, ownerName);
    }

    public Vehicle(int carId, int currentVelocity, double direction, String ownerName) {
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

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public  void setDirection(double direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return getOwnerName() + "'s car  can run in " + getCurrentVelocity() + " km/h." + "CarId is " + getCarId() + ". VehcleId is " + getVehcleId() + ".";
    }
}
