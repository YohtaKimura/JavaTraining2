package ch02.ex18;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {
    @Test
    public void mainTest() throws Exception {
        Vehicle.main(new String[] {"John","Mike","Bob"});
    }

    @Test
    public void currentVelocity() throws Exception {
        Vehicle myVehicle = new Vehicle(1, 50, 30, "john");
        Assert.assertEquals(50, myVehicle.getCurrentVelocity());
    }
    @Test
    public void direction() throws Exception {
        Vehicle myVehicle = new Vehicle(1, 50,30, "john");
        Assert.assertEquals(30, myVehicle.getDirection(), 1);
    }
    @Test
    public void ownerName() throws Exception {
        Vehicle myVehicle = new Vehicle(1,50, 30, "john");
        Assert.assertEquals("john", myVehicle.getOwnerName());
    }
    @Test
    public void carId() throws Exception {
        Vehicle myVehicle = new Vehicle(1,50, 30, "john");
        Assert.assertEquals(1, myVehicle.getCarId());
    }
    @Test
    public void vehicleId() throws Exception {
        Assert.assertEquals(0, Vehicle.getVehcleId());
    }
}