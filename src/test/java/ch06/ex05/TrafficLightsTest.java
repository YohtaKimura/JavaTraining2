package ch06.ex05;

import org.junit.Assert;
import org.junit.Test;

public class TrafficLightsTest {
    @Test
    public void getColorTest() {
        Assert.assertEquals("GREEN. Let's go.", TrafficLights.GREEN.getColor());
        Assert.assertEquals("YELLOW. Stop, if you can.", TrafficLights.YELLOW.getColor());
        Assert.assertEquals("RED. Stop.", TrafficLights.RED.getColor());
    }
}