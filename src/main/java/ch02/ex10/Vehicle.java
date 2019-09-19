package ch02.ex10;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final public class Vehicle {
    static List<Integer> VEHICLE_ID_LIST = new ArrayList<>();
    static int VEHICLE_ID = 0;

    final int carId;
    final int currentVelocity;
    final double direction;
    final String ownerName;

    public Vehicle() {
        this(0, 0, "");
    }

    public Vehicle(String ownerName) {
        this(0, 0, ownerName);
    }

    public Vehicle(int currentVelocity, double direction, String ownerName) {
        this.carId = Vehicle.getVehicleId();
        Vehicle.VEHICLE_ID_LIST.add(Vehicle.getVehicleId());
        this.currentVelocity = currentVelocity;
        this.direction = direction;
        this.ownerName = ownerName;
        Vehicle.VEHICLE_ID = Vehicle.getVehicleId() + 1;
    }

    public static void initVehicleId(){
        Vehicle.VEHICLE_ID = 0;
    }

    public static void initVehicleIdList(){
        Vehicle.VEHICLE_ID_LIST.clear();
    }

    public static int getMaxVehicleId() {
        return Collections.max(Vehicle.VEHICLE_ID_LIST).intValue();
    }

    public static List<Vehicle> makeCarList(List<String> ownerList) {
        List<Vehicle> vehicleList = new ArrayList<>();
        for (String owner: ownerList) {
            vehicleList.add(new Vehicle(owner));
        }
        return vehicleList;
    }

    public static void print(PrintStream out, String str) {
        out.println(str);
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

    @Override
    public String toString() {
        return getOwnerName() + "'s car can run in " + getCurrentVelocity() + " km/h. CarId is " + getCarId() + ". Next vehicleId is " + getVehicleId() + ".";
    }
}

