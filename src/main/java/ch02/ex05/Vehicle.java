package ch02.ex05;

import java.io.PrintStream;

final public class Vehicle {
    public static void main(String[] args) {
        final Vehicle hondaCar = new Vehicle(1,20, 30, "honda");
        final Vehicle matsudaCar = new Vehicle(1, 30, 40, "matsuda");
        print(System.out, hondaCar.getOwnerName());
        print(System.out, matsudaCar.getOwnerName());
    }

    public static void print(PrintStream out, String str) {
        out.println(str);
    }

    final static int VEHCLE_ID = 0;

    final int carId;
    final int currentVelocity;
    final double direction;
    final String ownerName;

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
}
