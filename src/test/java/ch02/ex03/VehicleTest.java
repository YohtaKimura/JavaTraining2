package ch02.ex03;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {
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