package ch02.ex15;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class VehicleTest {
    @Test
    public void stop() {
        Vehicle v1 = new Vehicle(50, 30, "john");
        v1.stop();
        Assert.assertEquals(0, v1.getCurrentVelocity());
    }

    @Test
    public void changeSpeed() {
        Vehicle v1 = new Vehicle(50, 30, "john");
        v1.changeSpeed(20);
        Assert.assertEquals(20, v1.getCurrentVelocity());
    }

    @Test
    public void setOwnerName() {
        Vehicle v1 = new Vehicle(50, 30, "john");
        v1.setOwnerName("Bob");
        Assert.assertEquals("Bob", v1.getOwnerName());
    }

    @Test
    public void setDirection() {
        Vehicle v1 = new Vehicle(50, 30, "john");
        v1.setDirection(20);
        Assert.assertEquals(20, v1.getDirection(), 0.9);
    }

    @Test
    public void setCurrentVelocity() {
        Vehicle v1 = new Vehicle(50, 30, "john");
        v1.setCurrentVelocity(20);
        Assert.assertEquals(20, v1.getCurrentVelocity());
    }

    @Test
    public void toStringTest() throws Exception {
        Vehicle.initVehicleId();
        Vehicle v1 = new Vehicle(50, 30, "john");
        Assert.assertEquals("john's car can run in 50 km/h. CarId is 0. Next vehicleId is 1.", v1.toString());
    }

    @Test
    public void maxVehicleId() throws Exception {
        Vehicle.initVehicleId();
        Vehicle.initVehicleIdList();
        Vehicle v1 = new Vehicle(50, 30, "john");
        Vehicle v2 = new Vehicle(50, 30, "Tom");
        Assert.assertEquals(1, Vehicle.getMaxVehicleId());
    }

    @Test
    public void makeCars() throws Exception {
        List<String> ownerList = new ArrayList<>();
        ownerList.add("honda");
        ownerList.add("matsuda");
        List<Vehicle> carList = Vehicle.makeCarList(ownerList);
        Assert.assertEquals("honda", carList.get(0).getOwnerName());
        Assert.assertEquals("matsuda", carList.get(1).getOwnerName());
    }

    @Test
    public void vehicleIdTest() throws Exception {
        Vehicle.initVehicleId();
        Vehicle v1 = new Vehicle(50, 30, "john");
        Vehicle v2 = new Vehicle(50, 30, "Tom");
        Assert.assertEquals(2, Vehicle.getVehicleId());
    }

    @Test
    public void currentVelocity() throws Exception {
        Vehicle myVehicle = new Vehicle(50, 30, "john");
        Assert.assertEquals(50, myVehicle.getCurrentVelocity());
    }
    @Test
    public void direction() throws Exception {
        Vehicle myVehicle = new Vehicle(50,30, "john");
        Assert.assertEquals(30, myVehicle.getDirection(), 1);
    }
    @Test
    public void ownerName() throws Exception {
        Vehicle myVehicle = new Vehicle(50, 30, "john");
        Assert.assertEquals("john", myVehicle.getOwnerName());
    }
    @Test
    public void carId() throws Exception {
        Vehicle.initVehicleId();
        Vehicle myVehicle = new Vehicle(50, 30, "john");
        Assert.assertEquals(0, myVehicle.getCarId());
    }
    @Test
    public void vehicleId() throws Exception {
        Vehicle.initVehicleId();
        Assert.assertEquals(0, Vehicle.getVehicleId());
    }
}
