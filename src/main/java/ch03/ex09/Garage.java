package ch03.ex09;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

class Garage implements Cloneable {
    Vehicle[] storedVehicles;

    // Test in main method
    @Test
    public static void main(String[] args) throws Exception {
        final Garage g1 = new Garage();
        Vehicle v1 = new Vehicle(0, 0, "kimura");
        Vehicle[] vs1 = new Vehicle[]{v1};
        g1.setStoredVehicles(vs1);
        Garage g2 = g1.clone();
        Vehicle v3 = new Vehicle(0, 0, "katoh");
        Vehicle[] vs2 = new Vehicle[]{v3};
        g2.setStoredVehicles(vs2);
        Assert.assertNotEquals(g1.getStoredVehicles(), g2.getStoredVehicles());
    }

    private Garage() {
    }

    @Override
    public Garage clone() throws CloneNotSupportedException {
        Garage clone = (Garage) super.clone();
        Vehicle[] originStoredVehicles = this.getStoredVehicles();
        Vehicle[] cloneStoredVehicles = new Vehicle[originStoredVehicles.length];
        Arrays.stream(originStoredVehicles).
                forEach(o -> Arrays.stream(cloneStoredVehicles).forEach(n -> n = o));
        clone.setStoredVehicles(cloneStoredVehicles);
        return clone;
    }

    public void setStoredVehicles(Vehicle[] storedVehicles) {
        this.storedVehicles = storedVehicles;
    }

    public Vehicle[] getStoredVehicles() {
        return this.storedVehicles;
    }
}
