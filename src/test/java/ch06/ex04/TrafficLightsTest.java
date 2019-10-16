package ch06.ex04;

import org.junit.Assert;
import org.junit.Test;

public class TrafficLightsTest {
    @Test
    public void getColorTest() {
        Assert.assertEquals("GREEN", TrafficLights.GREEN.getColor());
        Assert.assertEquals("YELLOW", TrafficLights.YELLOW.getColor());
        Assert.assertEquals("RED", TrafficLights.RED.getColor());
    }
}