package ch02.ex07;

import java.io.PrintStream;

final public class Vehicle {
    public static void main(String[] args) {
        final Vehicle hondaCar = new Vehicle("honda");
        final Vehicle matsudaCar = new Vehicle("matsuda");
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
}
