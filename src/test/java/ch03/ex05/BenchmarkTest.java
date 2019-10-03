package ch03.ex05;

import org.junit.Assert;
import org.junit.Test;

public class BenchmarkTest {
    @Test
    public void getNumberOfPassenger() throws Exception {
        final Benchmark b = new Benchmark() {
            @Override
            void benchmark() {
            }
        };

        Assert.assertNotNull(b.repeat(0));
    }
}