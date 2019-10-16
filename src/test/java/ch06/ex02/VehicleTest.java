package ch06.ex02;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {
    @Test
    public void turnConst() {
        Vehicle v1 = new Vehicle(50, 30, "john");
        v1.turn(TurnDirection.TURN_LEFT);
        Assert.assertEquals(-90, v1.getDirection(), 0.9);
        v1.turn(TurnDirection.TURN_RIGHT);
        Assert.assertEquals(90, v1.getDirection(), 0.9);
    }
}