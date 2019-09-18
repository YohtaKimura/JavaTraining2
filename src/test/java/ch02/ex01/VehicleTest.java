package ch02.ex01;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {
    @Test
    public void currentVelocity() throws Exception {
        Vehicle myVehicle = new Vehicle(50, 30, "john");
        Assert.assertEquals(50, myVehicle.getCurrentVelocity());
    }
    @Test
    public void direction() throws Exception {
        Vehicle myVehicle = new Vehicle(50, 30, "john");
        Assert.assertEquals(30, myVehicle.getDirection(), 1);
    }
    @Test
    public void ownerName() throws Exception {
        Vehicle myVehicle = new Vehicle(50, 30, "john");
        Assert.assertEquals("john", myVehicle.getOwnerName());
    }
}