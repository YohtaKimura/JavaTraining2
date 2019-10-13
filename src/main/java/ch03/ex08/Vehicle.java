package ch03.ex08;

import java.io.PrintStream;
import java.util.*;

class Vehicle implements Cloneable {
    // 基本的に private にできるフィールドはした方がいいと思います．
    static private List<Integer> VEHICLE_ID_LIST = new ArrayList<>();
    public static final String TURN_LEFT = "left";
    public static final String TURN_RIGHT = "right";
    static private int VEHICLE_ID = 0;

    private int carId;
    private int currentVelocity;
    private double direction;
    private String ownerName;

    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        final Vehicle clone = (Vehicle) super.clone();
        clone.carId = this.carId + 1;
        return clone;
    }

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

    final public int getCarId() {
        return carId;
    }

    final public int getCurrentVelocity() {
        return currentVelocity;
    }

    final public double getDirection() {
        return direction;
    }

    final public String getOwnerName() {
        return ownerName;
    }

    public void setCurrentVelocity(int velocity ) {
        this.currentVelocity = velocity;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    final public static int getVehicleId() {
        return VEHICLE_ID;
    }

    public void changeSpeed(int speed) {
        setCurrentVelocity(speed);
    }

    public void stop() {
        setCurrentVelocity(0);
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
        if (Objects.equals(direction, Vehicle.TURN_RIGHT)) {
            setDirection(90);
        }
    }

    @Override
    public String toString() {
        return getOwnerName() + "'s car can run in " + getCurrentVelocity() + " km/h. CarId is " + getCarId() + ". Next vehicleId is " + getVehicleId() + ".";
    }
}
