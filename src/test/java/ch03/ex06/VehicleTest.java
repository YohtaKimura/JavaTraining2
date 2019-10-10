package ch03.ex06;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {
    @Test
    public void cannotStartWhenEnergySourceIsGauTank() throws Exception {
        final Vehicle v = new Vehicle();
        Assert.assertEquals(false, v.canStart());
    }
    @Test
    public void canStartWhenEnergySourceIsBattery() throws Exception {
        final Vehicle v = new Vehicle(0,0,"kimura",true);
        Assert.assertEquals(true, v.canStart());
    }
}