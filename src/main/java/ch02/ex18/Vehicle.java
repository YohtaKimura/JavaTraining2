package ch02.ex18;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

final public class Vehicle {
    final static int VEHCLE_ID = 0;
    final static String TURN_LEFT = "left";
    final static String TURN_RIGHT ="right";

    final private int carId;
    private int currentVelocity;
    private double direction;
    private String ownerName;

    public static void main(String[] args) {
       List<String> ownerList = Arrays.asList(args);
       List<Vehicle> vehicleList = new ArrayList<>();
       for (String owner: ownerList) {
           vehicleList.add(new Vehicle(owner));
       }
       for (Vehicle vehicle: vehicleList) {
           print(System.out, vehicle.toString());
       }
    }

    public static void print(PrintStream out, String str) {
        out.println(str);
    }

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

    private void setDirection(double direction) {
        this.direction = direction;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // 引数として回転する角度を受け取るメソッド
    public void turn(double direction) {
        setDirection(direction);
    }

    // 引数として定数を受け取るメソッド
    public void turn(String direction) {
        if (Objects.equals(direction, Vehicle.TURN_LEFT)) {
            setDirection(-90);
        }
        if (Objects.equals(direction, Vehicle.TURN_RIGHT)){
            setDirection(90);
        }
    }

    @Override
    public String toString() {
        return getOwnerName() + "'s car  can run in " + getCurrentVelocity() + " km/h." + "CarId is " + getCarId() + ". VehcleId is " + getVehcleId() + ".";
    }
}
